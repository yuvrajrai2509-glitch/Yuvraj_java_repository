class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int[] freq = new int[100001];

        long sum = 0;
        long maxSum = 0;
        int distinct = 0;

        // First k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];

            if (freq[nums[i]] == 0) {
                distinct++;
            }

            freq[nums[i]]++;
        }

        // First window is valid only if all are distinct
        if (distinct == k) {
            maxSum = sum;
        }

        // Sliding window
        for (int j = k; j < nums.length; j++) {

            // Add new element
            sum += nums[j];

            if (freq[nums[j]] == 0) {
                distinct++;
            }

            freq[nums[j]]++;

            // Remove old element
            int remove = nums[j - k];

            sum -= remove;
            freq[remove]--;

            if (freq[remove] == 0) {
                distinct--;
            }

            // Check distinct
            if (distinct == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
      