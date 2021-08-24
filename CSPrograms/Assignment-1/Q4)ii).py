import numpy as np


if __name__ == '__main__':
    r1 = int(input("Enter number of rows for Array 1:   "))
    r2 = int(input("Enter number of rows for Array 2:   "))
    c1 = int(input("Enter number of columns for Array 1:    "))
    c2 = int(input("Enter number of columns for Array 2:    "))
    arr2 = [[0] * c2] * r2
    print("Enter the the numbers in a single line (separated by space) for array 1: ")
    entries1 = list(map(int, input().split()))
    print("Enter the the numbers in a single line (separated by space) for array 2: ")
    entries2 = list(map(int, input().split()))
    arr1 = np.array(entries1).reshape(r1, c1)
    arr2 = np.array(entries2).reshape(r2, c2)
    print("Array 1:")
    print(np.matrix(arr1))
    print("Array 2:")
    print(np.matrix(arr2))
    arr3 = np.matmul(arr1, arr2)
    print("Multiplied matrix(numpy method):    ")
    print(np.matrix(arr3))
    for i in range()