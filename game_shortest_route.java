import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps[0].length;
        int m = maps.length;
        // bfs
        int[][] visited = new int[m][n];
         visited[0][0] = 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        
        while(!queue.isEmpty()){
            int[] q = queue.poll(); 
            
            System.out.println("start");
            for(int i=0; i<q.length; i++){
                System.out.println("i"+i);
                System.out.println(q[i]);
            }
            System.out.println("end");
            
            if(q[0] == m-1 && q[1] == n-1) {
                return visited[m-1][n-1];
            }
            
            if(q[0]+1 < m && maps[q[0]+1][q[1]] == 1 && visited[q[0]+1][q[1]] == 0) {
                queue.add(new int[] {q[0]+1, q[1]});
                visited[q[0]+1][q[1]] += visited[q[0]][q[1]] + 1;
            }
            
            if(q[0] > 0 && maps[q[0]-1][q[1]] == 1 && visited[q[0]-1][q[1]] == 0) {
                queue.add(new int[] {q[0]-1, q[1]});
                visited[q[0]-1][q[1]] += visited[q[0]][q[1]] + 1;
            }
            
            if(q[1]+1 < n && maps[q[0]][q[1]+1] == 1 && visited[q[0]][q[1]+1] == 0) {
                queue.add(new int[] {q[0], q[1]+1});
                visited[q[0]][q[1]+1] += visited[q[0]][q[1]] + 1;
            }
            
            if(q[1] > 0 && maps[q[0]][q[1]-1] == 1 && visited[q[0]][q[1]-1] == 0) {
                queue.add(new int[] {q[0], q[1]-1});
                visited[q[0]][q[1]-1] += visited[q[0]][q[1]] + 1;
            }
        }

        return -1;
    }
}
