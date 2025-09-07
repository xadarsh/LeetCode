class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                if(count>max)
                    max=count;
                count=0;
            }
        }
        return (count>max)?count:max;
    }
}