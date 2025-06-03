import java.util.Scanner;

public class secondLastMax {
    public static void main(String[] args) {

        int no1;
        int no2;
        int no3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no 1");
        no1 = sc.nextInt();

        System.out.println("Enter no 1");
        no2 = sc.nextInt();

        System.out.println("Enter no 1");
        no3 = sc.nextInt();
        sc.close();
        System.out.println("The Second last Max no is ");

        if (no1 > no2 && no1 > no3) {
            if (no2 > no3) {
                System.out.println(no2);
            }
        } else if (no2 > no1 && no2 > no3) {
            if (no1 > no3) {
                System.out.println(no1);
            } else {
                System.out.println(no3);
            }
        } else {
            if (no1 > no2) {
                System.out.println(no1);
            } else {
                System.out.println(no2);
            }
        }

    }
}
