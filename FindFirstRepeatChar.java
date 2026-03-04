import java.util.*;

public class FindFirstRepeatChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        Set<String> set = new HashSet<>();
        for(Character c : str.toCharArray()){
            if(set.contains(c.toString())){
                System.out.println(c + " is first repeated");
                break;
            }else{
                set.add(c.toString());
            }
        }
    }
}



