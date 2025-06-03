
public class BubbleSort {

    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping using XOR
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr; // Return the sorted array
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        int sorted[] = bubbleSort(arr); // Store the returned array

        for (int index = 0; index < sorted.length; index++) {
            System.out.print(sorted[index] + " ");
        }
    }
}
