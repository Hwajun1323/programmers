import java.util.LinkedList; 
import java.util.Queue; 

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); 
        int time = 0, sum = 0;

        for(int truck : truck_weights){
            while(true){
                if(bridge.isEmpty()){             //다리가 비어있을 때
                    bridge.add(truck);
                    sum += truck;
                    time++;
                    break;
                }else if(bridge.size() == bridge_length){ // 다리가 꽉차면 처음 들어온 것이 나옴
                    sum -= bridge.poll();
                }else{
                    if(sum+truck <= weight){
                        bridge.add(truck);
                        sum += truck;
                        time++;
                        break;
                    }else{
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }

        return time+bridge_length;
    }
}