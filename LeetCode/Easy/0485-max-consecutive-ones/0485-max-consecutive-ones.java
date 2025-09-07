class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int right=0;
        int count=0;
        int max=0;
        while(right<nums.length)
        {
            if(nums[right]==1)
            {
                count++;
            }
            else
            {
                max=Math.max(max,count);
                count=0;
            }
            right++;
        }
        return Math.max(max,count);
    }
}