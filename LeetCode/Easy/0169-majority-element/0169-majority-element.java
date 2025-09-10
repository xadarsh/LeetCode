class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len= nums.length;

        for(int i=0;i<len;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int maxFre=0;
        int maxCount=0;
        for(int i:map.keySet())
        {
            if(map.get(i) > maxFre)
            {
                maxCount=i;
                maxFre=map.get(i);
            }
        }

        return maxCount;
    }
}