class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freqMap = new HashMap<>();
        boolean result = true;
        
        for(int i = 0; i<magazine.length(); i++) {
            char currentChar = magazine.charAt(i);
            freqMap.put(currentChar, freqMap.getOrDefault(currentChar,0) + 1);
        }
        
        for(int i = 0; i<ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            Integer currentCharFreq = freqMap.getOrDefault(currentChar, 0);
            
            if(currentCharFreq==0) {
                result = false;
                break;
            }

            freqMap.put(currentChar, currentCharFreq - 1);
        }
        return result;
    }
}