class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        for(int i = 1; i < triangle.length ; i++) {
            for(int j = 0; j < triangle[i].length ; j++) {

                if(j == 0) {    //left
                    triangle[i][j] += triangle[i-1][j];
                }
                else if(j == i) {   // right
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else {
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
                }

                answer = Math.max(answer, triangle[i][j]);
            }
        }
        
        return answer;
    }
}
