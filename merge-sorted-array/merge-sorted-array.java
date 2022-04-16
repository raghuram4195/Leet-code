class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)
        {
           for(int i=0;i<n;i++)
           {
               nums1[i] = nums2[i];
           }
            return;
        }
        else if(n==0)
        {
            return;
        }
        
        int tempm=0;
        int tempn=0;
        int[] arr = new int[m+n];
        for(int i=0;i<m+n;i++)
        {
            if(tempm==m)
            {
                for(int j=tempn;j<n;j++)
                {
                    arr[i] = nums2[j];
                    i++;
                }
                break;
            }
            else if(tempn==n)
            {
                for(int j=tempm;j<m;j++)
                {
                    arr[i] = nums1[j];
                    i++;
                }
                break;
            }
            
            if(nums1[tempm]>nums2[tempn])
            {
                arr[i] = nums2[tempn];
                tempn++;
            }
            else
            {
                arr[i] = nums1[tempm];
                tempm++;
            }
        }
        for(int i=0;i<m+n;i++)
        {
            nums1[i] = arr[i];
        }
        return;
    }
}