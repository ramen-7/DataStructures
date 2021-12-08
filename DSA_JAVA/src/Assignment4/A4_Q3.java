/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment4;

import java.util.*;
public class A4_Q3 
{
    public boolean stackBalanced(char arr[])
    {
        int l = arr.length;
        Stack<Character> exp = new Stack<Character>();
        for(int i = 0; i < l; i++)
        {
            if(arr[i] == '(')
            {
                exp.push(arr[i]);
            }
            else if(arr[i] == '{')
            {
                exp.push(arr[i]);
            }
            else if(arr[i] == '[')
            {
                exp.push(arr[i]);
            }
            else if(arr[i] == ')')
            {
                if(exp.pop() != '(')
                {
                    return false;
                }  
            }
            else if(arr[i] == '}')
            {
                if(exp.pop() != '{')
                {
                    return false;
                }
            }
            else if(arr[i] == ']')
            {
                if(exp.pop() != '[')
                {
                    return false;
                }
            }           
        }
        return true;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String exp = Sc.next();
        char arr[] = exp.toCharArray();
        A4_Q3 obj = new A4_Q3();
        boolean ans = obj.stackBalanced(arr);
        if(ans == true)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }   
}
