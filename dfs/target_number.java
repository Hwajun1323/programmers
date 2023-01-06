class Solution {
    static int result = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return result;
    }

    private static void dfs(int index, int[] num, int target, int sum) {
        if(index == num.length) {
            if(target == sum) {
                result++;
            }
            return;
        }
        dfs(index + 1, num, target, sum + num[index]);
        dfs(index + 1, num, target, sum - num[index]);
    }
}
