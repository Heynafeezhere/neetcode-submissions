class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] out = new int[size];

        int prefix = 1;
        //prefix products
        for(int i=0;i<size;i++){
            out[i] = prefix;
            prefix *= nums[i];
        } 
        
        int suffix = 1;
        //suffix products
        for(int i=size-1 ; i>=0;i--){
            out[i] *= suffix;
            suffix *= nums[i]; 
        }
        return out;
    }
}  
