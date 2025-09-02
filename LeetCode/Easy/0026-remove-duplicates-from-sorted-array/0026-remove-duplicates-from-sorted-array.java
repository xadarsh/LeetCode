class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2)
            return nums.length;
        int count=1;
        int left=0;
        int right=left+1;

        while(right<nums.length)
        {
            if(nums[right]==nums[left])
            {
                right++;
            }
            else
            {
                nums[++left]=nums[right++];
                count++;
            }
        }
        return count;
    }
}