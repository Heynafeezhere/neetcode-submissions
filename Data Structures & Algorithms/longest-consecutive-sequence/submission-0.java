class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int out = 0;
        for(int i : nums){
            set.add(i);
        } 
        for(int i : nums){
            if(!set.contains(i-1)){
                int count = 1;
                while(set.contains(i+1)){
                    i++;
                    count++;
                }
                if(count>out) out = count;
            }
        }
        return out;
    }
}
