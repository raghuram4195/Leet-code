class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = []
        temp = []
        sum = 0

        for i in range(0,len(nums)):
            if (target - nums[i]) in temp:
                res.append(i)
                
                res.append( nums.index(target-nums[i]))
                return res;
            else:
                temp.append(nums[i])
                
