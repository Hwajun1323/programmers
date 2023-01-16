import java.util.*;

class Solution {
    public int[] solution(int n, int s) {        
        int quotient = s / n;
        int remainder = s % n;

        if (quotient > 0) {
            int[] answer = new int[n];
            for (int i = 0; i < n; i++) {
                if (n - remainder == i) {
                    quotient++;
                } 
                answer[i] = quotient;
            }

            return answer;
        }

        return new int[]{-1};
    }
}
