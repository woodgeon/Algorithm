class Solution {
    public String solution(int[] numLog) {
        StringBuilder stb = new StringBuilder();
        String answer = "";
        for(int i = 1; i < numLog.length; i++) {
            int temp = numLog[i - 1];
            if(numLog[i] == temp + 1)
                stb.append("w");
            else if(numLog[i] == temp - 1)
                stb.append("s");
            else if(numLog[i] == temp + 10)
                stb.append("d");
            else if(numLog[i] == temp - 10)
                stb.append("a");
        }
        answer = stb.toString();
        return answer;
    }
}