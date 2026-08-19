class Solution {
    public int reverse(int x) {
        int a = 0;

        while (x != 0) {
            int digit = x % 10;

            if (a > 214748364 || 
                (a == 214748364 && digit > 7)) {
                return 0;
            }

            if (a < -214748364 || 
                (a == -214748364 && digit < -8)) {
                return 0;
            }

            a = a * 10 + digit;
            x = x / 10;
        }

        return a;
    }
}