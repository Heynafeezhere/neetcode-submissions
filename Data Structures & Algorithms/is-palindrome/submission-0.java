class Solution {
    public boolean isPalindrome(String s) {
        char[] sentence = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(start<end && !Character.isLetterOrDigit(sentence[start])){start++;}
            while(start<end && !Character.isLetterOrDigit(sentence[end])){end--;}
            if (Character.toLowerCase(sentence[start]) !=
                Character.toLowerCase(sentence[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
