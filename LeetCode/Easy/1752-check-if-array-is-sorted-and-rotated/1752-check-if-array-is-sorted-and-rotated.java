class Solution {
    public boolean check(int[] b) {
        int edge=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]>b[(i+1)%b.length])
                edge++;
        }

        return edge<=1;

    }
}