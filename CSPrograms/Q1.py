if __name__ == "__main__":
    print("""——MENU——- 
            1.CREATE
            2.DISPLAY
            3.INSERT
            4.DELETE
            5.SEARCH
            6.EXIT""")
    c = 0
    list1 = []
    while c != 6:
        c = int(input("Enter a number:  "))
        if c != 6:
            if c == 1:
                s = int(input("Enter array size:    "))
                for i in range(s):
                    t = input("Enter a value:   ")
                    list1.append(t)
                print("Array created")
                print(list1)
            elif c == 2:
                print("The array is as follows")
                print(list1)

            elif c == 3:
                x = input("Enter value that needs to be inserted    ")
                p = int(input("Enter the position at which the value needs to be inserted   "))
                list1.insert(p-1, x)

            elif c == 4:
                x = input("Enter value that needs to be deleted ")
                list1.remove(x)

            elif c == 5:
                x = input("Enter value that needs to be searched    ")
                y = list1.index(x)
                if y > -1:
                    print(f"Value at {y+1}")
                else:
                    print("Value not found")
            else:
                print("Enter a valid value")

