public class butterfly {
        public static void main(String[] args) {
        int rows = 8; // Adjust the number of rows based on the pattern

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                // Logic to match the pattern
                if (i + j >= rows - 1 && i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Spaces for the empty cells
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
