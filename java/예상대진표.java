class Solution {
    public static int solution(int n, int a, int b) {
        int round = 1;

        while (Math.abs(a - b) != 1 || a / 2 == b / 2) {
            a = nextNumber(a);
            b = nextNumber(b);
            round++;
        }

        return round;
    }

    public static int nextNumber(int x) {
        if (x % 2 == 1) {
            x = x / 2 + 1;
        } else {
            x /= 2;
        }
        return x;
    }

}
