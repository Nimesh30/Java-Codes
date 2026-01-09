
import java.util.ArrayList;
import java.util.Scanner;

public class ALMultiDim {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements you want to add in 1st List ");
        int l1  = sc.nextInt();

        for (int i = 1; i <=l1; i++) {
            System.out.println("Enter "+i+" element ");
            list1.add(sc.nextInt()*1);
            
        }

        System.out.println(list1);

        System.out.println("How many elements you want to add in 2nd List ");
        int l2  = sc.nextInt();

        for (int i = 1; i <=l2; i++) {
            System.out.println("Enter "+i+" element ");
            list2.add(sc.nextInt()*2);
            
        }

        System.out.println(list2);

        System.out.println("How many elements you want to add in 3rd List ");
        int l3  = sc.nextInt();

        for (int i = 1; i <=l3; i++) {
            System.out.println("Enter "+i+" element ");
            list3.add(sc.nextInt()*3);
            
        }

        System.out.println(list3);
        
        
        
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        
        System.out.println(mainList);
    }
}
