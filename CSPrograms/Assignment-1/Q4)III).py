import numpy as np


if __name__ == "__main__":
    r = int(input("Enter number of rows for Array:   "))
    c = int(input("Enter number of columns for Array :    "))
    print("Enter the the numbers in a single line (separated by space) for array: ")
    entries = list(map(int, input().split()))
    arr1 = np.array(entries).reshape(r, c)
    arr2 = np.transpose(arr1)
    print("Original array:")
    print(np.matrix(arr1))
    print("Transposed array:")
    print(np.matrix(arr2))
