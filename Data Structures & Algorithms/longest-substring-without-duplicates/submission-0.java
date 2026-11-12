class Solution {
    public int lengthOfLongestSubstring(String s) {
        int out = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i< s.length();i++){
            int temp = 0;
            for(int j = i; j < s.length();j++){
                if(set.contains(s.charAt(j))){
                    set.clear();
                    break;
                }
                else{
                    set.add(s.charAt(j));
                    temp++;
                }
            }  
            if(temp>out) out = temp;         
        }
    return out;
    }
}
