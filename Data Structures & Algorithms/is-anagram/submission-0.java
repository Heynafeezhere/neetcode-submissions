class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char tempS = s.charAt(i);
            if(countS.containsKey(tempS)){
                countS.put(tempS,countS.get(tempS)+1);
            }else{
                countS.put(tempS,1);
            }

            char tempT = t.charAt(i);
            if(countT.containsKey(tempT)){
                countT.put(tempT,countT.get(tempT)+1);
            }else{
                countT.put(tempT,1);
            }
        }
        return countS.equals(countT);
    }
}
