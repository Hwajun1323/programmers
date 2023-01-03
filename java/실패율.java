import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {

        int[] check = new int[N]; 
        double[] rate = new double[N]; 
        int[] answer = new int[N];
        
        // make histogram
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    check[i]++;
                }
            }
        }
        
         // fail rate
        int denominator = stages.length;
        for (int i = 0; i < check.length; i++) {
            int numerator = check[i];
            if (denominator == 0) {
                rate[i] = 0;
            } else {
                rate[i] = (double) numerator / denominator;
            }
            denominator -= check[i];
        }
        
        double max = 0;
        int target = 1;
        for (int i = 0; i < rate.length; i++) {
            max = rate[0];
            target = 1;
            for (int j = 0; j < rate.length; j++) {
                if (rate[j] > max) {
                    max = rate[j];
                    target = j + 1;
                }
            }
            rate[target - 1] = -1;
            answer[i] = target;
        }

        
        return answer;
    }
}
