class Solution {
    private class WordItem { 
        String word;
        int distance;
        public WordItem(String word, int distance) {
            this.word = word;
            this.distance = distance;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> hashSet = new HashSet<>(wordList);
        if(!hashSet.contains(endWord)) return 0;
        Queue<WordItem> queue = new ArrayDeque<>();
        queue.add(new WordItem(beginWord,1));
        Set<String> visitedStrings = new HashSet<>();

        while(!queue.isEmpty()) {
            int currentQueueSize = queue.size();

            for(int i=0; i<currentQueueSize;i++) {
                WordItem currentWordItem = queue.poll();
                String currentWord = currentWordItem.word;
                int distance = currentWordItem.distance;
                if(endWord.equals(currentWord)) return distance;

                List<String> possibleNextWords = getNextWords(currentWord,hashSet,visitedStrings);
                for(String nextWord : possibleNextWords) {
                    if(visitedStrings.contains(nextWord)) continue;
                    visitedStrings.add(nextWord);
                    queue.add(new WordItem(nextWord, distance+1));
                }
            }
         }
         return 0;
    }

    private List<String> getNextWords(String currentWord, Set<String> hashSet, Set<String> visitedStrings) {
        List<String> nextWordList = new ArrayList<>();
        for(String word : hashSet) {
            if(!visitedStrings.contains(word)) {
                if(getDiffBetweenWords(currentWord, word)==1) {
                    nextWordList.add(word);
                }
            }
        }
        return nextWordList;
    }

    private int getDiffBetweenWords(String currentWord, String wordInSet) {
        if(currentWord.length()!=wordInSet.length()) 
            return 0;
        int diff = 0;
        for(int i=0; i<currentWord.length();i++) {
            if(currentWord.charAt(i)!=wordInSet.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }
}