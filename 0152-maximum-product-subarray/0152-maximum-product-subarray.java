class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // Save old maxProd before updating it
            int tempMax = Math.max(current, Math.max(maxProd * current, minProd * current));
            int tempMin = Math.min(current, Math.min(maxProd * current, minProd * current));

            maxProd = tempMax;
            minProd = tempMin;

            result = Math.max(result, maxProd);
        }

        return result;
    }
}