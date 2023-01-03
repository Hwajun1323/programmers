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
            
        var size = stages.size 
        for (i in 1..N){
            when(indexMap.containsKey(i)){
                true -> {
                failutrMap[i] = indexMap.getValue(i) / size.toDouble()
                totalSize -= indexMap.getValue(i) 
                }
                false -> failutrMap[i] = 0.0
            }
        }

        var sub_list = failutrMap.toList().sortedByDescending { (_, value) -> value }
        for (i in 0 until N) answer[i] = sub_list[i].first

        return answer
    }
}
