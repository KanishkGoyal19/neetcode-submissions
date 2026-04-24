class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sum_set = {}
        for i, n in enumerate(nums):
            k = target - n
            if k in sum_set:
                return [sum_set[k], i]
            sum_set[n] = i
                
        