class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=heights.clone();
        int len=heights.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(heights[i]!=arr[i])
                count++;
        }
        return count;
    }
}