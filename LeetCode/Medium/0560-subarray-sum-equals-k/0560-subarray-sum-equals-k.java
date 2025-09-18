class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int count = 0, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(sum,1);

        for(int num: nums)
        {
            sum+=num;
            if(hm.containsKey(sum-k))
                count+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}