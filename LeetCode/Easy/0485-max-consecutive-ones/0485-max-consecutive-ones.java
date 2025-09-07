class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // if(nums.length<2)
        // {
        //     return nums[0];
        // }
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
                if(max<count)
                    max=count;
                count=0;
            }
            right++;
        }
        return (max<count)? count:max;
    }
}