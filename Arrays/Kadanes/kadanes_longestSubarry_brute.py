#Brute Force Approach to find the maximum sum of a contiguous subarray in an array of integers


def bruteForce(nums):
    maxSum = nums[0]

    for i in range(len(nums)):
        curSum = 0
        for j in range(i, len(nums)):
            curSum += nums[j]
            maxSum = max(maxSum, curSum)
    return maxSum