class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowStart = 0,charsMatched = 0;
        Map<Character,Integer> freqMap = new HashMap<>();
        
        for(char c:s1.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
            
       for(int windowEnd = 0; windowEnd<s2.length(); windowEnd++) {
           char currentChar = s2.charAt(windowEnd);
       
           while(windowEnd - windowStart + 1 > s1.length()) {
               char leftChar = s2.charAt(windowStart++);
               if(freqMap.containsKey(leftChar)) {
                   
                   if(freqMap.get(leftChar) == 0) --charsMatched;
                   
                   freqMap.put(leftChar, freqMap.get(leftChar) + 1);
               }
           } // while loop
           
           if(freqMap.containsKey(currentChar)) {
               freqMap.put(currentChar, freqMap.get(currentChar) - 1);
               
               if(freqMap.get(currentChar) == 0) {
                   ++charsMatched;
               }
           }
           if(charsMatched == freqMap.size()) return true;
       } //  for loop 
        return false;
    }
}
