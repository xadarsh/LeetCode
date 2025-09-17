class Solution {
    public int thirdMax(int[] nums) {
        int len=nums.length;
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;

        for(int i=0;i<len;i++)
        {
            if(nums[i]>first)
            {
                third=second;
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second && nums[i]<first)
            {
                third=second;
                second=nums[i];
            }
            else if(nums[i]>third && nums[i]<second)
                third=nums[i];
        }
        if(third==Long.MIN_VALUE)
            return (int)first;
        return (int) third;
    }
}