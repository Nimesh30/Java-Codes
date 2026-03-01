import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        int left = 0;
        int right = list.size()-1;

        while(left<right){
            String temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }

        System.out.println("Reversed list is "+ list);

        list.iterator().forEachRemaining(x->System.out.println(x));
    }
}
