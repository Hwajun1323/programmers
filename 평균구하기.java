class Solution {
    public double solution(int[] arr) {
        
        int sum = 0;
        double avg = 0f;
        
        if (arr == null){
            return 0;
        }
        
        int length = arr.length;
        for (int i = 0; i < length; i++) {
			sum += arr[i];
		}
        avg = sum / (double) arr.length;
        
        return avg;
    }
}
