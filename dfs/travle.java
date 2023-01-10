import java.util.*;
class Solution {
    StringBuilder sb = new StringBuilder();
    boolean[] isUsed;
    String result = "J";

    public String[] solution(String[][] tickets) {
        isUsed = new boolean[tickets.length];

        sb.append("ICN ");
        dfs(0,"ICN", tickets);

        String[] answer = result.split(" ");

        return answer;
    }

    public void dfs(int count, String start, String[][] tickets) {
        if (count==tickets.length) {
            result = (result.compareTo(sb.toString()) > 0)? sb.toString() : result;
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!isUsed[i] && tickets[i][0].equals(start)) {
                isUsed[i] = true;
                sb.append(tickets[i][1]).append(" ");
                // System.out.println(sb.toString());
                dfs(count+1, tickets[i][1], tickets);
                isUsed[i] = false;
                sb.delete(sb.length()-4, sb.length());
            }
        }
    }
}
