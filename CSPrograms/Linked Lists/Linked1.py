class Node:
    def __init__(self, data=None):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = Node()

    def append(self, data):
        new_node = Node(data)
        current_head = self.head
        while current_head.next != None:
            current_head = current_head.next
        current_head.next = new_node

    def length(self):
        current_head = self.head
        total = 0
        while current_head.next != None:
            total += 1
            current_head = current_head.next
        return total

    def display(self):
        elems = []
        current_node = self.head
        while current_node:
            elems.append(current_node.data)
            current_node = current_node.next
        print(elems)

    def get(self, index):
        if index >= self.length():
            print("ERROR: Index out of range!")
            return None
        current_index = 0
        current_node = self.head
        while True:
            current_node = current_node.next
            if current_index == index:
                return current_node.data
            else:
                current_index += 1

    def erase(self, index):
        if index >= self.length():
            print("ERROR: Index out of range!")
            return None
        current_index = 0
        current_node = self.head
        while True:
            last_node = current_node
            current_node = current_node.next
            if current_index == index:
                last_node.next = current_node.next
                return
            current_index += 1

    def prepend(self, data):
        new_node = Node(data)
        current_head = self.head
        new_node.next = current_head.next
        self.head = new_node

    def insert(self, index, data):
        new_node = Node(data)
        current_head = self.head
        if index >= self.length():
            print("ERROR: Index out of range! Use append instead.")
            return None
        current_index = 0
        current_node = self.head
        while True:
            current_node = current_node.next
            if current_index == index - 1:
                B = self.head
                current_node.next = new_node
                print(f"E= {new_node}")
                B.next = new_node.next
                print(f"C = {new_node.next}")
                print(f"C (should be ) = {B.next}")
                return
            else:
                current_index += 1

if __name__ == "__main__":
    my_list = LinkedList()
    my_list.append(1)
    my_list.append(3)
    my_list.append(4)
    my_list.append(2)
    my_list.append(7)
    my_list.append(6)
    print(f"Element at index 2 is {my_list.get(2)}")
    my_list.erase(1)
    my_list.prepend(8)
    my_list.display()
    my_list.insert(2, 9)
    my_list.display()
