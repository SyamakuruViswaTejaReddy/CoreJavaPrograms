public class EnumDemo {
    // Enum for days of the week
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Using the enum
        Day today = Day.WEDNESDAY;

        // Displaying the current day
        System.out.println("Today is: " + today);

        // Using switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular weekday.");
                break;
        }
    }
}
