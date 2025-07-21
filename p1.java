class solution{
    public static void main(String[] args){
       int[] nums = {7,5,31,4};  
       System.out.println(largestElement(nums));
    }

    public static int largestElement(int[] nums) {   
    int max = nums[0];
    for(int i = 0; i < nums.length; i++){
        if(nums[i] > max){
            max  =  nums[i];
        }
    }
    
    return max;   
    }
}