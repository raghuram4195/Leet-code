class Solution {
    private static void searchPair(int[] arr, int targetSum, int left, List<List<Integer>> triplets) {
    int right = arr.length - 1;
    while (left < right) {
      int currentSum = arr[left] + arr[right];
      if (currentSum == targetSum) { // found the triplet
        triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
        left++;
        right--;
        while (left < right && arr[left] == arr[left - 1])
          left++; // skip same element to avoid duplicate triplets
        while (left < right && arr[right] == arr[right + 1])
          right--; // skip same element to avoid duplicate triplets
      } else if (targetSum > currentSum)
        left++; // we need a pair with a bigger sum
      else
        right--; // we need a pair with a smaller sum
    }
  }
    public List<List<Integer>> threeSum(int[] arr) {
//         List<Integer> lt = new ArrayList<>();
//         List<List<Integer>> res = new ArrayList<>();
//         List<Integer> temp;
//         //Arrays.sort(nums);
//         int n = nums.length;
//         for(int i=0;i<n;i++)
//         {
//             int target = -1 * nums[i];
//             for(int j=0;j<n;j++)
//             {
//                 if(j==i)
//                     continue;
//                 if(lt.contains(target - nums[j]) )
//                 {
//                     temp = new ArrayList<>();
//                     int[] kk = new int[3];
//                     kk[0] = nums[i];
//                     kk[1] = nums[j];
//                     kk[2] = target - nums[j];
//                     Arrays.sort(kk);
//                     temp.add(kk[0]);
//                     temp.add(kk[1]);
//                     temp.add(kk[2]);
                    

                    
//                     if(res.contains(temp))
//                     {
//                         continue;
//                     }
//                     res.add(temp);
//                 }
                
//                 lt.add(nums[j]);
//             }
//             lt.clear();
//         }
//         return res;
        
        
        
        
            Arrays.sort(arr);
    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < arr.length - 2; i++) {
      if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
        continue;
      searchPair(arr, -arr[i], i + 1, triplets);
    }

    return triplets;
    }
}