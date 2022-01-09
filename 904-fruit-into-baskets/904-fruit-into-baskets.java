class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();
        int windowStart = 0, result = 0;
        
        for(int windowEnd = 0 ; windowEnd < fruits.length; windowEnd++) {
            int currentFruit = fruits[windowEnd];
            map.put(currentFruit, map.getOrDefault(currentFruit, 0) + 1);
            
            while(map.size() > 2) {
                int startingFruit = fruits[windowStart];
                map.put(startingFruit, map.get(startingFruit) -1);
                
                if(map.get(startingFruit) == 0) map.remove(startingFruit);
                
                ++windowStart;
            }
            result = Integer.max(result, windowEnd - windowStart + 1);
        }
        return result;
    }
}
    
