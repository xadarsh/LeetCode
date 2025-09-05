class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        k=k%length;
        reverse(nums,0,length-k-1);
        reverse(nums,length-k,length-1);
        reverse(nums,0,length-1);
    }
    public void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}