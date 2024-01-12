class Solution {
    private int result;
    private Map<Integer, Integer> hashMap;
    public int totalFruit(int[] fruits) {
	int windowStart =0, result = 0;
	hashMap = new HashMap<>();
	
	for(int windowEnd=0; windowEnd<fruits.length;windowEnd++) {
		hashMap.put(fruits[windowEnd], hashMap.getOrDefault(fruits[windowEnd],0) +1);
		
		while(hashMap.size()>2) {
			int currentFruitCount = hashMap.getOrDefault(fruits[windowStart],0);
			if(currentFruitCount == 1) {
				hashMap.remove(fruits[windowStart]);
} else {
hashMap.put(fruits[windowStart], currentFruitCount-1);	
}
++windowStart;
} // while loop
result = Math.max(result, windowEnd-windowStart+1);
} // for loop
return result;
    }
}
