class Solution:
    def insertAtEnd(self, arr, val):
        arr.append(val)
        return arr


def main():
    # Read array size
    n = int(input("Enter number of elements: "))

    # Read array elements
    arr = list(map(int, input(f"Enter {n} elements: ").split()))

    # Read value to insert
    val = int(input("Enter value to insert: "))

    # Create object and call method
    obj = Solution()
    result = obj.insertAtEnd(arr, val)

    # Print updated array
    print("Updated array:")
    print(*result)
4

if __name__ == "__main__":
    main()