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
                             Press 10.To Exit
                             """;
        System.out.println(message);
        int c = Sc.nextInt();
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
                System.out.println("Exit");
                
                return;
            }
            else
            {
                System.out.println("Enter a correct value");
            }
        } 
    }
}
