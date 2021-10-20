import numpy as np

def transpose_matrix(r1, c1):
    print("Enter the the numbers in a single line (separated by spaces) for array: ")
    entries1 = list(map(int, input().split()))
    final_arr = []
    x = 0
    for j in range(r1):
        list1 = []
        for i in range(x, c1+x):
            list1.append(entries1[i])
        x = x + c1
        final_arr.append(list1)

    transpose_arr = []
    for j in range(c1):
        list1 = []
        for i in range(r1):
            list1.append(final_arr[i][j])
        transpose_arr.append(list1)

    print("Original array:")
    print(np.matrix(final_arr))
    print("Transposed array:")
    print(np.matrix(transpose_arr))



def tranpose_numpy(r1, c1):
    print("Enter the the numbers in a single line (separated by space) for array: ")
    entries = list(map(int, input().split()))
    arr1 = np.array(entries).reshape(r1, c1)
    arr2 = np.transpose(arr1)
    print("Original array:")
    print(np.matrix(arr1))
    print("Transposed array:")
    print(np.matrix(arr2))


if __name__=="__main__":
    r = int(input("Enter number of rows for Array:   "))
    c = int(input("Enter number of columns for Array :    "))
    n = int(input("Press 1 for logical, press 2 for numpy and 3 for both:  "))
    if n == 1:
        transpose_matrix(r, c)
    elif n == 2:
        tranpose_numpy(r, c)
    else:
        transpose_matrix(r, c)
        tranpose_numpy(r, c)