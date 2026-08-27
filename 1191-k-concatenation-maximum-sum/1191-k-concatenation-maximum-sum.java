class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long mod = 1_000_000_007;

        long totalSum = 0;
        long current = 0;
        long maxSubarray = 0;

        // Kadane + total sum
        for (int num : arr) {
            totalSum += num;

            current = Math.max(0, current + num);
            maxSubarray = Math.max(maxSubarray, current);
        }

        // If k == 1, only one copy exists
        if (k == 1) {
            return (int)(maxSubarray % mod);
        }

        // Maximum prefix sum
        long prefix = 0;
        long maxPrefix = 0;

        for (int num : arr) {
            prefix += num;
            maxPrefix = Math.max(maxPrefix, prefix);
        }

        // Maximum suffix sum
        long suffix = 0;
        long maxSuffix = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            suffix += arr[i];
            maxSuffix = Math.max(maxSuffix, suffix);
        }

        long answer;

        if (totalSum > 0) {
            answer = maxSuffix + maxPrefix + (long)(k - 2) * totalSum;
        } else {
            answer = maxSuffix + maxPrefix;
        }

        // maxSubarray can be better than the crossing case
        answer = Math.max(answer, maxSubarray);

        return (int)(answer % mod);
    }
}