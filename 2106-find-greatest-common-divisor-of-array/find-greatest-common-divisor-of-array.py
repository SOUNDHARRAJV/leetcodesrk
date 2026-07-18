class Solution(object):
    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

    def findGCD(self, nums):
        return self.gcd(min(nums), max(nums))