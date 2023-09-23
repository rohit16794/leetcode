class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> resultList = new ArrayList<>();
        for(int digit : digits) {
          resultList.add(digit);
        }
        int listSize = resultList.size();
        int index = listSize - 1;
        int lastDigit = resultList.get(listSize - 1);
        int carry = 0;
        if(lastDigit != 9) {
            resultList.set(listSize - 1, lastDigit + 1);
        } else {
            while(index >=0) {
                if(resultList.get(index) == 9) {
                    resultList.set(index, 0);
                    carry = 1;
                } else {
                    resultList.set(index, resultList.get(index) + carry);
                    break;
                }
                --index;
            }
        }
        if(resultList.get(0) == 0) {
            resultList.add(0, 1);
        }
        int resultArray[] = new int [resultList.size()];

        for(int i = 0; i < resultList.size(); i ++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}