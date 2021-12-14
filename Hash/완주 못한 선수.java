import java.util.*;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashmap = new HashMap<>();      

        for(String p : participant){
            hashmap.put(p, hashmap.getOrDefault(p, 0) + 1);
        }

        for(String c : completion){
            hashmap.put(c, hashmap.get(c)-1);
        }

        for(String key : hashmap.keySet()) { 
            if(hashmap.get(key) != 0) { 
                answer = key; 
                System.out.println(answer); 
                break; 
            }
        }

        return answer;
    }
}
