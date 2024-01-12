class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0, result = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char currentChar = s.charAt(windowEnd);
            charFreqMap.put(currentChar, charFreqMap.getOrDefault(currentChar,0)+1);
            while (charFreqMap.getOrDefault(currentChar, 0) > 1) {
                char outGoingChar = s.charAt(windowStart);
                int outGoingCharFreq = charFreqMap.get(outGoingChar);
                charFreqMap.put(outGoingChar, Math.max(0, outGoingCharFreq - 1));
                windowStart++;
            }
            result = Math.max(result, windowEnd - windowStart + 1);
        }
        return result;
    }
}