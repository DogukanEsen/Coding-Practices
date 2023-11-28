class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length,count = 0;
        for(int i=0;i<n;i++){
            int j = i;
            while(j<n && nums[i]==nums[j]){
                j++;
            }
            nums[count++] = nums[i];
            i = j - 1;
        }
        return count; 
    }
}
