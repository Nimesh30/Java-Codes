
public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int j = arr.length - 1;
        for (int i = 0; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 8, 4, 2};
        reverseArray(arr);
        System.out.println("Reversed Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
