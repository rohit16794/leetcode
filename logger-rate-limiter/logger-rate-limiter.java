class Logger {
    
    private Map<String, Integer> logMessageFreqMap;

    public Logger() {
        logMessageFreqMap = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(logMessageFreqMap.get(message) == null) {
            logMessageFreqMap.put(message, timestamp);
            return true;
        } else {
            int currentTimeStamp = logMessageFreqMap.get(message);
            if(timestamp - currentTimeStamp >= 10) {
                logMessageFreqMap.put(message, timestamp);
                return true;
            } else {
                return false;
            }
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */