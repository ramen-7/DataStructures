/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;
import java.util.*;
/**
 *
 * @author shvmt
 */
class Node
{   
    int data;
    Node next;
}

class LinkedList
{
    Node head;
    
    public void display()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("List is empty.");
        }
        else
        {
            System.out.println("Nodes of Linked List:   ");
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next; 
            }
            System.out.println();
            //System.out.print(current.data + '\n');
        }
        
    }
    
    public void addAtEnd(int x)
    {
        Node newNode = new Node();
        newNode.data = x;
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = null;//last node's next points to null
        Node current = head;
        while(current.next != null)//traversing list
        {
            current = current.next;
        }
        current.next = newNode;//last node of list points to newnode
    }
    
    public void addAtBeg(int x)
    {
        Node newNode = new Node();//creating a new node
        newNode.data = x;//new node data is x
        newNode.next = head;//new node points to head
        head = newNode;//head points to head
    }
    
    public void posFromHead(int x)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        int t = 0, len = 0;
        while(current.next != null)
        {
           current = current.next;
           len++;
        }
        len++;
        System.out.println("Size of list is " + len);
        current = head; // relocatingc current back to head after size calculation
        while(current.next != null)
        {
            //System.out.println("current.data = " + current.data);
            if(current.data == x)
            {
                System.out.println(x + " was found at position " + (t+1));
                return;
            }
            current = current.next;
            t++;
        }
        if(current.data == x)//for last element
            {
                System.out.println(x + " was found at position " + (t+1));
                return;
            }
        if(len-1 == t)
        {
            System.out.println(x + " was not found in the list.");
        }
    }
    
    public void delBeg()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        head = current.next;
    }
    
    public void delEnd()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        int len = 0;
        Node current_beh = new Node();
        while(current.next != null)
        {
            len++;
            current_beh = current;
            current = current.next;
        }
        current_beh.next = null;
    }
    
    public void delAt(int pos)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        int t = 0, len = 0;
        while(current.next != null)
        {
           current = current.next;
           len++;
        }
        len++;
        System.out.println("Size of list is " + len);
        current = head;
        if(pos > len)
        {
            System.out.println("Index Out of Range");
            return;
        }
        Node current_beh = new Node();
        for(int i = 1; i < pos; i++)
        {
            current_beh = current;
            current = current.next;
        }
        current_beh.next = current.next;
    }
    
    public void addBef(int x, int pos)
    {
        Node newNode = new Node();
        newNode.data = x;
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        int t = 0, len = 0;
        while(current.next != null)
        {
           current = current.next;
           len++;
        }
        len++;
        System.out.println("Size of list is " + len);
        current = head;
        if(pos > len)
        {
            System.out.println("Index Out of Range");
            return;
        }
        Node current_beh = new Node();
        for(int i = 1; i < pos; i++)
        {
            current_beh = current;
            current = current.next;
        }
        current_beh.next = newNode;
        newNode.next = current;
        if(pos == 1)
        {
            addAtBeg(x);
        }
    }
    
    public void addAft(int x, int pos)
    {
        Node newNode = new Node();
        newNode.data = x;
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        int t = 0, len = 0;
        while(current.next != null)
        {
           current = current.next;
           len++;
        }
        len++;
        System.out.println("Size of list is " + len);
        current = head;
        if(pos > len)
        {
            System.out.println("Index Out of Range");
            return;
        }
        Node current_beh = new Node();
        for(int i = 0; i < pos; i++)//STARTS FROM 0 POINTS TO ONE AFTER POS ENTERED
        {
            current_beh = current;
            current = current.next;
        }
        current_beh.next = newNode;
        newNode.next = current;
    } 
    
    public void deleteRep(int x)
    {
        Node current = head;
        Node prev = null;
        int occ = 0;
        //checking if key is not head or values after it
        while(current != null && current.data == x)
        {
            head = current.next;
            current = head;
            occ++;
        }
        while(current.next != null)
        {
            while(current != null && current.data != x)
            {
                prev = current;
                current = current.next;
            }
            //reached the end of the list or key isnt present anymore
            if(current == null)
            {
                System.out.println("No of occurences = " + occ);
                return;
            }
            prev.next = current.next;
            occ++;
            //System.out.println("current.data = " + current.data);
            current = prev.next;
        }
        System.out.println("No of occurences = " + occ);
    }
    
    public int sizeList()
    {
        int size = 0;
        Node current = head;
        if(head == null)
        {
            return size;
        }
        else
        {
            while(current.next != null)
            {
                size++;
                current = current.next;
            }
            size++;
        }
        return size;
    }
    
    public int middleLink()
    {
        Node current = head;
        int size = sizeList();
        System.out.println("Size of linked list is " + size);
        if(size == 0)
        {
            System.out.println("List is empty.");
            return -1;
        }
        else if(size % 2 == 0)
        {
            int n = size/2;
            //System.out.println("n = " + n);
            for(int i = 1; i < n; i++)
            {
                current = current.next;
            }
            current = current.next;
            return current.data;
        }
        else
        {
            int n = size/2;
            //System.out.println("n = " + n);
            for(int i = 1; i <= n; i++)
            {
                current = current.next;
            }
            return current.data;
        }
    }
    
    public void reverseList()
    {
        Node nextNode = null;
        Node current = head;
        Node prev = null;
        while(current.next != null)
        {
            nextNode = current.next;//copy of next
            current.next = prev;//creates the reversal link
            prev = current;//moving ahead for prev
            current = nextNode;//moving ahead in the list
        }
        current.next = prev;//for last element
        prev = current;
        head = prev;
    }
}


