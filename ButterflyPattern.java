public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 8; // Number of rows for the pattern

        // Top half of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

      //  Bottom half of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
