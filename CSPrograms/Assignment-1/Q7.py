if __name__ == "__main__":
    print("Enter the the numbers in a single line (separated by space) for array: ")
    entries = list(map(int, input().split()))
    entries.sort()
    print(f"Missing numbers from {entries}")
    for num in range(len(entries)):
        if (num+1) != entries[num]:
            print(num+1)
            break