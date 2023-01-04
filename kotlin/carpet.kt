class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        var w: Int  // weidth of Yellow
        var h: Int  // height of Yellow
        
        // finding w, h combination
        for (i in 1..yellow){
            if(yellow%i == 0){
                var tmpW = yellow/i
                var tmpH = i
                if(tmpW >= tmpH && 4 + 2 * (tmpW + tmpH) -brown == 0){
                    w = tmpW
                    h = tmpH
                    answer = intArrayOf(w+2,h+2)
                }
            }
        }    
        return answer
    }
}
