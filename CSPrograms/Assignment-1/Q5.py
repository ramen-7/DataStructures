def BinarySearch(entries, n):
    entries.sort()
    print(entries)
    lower = 0
    upper = len(entries) - 1
    while lower <= upper:
        mid = (lower + upper) // 2
        if entries[mid] == n:
            return mid
        elif entries[mid] > n:
            upper = mid - 1
        elif entries[mid] < n:
            lower = mid + 1
    return -1


if __name__ == "__main__":
    print("Enter the the numbers in a single line (separated by space) for array: ")
    list1 = list(map(int, input().split()))
    s = int(input("Enter the number to be searched:"))
    res = BinarySearch(list1, s)
    if res != -1:
        print(f"{s} was found at position {res + 1}")
    else:
        print(f"{s} was not found in array")