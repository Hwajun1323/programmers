class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        int[] day = new int[speeds.length];

        // 1. 더 해야 할 진도 수 구하기
        // 2. 남은 진도를 speeds로 나누어 몫 구하기
        for(int i=0; i<progresses.length; i++){
            day[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0){
                day[i] += 1;
            }

            if (!q.isEmpty() && q.peek() < day[i]) {    // peek : 큐의 데이터 읽기
                answerList.add(q.size());
                q.clear();
            }
            q.offer(day[i]);    //객체를 저장
        }

        answerList.add(q.size());
        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}