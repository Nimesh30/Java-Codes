
// public class subMaxSum {
//     public static void subMaxSum(int arr[]) {
//         int maxSum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += arr[k];
//                     // System.out.print(arr[k]+ " ");
//                 }
//                 // System.out.println();
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         System.out.println("Max Sum is " + maxSum);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2, 4, 6, 8, 10};
//         subMaxSum(arr);
//     }
// }
//Time complexity - O(n3)



// better approach
public class SubMaxSum {

    public static void subMaxSum(int arr[]) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Max Subarray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        subMaxSum(arr);
    }
}

// Time complexity - O(n)
// Space complexity - O(1)

