import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        // Hello world
        String reverseString = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            reverseString += s1.charAt(i);
        }

        System.out.println("Original String : " + s1);
        System.out.println("Reversed String : " + reverseString);
    }
}
