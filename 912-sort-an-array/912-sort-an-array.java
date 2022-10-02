class Solution {
    public static void merge(int[] arr, int left, int mid, int right)
    {
        int i,j,k;
        int leftsize = mid - left +1;
        int rightsize = right - mid;
        
        int[] leftarr = new int[leftsize];
        int[] rightarr = new int[rightsize];
        
        for( i=0;i<leftsize;i++)
        {
            leftarr[i] = arr[left+i];
        }
        for( j=0;j<rightsize;j++)
            rightarr[j] = arr[mid+j+1];
        
        i=0;
        j=0;
        k=left;
        
        while(i<leftsize && j<rightsize)
        {
            if(leftarr[i]>rightarr[j])
            {
                arr[k] = rightarr[j];
                j++;
            }
            else
            {
                arr[k] = leftarr[i];
                i++;
            }
            k++;
        }
        
        while(i<leftsize)
        {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        
        while(j<rightsize)
        {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
        
    }
    public static void mergesort(int[] arr, int left, int right)
    {
        if(right>left){
            int mid = left + (right - left)/2;
            
            mergesort(arr, left, mid);
            mergesort(arr, mid+1,right);
            
            merge(arr,left,mid,right);
        }
        
        
    }
    public int[] sortArray(int[] nums) {
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]>nums[j])
//                 {
//                     int temp = nums[i];
//                     nums[i]  = nums[j];
//                     nums[j]  = temp;
//                 }
//             }
            
//         }
        
        
        
//         boolean check=false;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums.length-1;j++)
//             {
//                 if(nums[j]>nums[j+1])
//                 {
//                     int temp = nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = temp;
//                     check=true;
//                 }
//             }
//             if(check){
//                 check =false;
//                 continue;
//                 }
//             else
//                 break;
            
//         }
        
        
        // int ele;
        // int j;
        // for(int i=1;i<nums.length;i++)
        // {
        //     ele = nums[i];
        //     j=i-1;
        //     while(j>=0 && nums[j]>ele)
        //     {
        //         nums[j+1] = nums[j];
        //         j=j-1;
        //     }
        //     nums[j+1] = ele;
        // }
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}