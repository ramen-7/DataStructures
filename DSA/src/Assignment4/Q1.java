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

class Q1 
{
    class Node
    {
        int data;
        Node next;
    }
    
    Node head;
    
    Q1()
    {
        this.head = null;
    }
    
    public void push(int x)
    {
        Node new_node = new Node();
        new_node.data = x;
        new_node.next = head;
        head = new_node;
    }
   
    public void pop()
    {
        if(head == null)
        {
            System.out.println("Underflow");
            return;
        }
        head = head.next;
    }
    
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    public void display()
    {
        System.out.println("Stack is as follows");
        if(head == null)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            Node t = head;
            System.out.println(t.data  + " ");
            t = t.next;
        }
        System.out.println();
    }
    
    public void peek()
    {
        System.out.println("Entered peek");
        if(!isEmpty())
        {
            System.out.println(head.data);
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }   
}

class A4Q1
{
    public static void main(String[] args)
    {
        Q1 obj = new Q1();
        
        Scanner Sc = new Scanner(System.in);
        int x = 0;
        while(x != 6)
        {
            System.out.println("""
                               Press 1. To Push element
                               Press 2. To Pop element
                               Press 3. To Display Stack
                               Press 4. To Peek Stack
                               Press 5. To Check if Stack is Empty
                               Press 6. To Exit
                               """);
            x = Sc.nextInt();
            if (x == 1)
            {
                System.out.println("Enter element to be pushed  ");
                int c = Sc.nextInt();
                obj.push(c);
            }
            else if (x == 2)
            {
                obj.pop();
            }
            else if (x == 3)
            {
                obj.display();
            }
            else if(x == 4)
            {
                obj.peek();
            }
            else if(x == 5)
            {
                if(!obj.isEmpty())
                {
                    System.out.println("Stack is not empty");

                }
                else
                {
                    System.out.println("Stack is Empty");
                }
            }
            else
            {
                System.out.println("Please enter a correct value");
            }
        }    
            
        
             
    }
}
