class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0, result = 0;
        
        for(int windowEnd = 0; windowEnd <s.length(); windowEnd++) {
            char currentCharacter = s.charAt(windowEnd);
            map.put(currentCharacter, map.getOrDefault(currentCharacter, 0) + 1);

            while(map.size() > k) {
                char startingChar = s.charAt(windowStart);
                map.put(startingChar, map.get(startingChar) - 1);
                
                if(map.get(startingChar) == 0) map.remove(startingChar);
                
                ++windowStart;
            }
            result = Integer.max(result, windowEnd - windowStart + 1);
        }
        return result;
    }
}