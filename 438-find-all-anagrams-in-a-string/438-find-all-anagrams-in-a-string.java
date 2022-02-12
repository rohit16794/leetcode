class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        int windowStart = 0, charsMatched = 0;
        
        for(char c : p.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }
        
        for(int windowEnd = 0; windowEnd <s.length(); windowEnd++) {
            char leftChar = s.charAt(windowEnd);
            
            while(windowEnd - windowStart + 1 > p.length()) {
                char rightChar = s.charAt(windowStart++);
                
                if(freqMap.containsKey(rightChar)) {
                    if(freqMap.get(rightChar)==0) --charsMatched;
                    freqMap.put(rightChar, freqMap.get(rightChar) + 1);
                }
            }
            if(freqMap.containsKey(leftChar)) {
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                
                if(freqMap.get(leftChar) == 0) ++charsMatched;
            }
            
            if(charsMatched == freqMap.size()) result.add(windowStart);
        }
        return result;
    }
}