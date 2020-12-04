import java.time.LocalTime;

public class Time {

    String words[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine", };

    public static void main(String[] args) {
        Time time = new Time();
        time.write(LocalTime.parse(args[0]));
    }

    public void write(LocalTime time) {

        int hour = time.getHour();
        int minutes = time.getMinute();

        switch (minutes) {
            case 0:
                System.out.println(words[hour] + " o' clock ");
                break;
            case 1:
                System.out.println("one minute past " + words[hour]);
                break;
            case 59:
                System.out.println("one minute to " + words[(hour % 12) + 1]);
                break;
            case 15:
                System.out.println("quarter past " + words[hour]);
                break;
            case 30:
                System.out.println("half past " + words[hour]);
                break;
            case 45:
                System.out.println("quarter to " + words[(hour % 12) + 1]);
                break;

            default:
                if (minutes <= 30) {
                    System.out.println(words[minutes] + " minutes past " + words[hour]);

                } else if (minutes > 30) {
                    System.out.println(words[60 - minutes] + " minutes to " + words[(hour % 12) + 1]);
                }
                break;
        }

    }

}