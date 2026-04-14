from Arrays.Kadanes.kadanes_longestSubarray import max_subarray


def read_input() -> list[int]:
    raw = input("Enter space-separated integers: ").strip()
    
    if not raw:
        return []

    try:
        return list(map(int, raw.split()))
    except ValueError:
        print("Invalid input. Please enter only integers.")
        return []


def main():
    nums = read_input()

    if not nums:
        print("Array cannot be empty.")
        return

    max_subarray(nums)

 


if __name__ == "__main__":
    main()