class RotateArrayByK {

    public static void rotateArray(int a[], int k) {

        int n = a.length;

        for (int r = 1; r <= k; r++) { // repeat 3 times means k time

            int last = a[n - 1]; // store last element

            // transfer all elements one step to right
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }

            a[0] = last; // put last element on first
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotateArray(arr, k);
    }
}