class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int[] positive=new int[len/2];
        int[] negative=new int[len/2];
        int pindex=0,nindex=0;

        for(int i=0;i<len;i++)
        {
            if(nums[i]>0)
                positive[pindex++]=nums[i];
            else
                negative[nindex++]=nums[i];
        }
        pindex=0;
        nindex=0;
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
                nums[i]=positive[pindex++];
            else
                nums[i]=negative[nindex++];
        }      
        return nums;
    }
}