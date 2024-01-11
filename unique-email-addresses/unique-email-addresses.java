class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String, Boolean> emailIdMap = new HashMap<>();
        for(String email : emails) {
            String[] emailComponentList = email.split("@");
            String userName = emailComponentList[0];
            StringBuilder str = new StringBuilder();

            for(int i=0;i<userName.length();i++) {
                char currentChar = userName.charAt(i);
                if(currentChar!='.' && currentChar!='+') {
                    str.append(currentChar);
                }
                if(currentChar=='+') break;
            }
            str.append("@");
            str.append(emailComponentList[1]);
            emailIdMap.put(str.toString(), true);
        }
        System.out.println(emailIdMap);
        return emailIdMap.size();
    }
}