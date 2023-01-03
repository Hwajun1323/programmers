class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N)
        val indexMap : MutableMap<Int, Int> = mutableMapOf() 
        val failutrMap : MutableMap<Int, Double> = mutableMapOf() 

        stages.forEach { 
            when(indexMap.containsKey(it)){ 
                true -> indexMap[it] = indexMap.getValue(it) + 1  
                false -> indexMap[it] = 1 
        }
            
        var size = stages.size // 스테이지 통과한 사람들 일단 1단계는 모두니까 !

        for (i in 1..N){
            when(indexMap.containsKey(i)){
                true -> {
                failutrMap[i] = indexMap.getValue(i) / size.toDouble()
                totalSize -= indexMap.getValue(i) // 스테이지 통과한 사람들
                }
                false -> failutrMap[i] = 0.0
            }
        }

        var sub_list = failutrMap.toList().sortedByDescending { (_, value) -> value }
        for (i in 0 until N) answer[i] = sub_list[i].first

        return answer
    }
}
