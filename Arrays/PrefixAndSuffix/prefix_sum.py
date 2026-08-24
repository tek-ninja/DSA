arr = [1,2,3,4,5]
prefix = [0]*len(arr)

prefix[0] = arr[0]

for i in range(1,len(arr)):
    prefix[i] = arr[i]+prefix[i-1]

print(prefix)