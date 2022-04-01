class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar=='[' || currentChar=='{' || currentChar=='(') 
                stack.push(currentChar);
            else {
                if(!stack.empty() &&charMap.get(currentChar) == stack.peek())
                    stack.pop();
                else return false;
            }
        }
        return stack.empty()?true:false;
    }
}