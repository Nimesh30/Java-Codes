public class pattern_11 {
 public static void main(String[] args) {
    
    int n =5;
    int nums=1;

    for (int i = 1; i <=n; i++) {
        
        for (int j = 1; j <=i; j++) {
            System.out.print((nums/10==0) ? "  " + nums : " " + nums);
            nums++;
        }
        System.out.println();
    }
 }   
}
