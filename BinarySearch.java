
public class BinarySearch {

    public static int binarySearch(int nums[],int key) {

        int low = 0;
        int high = nums.length;
        
       while(low <high){
        int mid =(low+high)/2;
            if(nums[mid] == key){
                return mid;
            }else if(nums[mid]<key){
                low = mid + 1;
            }else{
                high = mid-1;
            }
       }
       return -1;
    }

    public static void main(String[] args) {
        int nums[] = {12, 4, 12, 8, 10, 12, 14};
        int key = 12;
        System.out.println("Number index is " + binarySearch(nums,key));
    }
}
