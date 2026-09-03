class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);

        List<Integer>[] freq = new List[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int key : map.keySet()){
            freq[map.get(key)].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i=freq.length-1; i>=0 ; i--){
                for(int n : freq[i]){
                    result[index++] = n;
                    if(index == k) return result;
            }
        }
        return result;

    }
}
