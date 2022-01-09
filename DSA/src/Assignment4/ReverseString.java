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
class charNode
{
    charNode next;
    char data;
}
class StringStack
{
    charNode head;
    public void push(char c)
    {
        charNode newNode = new charNode();
        newNode.data = c; 
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
    
    public char pop()
    {
        if(head == null)
        {
            System.out.println("Underflow");
            return '\u0000';
        }
        else
        {
            char c =  head.data;
            head = head.next;
            return c;
        }
    }
    
    public void display()
    {
        charNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class ReverseString 
{
    static Scanner Sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter string to be reversed");
        String inp = Sc.nextLine();
        StringStack obj = new StringStack();
        int l = inp.length();
        for(int i = 0; i < l; i++)
        {
            obj.push(inp.charAt(i));
        }
        System.out.println("Stack is ");
        obj.display();
        String rev = "";
        for(int i = 0; i < l; i++)
        {
            rev = rev + obj.pop();
        }
        System.out.println("Reversed string = " + rev);
    }
}
