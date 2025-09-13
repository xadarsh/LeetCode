class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len=nums.length;
        int even=0;
        int odd=1;
        while(even<len && odd<len)
        {
           if(nums[even]%2!=0)
           {
                if(nums[odd]%2==0)
                {
                    swap(even,odd,nums);
                    even+=2;
                }
                odd+=2;
           }
           else
            even+=2;
        }
        return nums;
    }
    public static void swap(int first,int second,int[] nums)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}