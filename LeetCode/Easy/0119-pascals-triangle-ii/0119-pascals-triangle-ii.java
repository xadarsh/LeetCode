class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++)
        {
            list.add(1);
        }
        for(int i=0;i<=rowIndex;i++)
        {
            for(int j=i;j>=0;j--)
            {
                if(j==0 || j==i)
                {
                    list.set(j,1);
                }
                else
                {
                    int sum=list.get(j-1)+list.get(j);
                    list.set(j,sum);
                }
            }
        }
        return list;
    }
}