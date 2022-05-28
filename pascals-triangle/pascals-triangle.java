class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lt = new ArrayList<>();
        List<Integer> lt2;
        int[] fin = new int[numRows];
        int[] arr = new int[numRows];
        for(int i=1;i<=numRows;i++)
        {
            lt2 = new ArrayList<>();
            if(i==1)
            {
                lt2.add(1);
                lt.add(lt2);
            }
            else
            {
                for(int j=0;j<i;j++)
                {
                    if(j==(i-1)||j==0)
                        arr[j] = 1;
                    else if(j==(i-2))
                        arr[j] = i - 1;
                    else if(j==1)
                        arr[j] = i - 1;
                    else
                    arr[j] = fin[j] + fin[j - 1];
                }
                for(int j=0;j<i;j++)
                {
                    lt2.add(arr[j]);
                    fin[j] = arr[j];
                    arr[j]=0;
                    
                }
                lt.add(lt2);
            }
        }
        return lt;
        
    }
}