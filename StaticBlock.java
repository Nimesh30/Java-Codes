import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Hacker rank problem
public class StaticBlock {

        static int B;
        static int H;
        static boolean flag=true;
        static {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter B : ");
            B = sc.nextInt();
            System.out.println("Enter H : ");
            H = sc.nextInt();

            if (B <= 0 || H <= 0) {
                flag = false;
                System.out.println("Breadth and height must be positive");
            }
        }
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }
    }




