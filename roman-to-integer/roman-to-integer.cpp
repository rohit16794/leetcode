class Solution {
public:
    int romanToInt(string s) {
        map<char,int> romanToIntegerMap =  getRomanToIntegerMap() ;
        int result = romanToIntegerMap[s[s.length()-1]];
        
        for(int i = s.length()-2; i>=0;i--) {
            if(romanToIntegerMap[s[i]]>=romanToIntegerMap[s[i+1]])
                result +=romanToIntegerMap[s[i]];
            else
                result -=romanToIntegerMap[s[i]];
        }
        
        return result;
    }
    private:
    map<char,int> getRomanToIntegerMap() {
        map<char,int> romanToIntegerMap;
        romanToIntegerMap.insert(pair<char, int>('I', 1));
        romanToIntegerMap.insert(pair<char, int>('V', 5));
        romanToIntegerMap.insert(pair<char, int>('X', 10));
        romanToIntegerMap.insert(pair<char, int>('L', 50));
        romanToIntegerMap.insert(pair<char, int>('C', 100));
        romanToIntegerMap.insert(pair<char, int>('D', 500));
        romanToIntegerMap.insert(pair<char, int>('M', 1000));
        
        return romanToIntegerMap;
    }
};