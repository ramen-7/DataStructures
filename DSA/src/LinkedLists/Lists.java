/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedLists;

/**
 *
 * @author shvmt
 */
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
    }
}

class Lists 
{
    Node head;
    
    public void displayList()
    {
        if(head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            Node current = head;
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public void addbehind(int x)
    {
        Node temp = new Node(x);
        if(head == null)
        { 
            head = temp;
        }
        else
        {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = temp;
        }
    }
    
    public void addFront(int x)
    {
        Node temp = new 
    }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        Lists obj = new Lists();
        obj.addbehind(1);
        obj.addbehind(2);
        obj.addbehind(3);
        obj.addbehind(4);
        obj.addbehind(5);
        obj.displayList();
    }
}
