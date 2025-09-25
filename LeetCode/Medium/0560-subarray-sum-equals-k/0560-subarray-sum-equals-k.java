class Solution {
    public int subarraySum(int[] nums, int k) {
        int len=nums.length;
        int sum=0,count=0;

        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);

        for(int i:nums)
        {
            sum+=i;
            if(hm.containsKey(sum-k))
                count+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}