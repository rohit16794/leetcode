class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int result = -1;
        
        for(int i = 0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);
        }
        
        for(int i = 0; i<s.length(); i++) {
           if(freqMap.get(s.charAt(i)) == 1) { 
               result = i; 
               break;
           }
        }
        return result;
    }
}