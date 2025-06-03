import java.util.Scanner;

public class DecimalToBinary {

    int DecToBinary(int DecNum){
        int ans =0;
        int pow =1;

        while (DecNum > 0) {

            int rem =DecNum%2; 
            DecNum=DecNum/2;
            ans += (rem*pow);
            pow =pow*10;  
        }
    return ans;
}

    int BinaryToDec(int BinaryNum){
         
        int ans =0, pow =1;
        while(BinaryNum > 0){

            int rem =BinaryNum % 2;
            ans += (rem * pow);
            BinaryNum/=10;
            pow = pow *2;   
        }
        return ans;
    }
    public static void main(String[] args) {
        // int DecNum = 8;
        DecimalToBinary D = new DecimalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int DecNum = sc.nextInt();
        System.out.println(D.BinaryToDec(DecNum));
        sc.close();

        // System.out.println("THe Binary of 1 to " + DecNum);
        // for (int i = 1; i <=DecNum; i++) {
            
        //     System.out.println(i +" -> "+D.DecToBinary(i));
        // }

    }
}
