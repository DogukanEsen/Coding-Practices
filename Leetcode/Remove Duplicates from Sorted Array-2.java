class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return nums.length;
        }

        int uniqueNumbers = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[uniqueNumbers] = nums[i];
                uniqueNumbers++;
            }
        }
    return uniqueNumbers;
    }
}