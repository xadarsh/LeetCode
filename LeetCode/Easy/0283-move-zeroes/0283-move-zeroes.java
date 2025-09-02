class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<2)
        {
            return;
        }
        int left=0;
        int right=1;

        while(right<nums.length)
        {
            if( nums[left]==0 && nums[right]!=0)
            {
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;

                    left++;
                    right++;
            }
            else if(nums[left]==0 && nums[right]==0)
            {
                right++;
            }
            else if(nums[right]==0 && nums[left]!=0)
            {
                right++;
                left++;
            }
            else 
            {
                right++;
                left++;
            }
                
        }
    }
}