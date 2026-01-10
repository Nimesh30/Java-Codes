
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Find Maximun using ArrayList
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many element you want to add : ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " elements ");
            for (int i = 0; i < n; i++) {

                list.add(sc.nextInt());

            }
        }
        // int max =Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {

            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));

        }

        System.out.println("Max element is  " + max);
    }
}

