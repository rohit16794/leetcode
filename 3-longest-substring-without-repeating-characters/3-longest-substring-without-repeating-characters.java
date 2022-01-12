class Solution {
    public int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        int windowStart = 0, result = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < stringLength; windowEnd++) {
            char currentCharacter = s.charAt(windowEnd);
            if(charIndexMap.containsKey(currentCharacter)) {
                windowStart = Math.max(windowStart, charIndexMap.get(currentCharacter) + 1);
            }
            charIndexMap.put(currentCharacter, windowEnd);
            result = Math.max(result, windowEnd - windowStart +1);
        }
        return result;
    }
}