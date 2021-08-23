if __name__ == "__main__":
    n = int(input("Enter the size of array  "))
    arr = [0] * n
    for i in range(n):
        print(f"Enter array element {i + 1} ")
        arr[i] = input()

    print("Current Array")
    print(arr)
    arr2 = []

    for num in arr:
        if num not in arr2:
            arr2.append(num)

    print("New Array")
    print(arr2)

    print('Method 2:')
    print(list(set(arr)))