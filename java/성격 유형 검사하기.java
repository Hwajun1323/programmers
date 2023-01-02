class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int R = 0;
        int T = 0;
        
        int C = 0;
        int F = 0;
        
        int J = 0;
        int M = 0;
        
        int A = 0;
        int N = 0;
        
        for(int i=0; i<survey.length; i++){
            String type = survey[i];
            int point = choices[i];
            switch(type) {
                case "RT": 
                    T+=(point-4);
                     break;
                case "TR": 
                    R+=(point-4);
                     break;
                case "CF":
                    F+=(point-4);
                    break;
                case "FC":
                    C+=(point-4);
                    break;
                case "JM":
                    M+=(point-4);
                    break;
                case "MJ":
                    J+=(point-4);
                    break;
                case "AN":
                    N+=(point-4);
                    break;
                case "NA":
                    A+=(point-4);
                    break;
                default: 
                     break;
            }
        }
        
        if(T <= R) answer += "R";
        else answer += "T";

        if(F <= C) answer += "C";
        else answer += "F";

        if(M <= J) answer += "J";
        else answer += "M";

        if(N <= A) answer += "A";
        else answer += "N";
        
        return answer;
    }
}
