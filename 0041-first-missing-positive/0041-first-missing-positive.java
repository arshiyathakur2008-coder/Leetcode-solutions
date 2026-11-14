
class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;

        // Step 1: Place numbers at their correct positions
        while (i < n) {

            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= n
                    && nums[i] != nums[correctIndex]) {

                // Swap the numbers
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } else {
                i++;
            }
        }

        // Step 2: Find the first missing positive number
        for (int j = 0; j < n; j++) {

            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // Step 3: If all numbers are correct
        return n + 1;
    }
}
