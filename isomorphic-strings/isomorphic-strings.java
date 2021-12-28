class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> charMapping = new HashMap<>();
        Set<Character> mappedCharSet = new HashSet<>();
        
        for(int i = 0 ; i < s.length(); i++) {
            char firstStringChar = s.charAt(i);
            char secondStringChar = t.charAt(i);

            if(!charMapping.containsKey(firstStringChar)) {
                charMapping.put(firstStringChar, secondStringChar);
                
                if(mappedCharSet.contains(secondStringChar)) return false;
                else mappedCharSet.add(secondStringChar);

            } else if(charMapping.get(firstStringChar)!=secondStringChar) return false;
        }
        return true;
    }
}