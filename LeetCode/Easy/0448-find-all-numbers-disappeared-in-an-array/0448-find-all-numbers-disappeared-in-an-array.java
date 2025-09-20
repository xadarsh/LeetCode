class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int len=nums.length;
        for(int i=1;i<=len;i++)
            result.add(i);
        for(int i=0;i<len;i++)
            result.set(nums[i]-1,0);
        for(int i=len-1;i>=0;i--)
        {
            if(result.get(i)==0)
                result.remove(i);
        }
        return result;

    }
}