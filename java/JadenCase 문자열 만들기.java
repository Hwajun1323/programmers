import java.util.*;

class Solution {
    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.startsWith(" ")) {
                sb.append(str);
                continue;
            }
            if (isStartWithNumber(str)) {
                sb.append(str.charAt(0));
            } else if (isStartWithLowerAlpha(str)) {
                sb.append((char)(str.charAt(0) - 32));
            } else{
                sb.append(str.charAt(0));
            }
            sb.append(str.substring(1).toLowerCase());
        }

        return sb.toString();
    }

    private static boolean isStartWithLowerAlpha(String str) {
        return str.charAt(0) >= 'a' && str.charAt(0) <= 'z';
    }

    private static boolean isStartWithNumber(String str) {
        return str.charAt(0) >= '0' && str.charAt(0) <= '9';
    }
}

// class Solution {
//  public String solution(String s) {
//        String answer = "";
//        String[] sp = s.toLowerCase().split("");
//        boolean flag = true;
//
//        for(String ss : sp) {
//            answer += flag ? ss.toUpperCase() : ss;
//            flag = ss.equals(" ") ? true : false;
//        }
//
//        return answer;
//  }
//}
