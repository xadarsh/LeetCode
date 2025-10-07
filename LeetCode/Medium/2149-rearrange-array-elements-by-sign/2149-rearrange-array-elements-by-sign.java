class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int[] result=new int[len];
        int pindex=0,nindex=1;

        for(int i=0;i<len;i++)
        {
            if(nums[i]>0)
            {
                result[pindex]=nums[i];
                pindex+=2;
            }
            else
            {
                result[nindex]=nums[i];
                nindex+=2;
            }
        }
        return result;
    }
}