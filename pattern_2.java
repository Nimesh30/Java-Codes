
public class pattern_2 {

    public static void main(String[] args) {

        int n = 5;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i+1;j++){
        //         System.out.print(j);
        //     }
        //    for (int j = i; j >0; j--) {
        //         System.out.print(j);
        //    }
        //    System.out.println();
        // }
        // 11111
        //  2222
        //   333
        //    44
        //     5
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
