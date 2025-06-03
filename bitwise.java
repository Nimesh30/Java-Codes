public class bitwise {
    public static void main(String[] args) {
        
                        // 1 0 1 0
                        //   1 1 0
        System.out.println(6 & 10); //both sohuld be same = 1 otherwise = 0
        System.out.println(6 | 10); //one of them 1 then 1 otherwise 0
        System.out.println(6 ^ 10); // Both sare same then 0 otherwise 1
        System.out.println();
        System.out.println(4 << 1); //go to left by one position
        System.out.println(4 << 2); //go to left by two position
        System.out.println(4 << 3); // third
        System.out.println(10 >> 1); // forth position
    }
}
