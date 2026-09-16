class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')','(');
        closeToOpen.put('}','{');
        closeToOpen.put(']','[');

        for(char i : s.toCharArray()){
            if(closeToOpen.containsKey(i)){
                if(!stack.empty() && stack.peek() == closeToOpen.get(i)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(i);
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}
