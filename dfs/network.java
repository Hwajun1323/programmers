class Solution {
    static int[] ch; 
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        ch = new int[n];
        for(int i=0; i<n;i++){
            if(ch[i]==0){
                 DFS(i, ch, computers);
                answer++;
            }
        }
        return answer;
    }
    
    private static void DFS(int i, int[] ch, int[][] computers) {
        ch[i] = 1;
        for(int j=0; j<computers.length; j++) {
            if(i !=j && computers[i][j] == 1 && ch[j] == 0){
                DFS(j, ch, computers);
            }
        }
    }
}
