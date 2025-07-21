import java.util.Arrays;

class insertionSortRecursion{
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 5};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] nums, int size){
        
        if (size <= 1) {
            return;
        }
        sort(nums, size-1);
        int lastNumber = nums[size-1];
        int index = size-2;
        while(index >= 0 && nums[index] > lastNumber ){
            nums[index + 1] = nums[index]; 
            index--;
        }
        nums[index + 1] = lastNumber;
        return;
    }
}   
