import numpy as np


def mul_matrix_logical(r1, r2, c1, c2):
    print("Enter the the numbers in a single line (separated by spaces) for array1: ")
    entries1 = list(map(int, input().split()))
    arr1 = []
    x = 0
    for j in range(r1):
        list1 = []
        for i in range(x, c1+x):
            list1.append(entries1[i])
        x = x + c1
        arr1.append(list1)

    print("Enter the the numbers in a single line (separated by spaces) for array: ")
    entries2 = list(map(int, input().split()))
    arr2 = []
    x = 0
    for j in range(r2):
        list1 = []
        for i in range(x, c2 + x):
            list1.append(entries2[i])
        x = x + c2
        arr2.append(list1)

    if c1 == r2:
        mul = []
        for i in range(r1):
            list1 = []
            for j in range(c2):
                list1.append(0)
            mul.append(list1)

        mul_arr = []
        for i in range(r1):
            for j in range(c2):
                list2 = []
                mult = int(0)
                for k in range(c1):
                    mult = mult + arr1[i][k] * arr2[k][j]
                    list2.append(mult)
                mul_arr.append(list2)
        print("Multiplied matrices equal:   ")
        print(mul_arr)
    else:
        print("Matrices cannot be multiplied")



def mul_matrix_np(r1, r2, c1, c2):
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


if __name__ == "__main__":
    row1 = int(input("Enter number of rows for Array 1:   "))
    row2 = int(input("Enter number of rows for Array 2:   "))
    col1 = int(input("Enter number of columns for Array 1:    "))
    col2 = int(input("Enter number of columns for Array 2:    "))
    n = input("Press 1 for logical, 2 for numpy and 3 for both")
    if n == 1:
        mul_matrix_logical(row1, row2, col1, col2)
    elif n == 2:
        mul_matrix_np(row1, row2, col1, col2)
    else:
        mul_matrix_logical(row1, row2, col1, col2)
        mul_matrix_np(row1, row2, col1, col2)
