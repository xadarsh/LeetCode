class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left =0, right = 0 , sum=0;
       int len=nums.length;
        int minLen=Integer.MAX_VALUE;
       while(right<len)
       {
            sum+=nums[right];
            while(sum>=target)
            {
                minLen= Math.min(minLen,right-left+1);
                sum-=nums[left++];
            }
            right++;
       }
       return (minLen!=Integer.MAX_VALUE)? minLen : 0;
    }
}