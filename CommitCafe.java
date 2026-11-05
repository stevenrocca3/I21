public class CommitCafe {

    private static String barista = "Steven"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String nickname = "Steve";

    private static int cups = 0;

    public static void brew(String drink) {

        cups++;
        System.out.println(barista + " brewed " + drink + ". Practicing Caffeine-Driven Development (CDD).");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}