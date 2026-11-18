// LeetCode 258 - Add Digits
class LC258_AddDigits_Easy {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}
