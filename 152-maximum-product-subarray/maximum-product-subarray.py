from typing import List

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        curMax = curMin = ans = nums[0]

        for i in range(1, len(nums)):
            x = nums[i]

            temp = curMax
            curMax = max(x, x * curMax, x * curMin)
            curMin = min(x, x * temp, x * curMin)

            ans = max(ans, curMax)

        return ans