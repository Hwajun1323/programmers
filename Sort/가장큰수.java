import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        // convert int to String
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }
        // sort "610" vs "106"
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if(result[0].equals("0")) {
            return "0";
        }
        for (String a : result) {
            //System.out.printf("test : "+ a);
            answer += a;
        }

        return answer;
    }
}
