class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
            int ss=0;
        if(len1>len2)
        {
        ss=len2;
            }
        else
        {
            ss=len1;
        }
        int arr[] = new int[ss];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n=0;
        int k=0;
        if(len1<len2)
        {
            int temp[] = new int[len2];
            for(int i=0;i<len2;i++)
                temp[i]=1;
            for(int i=0;i<len1;i++)
            {
                for(int j=0;j<len2;j++)
                {
                   if(nums1[i]==nums2[j] && temp[j]==1)
                    {
                        arr[n] = nums1[i];
                       temp[j]=0;
                        n++;
                        break;
                    } 
                }
                
            }
        }
        else
        {
            int temp[] = new int[len1];
            for(int i=0;i<len1;i++)
                temp[i]=1;
            for(int i=0;i<len2;i++)
            {
                for(int j=0;j<len1;j++)
                {
                   if(nums1[j]==nums2[i] && temp[j]==1)
                    {
                        arr[n] = nums2[i];
                       temp[j]=0;
                        n++;
                        break;
                    } 
                }
                
            }
        }
        return Arrays.copyOfRange(arr,0,n);
    }
}