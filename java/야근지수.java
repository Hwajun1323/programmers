import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int work : works) queue.offer(work);

        for (int i = 0; i < n; i++) {
            int work = queue.poll();

            if (work == 0)
                break;
            else
                queue.offer(work - 1);
        }


        for (int sub : queue) answer += Math.pow(sub, 2);

        return answer;
    }
}
