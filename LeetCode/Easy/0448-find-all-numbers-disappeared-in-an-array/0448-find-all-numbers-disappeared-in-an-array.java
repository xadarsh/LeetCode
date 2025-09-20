class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int len=nums.length;
        for(int i=1;i<=len;i++)
            temp.add(i);
        for(int i=0;i<len;i++)
            temp.set(nums[i]-1,0);
        for(int i=0;i<len;i++)
        {
            if(temp.get(i)!=0)
                result.add(temp.get(i));
        }
        return result;

    }
}