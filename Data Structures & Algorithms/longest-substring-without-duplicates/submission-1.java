class Solution {
    public int lengthOfLongestSubstring(String s) {
        int out = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        for(int r = 0 ; r < s.length(); r++){
            char rightChar = s.charAt(r);
            while(set.contains(rightChar)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(rightChar);
            out = Math.max(out, r - l +1);
        }
        return out;
    }
}
