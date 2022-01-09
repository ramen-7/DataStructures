/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment4;

/**
 *
 * @author shvmt
 */
import java.util.*;
class Node
{
    int data;
    Node next;
}

class Stacks
{
    Node head;
    
    public void push(int x)
    {
        Node newNode = new Node();
        newNode.data = x;
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void pop()
    {
        if(head == null)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public void display()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }
    
    public int peek()
    {
        if(head == null)
        {
            System.out.println("Underflow");
            return -1;
        }
        return head.data;
    }
}


public class StacksFunctions 
{
    public static void main(String args[])
    {
        Stacks obj = new Stacks();
        Scanner Sc = new Scanner(System.in);
        String msg = """
                     1.Push
                     2.Pop
                     3.Peek
                     4.isEmpty
                     5.Display
                     6.Exit
                     """;
        int c = -1;
        while(c != 0)
        {
            System.out.println(msg);
            c = Sc.nextInt();
            if(c == 1)
            {
                System.out.println("Enter number to be pushed.");
                int x = Sc.nextInt();
                obj.push(x);
            }
            else if(c == 2)
            {
                obj.pop();
            }
            else if(c == 3)
            {
                int x = obj.peek();
                System.out.println(x);
            }
            else if(c == 4)
            {
                boolean ans = obj.isEmpty();
                if(ans == false)
                {
                    System.out.println("Not empty");
                }
                else
                {
                    System.out.println("Empty");
                }
            }
            else if(c == 5)
            {
                obj.display();
            }   
            else if(c == 6)
            {
                System.out.println("Exit");
                break;
            }
        }
    }
      
}
