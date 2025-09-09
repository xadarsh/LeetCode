class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<2)
        {
            return;
        }
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zero++;
            else if(nums[i]==1)
                one++;
            else
                two++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero-- >0)
                nums[i]=0;
            else if(one-- >0)
                nums[i]=1;
            else if(two-- >0)
                nums[i]=2;
        }
    }
}