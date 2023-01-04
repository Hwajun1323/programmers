import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open = 0;
        int close = 0;
        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')') {
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if (stack.isEmpty()) {
                    stack.push(c);
            }else{
                if(c=='('){
                    stack.push(c);
                }else{
                    if(open == close){
                        stack.pop();
                    }else{
                        stack.push(c);
                    } 
                }
            } 
        }
        return stack.isEmpty() ? true : false;
    }
}

// class Solution {
//     boolean solution(String s) {
//         boolean answer = true;
//         int open = 0;
//         int close = 0;
        
//         if (s.charAt(0) == ')') {
//             return false;
//         }
        
//         String[] sp = s.toLowerCase().split("");
//         //Stack<Character> stack = new Stack<>();
        
//         for(String c : sp){
//             if(c.equals("(")){
//                 open++;
//                 answer = false;
//             }else{
//                 close++;
//                 answer = open == close ? true : false;
//             }
//         }
//         return open == close ? true : false;
//     }
// }
