class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0;
        int end=nums.length-1;
        int k=0;

        while(start<=end)
        {
            if(nums[end]==val)
            {
                end--;
            }
            else if(nums[start]==val)
            {
                swap(start,end,nums);
                start++;
                end--;
                k++;
            }
            else
            {
                start++;
                k++;
            }
        }
        return k;
    }

    public void swap(int start,int end,int[] nums)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}