class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int count=1;
        int len=nums.length;
        int limit=len/3;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<len;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        
        for(int i: hm.keySet())
        {
            if(hm.get(i)>limit)
                list.add(i);
        }
        return list;
    }
}