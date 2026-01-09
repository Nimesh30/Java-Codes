
import java.util.ArrayList;

public class ArrayListMultiDim {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        mainList.add(list1);
        mainList.add(list2);

        // Using For loop
        // for (int i = 0; i < mainList.size(); i++) {
        //     ArrayList<Integer> current = mainList.get(i);
        //     for (int j = 0; j < current.size(); j++) {
        //         System.out.print(current.get(j));
        //     }
        //     System.out.println();
        // }
        // Usin ForEach loop
        for (ArrayList<Integer> current : mainList) {
            for (int i = 0; i < current.size(); i++) {
                System.out.print(current.get(i));
            }
            System.out.println();
        }

        // System.out.println(mainList);
    }
}
