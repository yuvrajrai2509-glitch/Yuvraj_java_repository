class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                long x = nums[j];
                
                // Stop early if prod exceeds the maximum possible value of gcd * lcm
                // Since nums[k] <= 10, max LCM of {1..10} is 2520, and max GCD is 10
                if (prod > 25200 / x) {
                    break;
                }

                prod *= x;
                g = gcd(g, x);
                l = (l * x) / gcd(l, x);

                if (prod == g * l) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
