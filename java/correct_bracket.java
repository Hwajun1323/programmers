import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open = 0;
        int close = 0;
        
        if (s.charAt(0) == ')') {
            return false;
        }
        
        String[] sp = s.toLowerCase().split("");
        //Stack<Character> stack = new Stack<>();
        
        for(String c : sp){
            if(c.equals("(")){
                open++;
                answer = false;
            }else{
                close++;
                answer = open == close ? true : false;
            }
        }
        return open == close ? true : false;
    }
}
