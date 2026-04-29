class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int min = 0;
        String maxString = "";
        if (word1.length() >= word2.length()) {
            max = word1.length();
            min = word2.length();

            maxString = word1;
        }
        else {
            max = word2.length();
            min = word1.length();

            maxString = word2;
        }

        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        for (int i = min; i < max; i++) {
            sb.append(maxString.charAt(i));
        }
    
        return sb.toString();
    }
}