class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> charFreqMap = new HashMap<>();
        int windowStart=0, result = 0;

        for(int windowEnd=0; windowEnd<s.length(); windowEnd++) {
	        char currentChar = s.charAt(windowEnd);
            charFreqMap.put(currentChar, charFreqMap.getOrDefault(currentChar,0)+1);

            while(charFreqMap.size() > 2) {
	            char outGoingChar = s.charAt(windowStart);
	            charFreqMap.put(outGoingChar, charFreqMap.get(outGoingChar)-1);
	            if(charFreqMap.get(outGoingChar)==0) {
		            charFreqMap.remove(outGoingChar);
                }
                ++windowStart;
            } // while loop end
            result = Math.max(result, windowEnd-windowStart+1);
        } // for loop end
	    return result;
    } // func end
}

