class largest {

    public static int largestNum(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i]; 
            }
            if (smallest > arr[i]) {
                smallest = arr[i]; 
            }
        }
        System.out.println("SMallest is "+ smallest);
        return largest ;
       }

    public static void main(String[] args) { 
        int arr[] = {5, 2, 6, 4, 3, 7, 8, 10};

        System.out.println("Largest is " + largestNum(arr)); 
    }
}
