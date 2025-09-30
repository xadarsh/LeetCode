class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int len=nums.length;
        int limit=len/3;
        
        for(int i=0;i<len;i++)
        {
            if(cnt1==0 && ele2!=nums[i])
            {
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && ele1!=nums[i])
            {
                cnt2=1;
                ele2=nums[i];
            }
            else if(ele1==nums[i])
                cnt1++;
            else if(ele2==nums[i])
                cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i:nums)
        {
            if(i==ele1)
                cnt1++;
            else if(i==ele2)
                cnt2++;
        }
        if(cnt1>limit)
            list.add(ele1);
        if(cnt2>limit)
            list.add(ele2);
        return list;
    }
}