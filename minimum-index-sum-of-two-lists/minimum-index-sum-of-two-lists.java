class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> strIndexMapForList1 = new HashMap<>();
        Map<Integer, List<String>> leastIndexStringMap = new HashMap<>();

        for(int i = 0; i<list1.length; i++) {
            strIndexMapForList1.put(list1[i], i);
        }

        for(int i = 0; i< list2.length; i++) {
            int indexForStringInList1 = strIndexMapForList1.getOrDefault(list2[i], -1);
            if(indexForStringInList1 != -1){
                List<String> currentStrList = leastIndexStringMap.getOrDefault(indexForStringInList1 + i, new ArrayList<String>());
                currentStrList.add(list2[i]);
                leastIndexStringMap.put(indexForStringInList1 + i, currentStrList);
            }
        }
        int leastIndex = 10000000;
        for(int index : leastIndexStringMap.keySet()) {
            if(index <leastIndex) {
                leastIndex = index;
            }
        }
        return leastIndexStringMap.get(leastIndex).stream().toArray(String[] ::new);
    }
}