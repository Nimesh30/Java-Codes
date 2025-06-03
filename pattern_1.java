public class pattern_1 {
    public static void main(String[] args) {
        
        int n=4;

        for(int i=0;i<n;i++){

            for(int k=0;k<i;k++){
                 System.out.print(" ");
            }

            for (int j = 0; j<n-i; j++) {
                System.out.print(i+1);
            }

           
            System.out.println();
        }
    }
}
