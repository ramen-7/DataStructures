if __name__ == '__main__':
    n = int(input("Enter size of array: "))
    arr = [0] * n
    arr2 = [0] * n
    x = n-1
    for i in range(n):
        arr[i] = input(f"Enter element {i+1}: ")
        arr2[x] = arr[i]
        x = x - 1

    print("Original")
    print(arr)
    print("Reversed")
    print(arr2)



