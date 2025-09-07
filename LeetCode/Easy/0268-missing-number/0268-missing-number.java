class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        int len=nums.length;
        int total=(len*(len+1))/2;
        if(total-sum>=0)
            return total-sum;
        else
            return len;

    }
}