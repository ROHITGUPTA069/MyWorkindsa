public class beatingBru1 {

    public static void main(String[] args) throws InterruptedException {
        String input = getInput();

        if (input.equalsIgnoreCase("love")) {
            while (true) {
                printHeart(8, "\u001B[31m");  // Red
                Thread.sleep(300);
                clearConsole();

                printHeart(10, "\u001B[35m"); // Purple
                Thread.sleep(300);
                clearConsole();

                printHeart(12, "\u001B[34m"); // Blue
                Thread.sleep(300);
                clearConsole();
            }
        } else {
            System.out.println("what you want my dear, try again.");
        }
    }

    public static void printHeart(int size, String colorCode) {
        String RESET = "\u001B[0m";

        // Top part
        for (int i = size / 2; i <= size; i += 2) {
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(colorCode + "." + RESET);
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(colorCode + "." + RESET);
            }
            System.out.println();
        }

        // Bottom part
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(colorCode + "." + RESET);
            }
            System.out.println();
        }
    }

    public static String getInput() {
        System.out.print("waht are u searching boi: ");
        return new java.util.Scanner(System.in).nextLine().trim();
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
