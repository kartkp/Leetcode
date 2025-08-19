class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int k = nums[0];
        int left = 1, right = 1;

        for (int i = 0; i < n; i++) {

            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[n-1-i];

            k = Math.max(k, Math.max(left, right));
        }

        return k;
    }
}
