class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<String>();
        if(nums.length==0)
            return str;
//         int pre = -1;
//         int i=0;
//         for(i=0;i<nums.length-2;i++)
//         {
//             if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2)
//             {
//                 System.out.println("2-4");
//                 str.add(String.valueOf(nums[i])+"->"+nums[i+2]);
//                 i++;
//             }
//             else if(nums[i+1]==nums[i]+1)
//             {
                
//                 pre=nums[i];
//                 System.out.println("pre"+pre);
//             }
//             else if(pre!=-1)
//             {
//                 System.out.println("4-5");
//                 str.add(String.valueOf(pre)+"->"+nums[i]);
//                 pre = -1;
                
//             }   
//         }
//         System.out.println(i);
        
//         //     if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2)
//         //     {
//         //         str.add(String.valueOf(nums[i])+"->"+nums[i+2]);
//         //         i++;
//         //     }
//         //     else if(nums[i+1]==nums[i]+1)
//         //     {
//         //         pre=nums[i];
//         //     }
//         //     else if(pre!=-1)
//         //     {
//         //         str.add(String.valueOf(pre)+"->"+nums[i]);
//         //         pre = -1;
//         //     }  
//         // i++;
        
        

//             if(pre!=-1&&nums[i]==pre+1)
//             {
//                 str.add(String.valueOf(pre)+"->"+nums[i]);
//                 pre = -1;
//                 i++;
//             } 
//         else if(pre!=-1)
//         {
//             str.add(String.valueOf(pre));
//         }
//         if(i<nums.length-1&&nums[i+1]==nums[i]+1 )
//             {
//                 str.add(String.valueOf(nums[i])+"->"+nums[i+1]);
//                 i++;
//             }
//         else if(i<nums.length)
//         {
//             str.add(String.valueOf(nums[i]));
            
//         }

        
//         System.out.println(i);
//         return str;
        
        
        
        
        int i=0;
        
        // for(i=0;i<nums.length-2;i++)
        // {
        //     if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2)
        //     {
        //         str.add(String.valueOf(nums[i])+"->"+nums[i+2]);
        //         i=i+2;
        //     }
        //     else if(nums[i+1]==nums[i]+1 && nums[i+2]!=nums[i]+2)
        //     {
        //         str.add(String.valueOf(nums[i])+"->"+nums[i+1]);
        //         i++;
        //     }
        //     else
        //         str.add(String.valueOf(nums[i]));
        // }
        // if(i==nums.length-2)
        // {
        //     if(nums[i+1]==nums[i]+1)
        //     str.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[i+1]));
        //     else
        //     {
        //        str.add(String.valueOf(nums[i]));
        //         str.add(String.valueOf(nums[i+1]));
        //     }
        // }
        // else if(i==nums.length-1)
        // {
        //     str.add(String.valueOf(nums[i]));
        // }
        
        for(i=0;i<nums.length;i++)
        {
            int k=i;
            for(k=i;k<nums.length-1;k++)
            {
                if(nums[k]+1!=nums[k+1])
                    break;
            }
            if(i!=k)
            {
                str.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[k]));
            }
            else if(i==k)
            {
                str.add(String.valueOf(nums[i]));
            }
            i=k;
        }
        return str;
    }
}