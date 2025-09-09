class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ref=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(ref.containsKey(comp))
            {
                return new int[]{ref.get(comp),i};
            }

            ref.put(nums[i],i);
        }

        return new int[]{};
    }
}