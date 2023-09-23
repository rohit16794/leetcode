class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        // Adding values for base cases.
        result.add(Collections.unmodifiableList(Arrays.asList(1)));
        if(numRows >1)
        result.add(Collections.unmodifiableList(Arrays.asList(1,1)));
        
        for(int i = 2; i<numRows; i++) {
            List<Integer> previousElement = result.get(i-1);
            List<Integer> currentRowList = new ArrayList<Integer>();
            currentRowList.add(1);

            for(int j = 0; j <previousElement.size()-1; j++) {
                currentRowList.add(previousElement.get(j) + previousElement.get(j+1));
            }

            currentRowList.add(1);

            result.add(currentRowList);
        }

        return result;
    }
}