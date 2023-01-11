class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            int current = prices[i];
            int tmp = 0;
            for(int j=i+1; j<prices.length; j++){
                 if(current <= prices[j]){
                     tmp++;
                 }else{
                     tmp++;
                     break;
                 }
            }
            answer[i]=tmp;
        }
        
        return answer;
    }
}
