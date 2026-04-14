def max_subarray(nums):
    
    """
    Kadane's Algorithm — O(n) time, O(1) space
    """
    if not nums:
        raise ValueError("Input list cannot be empty")
    
    maxSum = nums[0]
    curSum = 0
    maxL, maxR = 0, 0
    L = 0

    for R in range(len(nums)):
        if curSum < 0:
            curSum = 0
            L = R

        curSum += nums[R]
        if curSum > maxSum:
            maxSum = curSum
            maxL, maxR = L, R 

    print(f"Indices={maxL},{maxR}")