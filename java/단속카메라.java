import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
		Arrays.sort(routes, (a,b)-> Integer.compare(a[1], b[1]));      
        int min = Integer.MIN_VALUE;
		for(int[] route : routes) {
			if(min <  route[0] ) {
				min = route[1];
				++answer;
			}
		}
        return answer;
    }
}
