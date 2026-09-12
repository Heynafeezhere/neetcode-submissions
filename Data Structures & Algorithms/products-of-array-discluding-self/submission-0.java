class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] out = new int[size];

        int temp = 1;

        for(int i=0;i<size;i++){
            out[i] = temp;
            temp *= nums[i];
        } 
        
        temp = 1;

        for(int i=size-1 ; i>=0;i--){
            out[i] *= temp;
            temp *= nums[i]; 
        }
        return out;
    }
}  
