def bubbleSort(list1):
    l = len(list1)
    for i in range(l):
        for j in range(0, l-i-1):
            if list1[j] > list1[j+1]:
                list1[j], list1[j+1] = list1[j+1], list1[j]
    print(list1)


if __name__ == "__main__":
    print("Enter the the numbers in a single line (separated by space) for array: ")
    entries = list(map(int, input().split()))
    print("Sorted array:")
    bubbleSort(entries)
