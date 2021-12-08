class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int index = 0;

        int[] student = new int[n];

        for(int i=0; i<student.length; i++){
            student[i] = 1;
        }

        for (int i=0; i<reserve.length; i++){
            index = reserve[i]-1;
            student[index] += 1;
        }

        for (int i=0; i<lost.length; i++){
            index = lost[i]-1;
            student[index] -= 1;
        }

        for(int i=0; i<student.length; i++){
                if(student[i]==0){
                    if((i-1)>=0 && student[i-1]==2){
                        student[i-1] -= 1;
                        student[i] += 1;
                    }else if((i+1) < student.length && student[i+1]==2){
                        student[i]+=1;
                        student[i+1]-=1;
                    }
                }
        }

        for(int i=0; i<student.length; i++){
            if(student[i]>=1){
                answer+=1;
            }
        }

        return answer;
    }
}