public class Q1      
{
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        Scanner Sc = new Scanner(System.in);
        String message = """
                             Press 1.Insertion at beginning
                             Press 2.Insertion at end
                             Press 3.Insertion before position x
                             Press 4.Insertion after position x
                             Press 5.Deletion from beginning
                             Press 6.Deletion from end
                             Press 7.Deletion of node at pos x
                             Press 8.Search for a node and display its position from head
                             Press 9.Display list
                             Press 10.Count occurences of a number and delete it % repetitions
                             Press 11.Find middle of LinkedList
                             Press 12.Size of linked list
                             Press 13.Reverse a linked list
                             Press 14.Reverse to a point
                             Press 15.To Exit
                             """;
        int c = -1;
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(1);
        list.addAtEnd(3);
        while(c != 0)
        {   
            System.out.println(message);
            c = Sc.nextInt();
            if(c == 1)
            {
                System.out.println("Enter value to be entered at beginning.");
                int x = Sc.nextInt();
                list.addAtBeg(x);
            }
            else if(c == 2)
            {
                System.out.println("Enter value to be entered at end.");
                int x = Sc.nextInt();
                list.addAtEnd(x);
            }
            else if(c == 3)
            {
                System.out.println("Enter value to be entered before position x");
                int x = Sc.nextInt();
                System.out.println("Enter the position at which it has to be entered");
                int pos = Sc.nextInt();
                list.addBef(x, pos);
            }
            else if(c == 4)
            {
                System.out.println("Enter value to be entered after position x");
                int x = Sc.nextInt();
                System.out.println("Enter the position at which it has to be entered");
                int pos = Sc.nextInt();
                list.addAft(x, pos);
            }
            else if(c == 5)
            {
                System.out.println("Node from start deleted.");
                list.delBeg();
            }
            else if(c == 6)
            {
                System.out.println("Node from end deleted.");
                list.delEnd();
            }
            else if(c == 7)
            {
                System.out.println("Enter position of node to be deleted.");
                int pos = Sc.nextInt();
                list.delAt(pos);
            }
            else if(c == 8)
            {
                System.out.println("Enter value to be searched");
                int x = Sc.nextInt();
                list.posFromHead(x);
            }
            else if(c == 9)
            {
                list.display();
            }
            else if(c == 10)
            {
                System.out.println("Enter key:  ");
                int x = Sc.nextInt();
                System.out.println("List before key deletion:   ");
                list.display();
                list.deleteRep(x);
                System.out.println("List after key deletion:   ");
                list.display();
            }
            else if(c == 11)
            {
                System.out.println("Middle");
                int middle = list.middleLink();
                if(middle == -1)
                {
                    ;
                }
                else
                {
                    System.out.println("The middle of linked list is the element " + middle);
                }
            }
            else if(c == 12)
            {
                int size = list.sizeList();
                System.out.println("Size of linked list is " + size);
            }
            else if(c == 13)
            {
                System.out.println("List before reversal");
                list.display();
                list.reverseList();
                System.out.println("List after reversal");
                list.display();
            }
            else if(c == 15)
            {
                System.out.println("Exit");
                
                return;
            }
            else if(c == -1)
            {
                ;
            }
            else
            {
                System.out.println("Enter a correct value");
            }
        } 
    }
}
