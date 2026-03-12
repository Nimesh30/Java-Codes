import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 6, 5};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }

    //MOve all moveZerosToEnd toEnd end
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // counts non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (count < n) {
            arr[count++] = 0;
        }
    }
    }





