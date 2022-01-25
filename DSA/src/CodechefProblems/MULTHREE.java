/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodechefProblems;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MULTHREE
{
    static Scanner Sc = new Scanner(System.in);
    public void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void printArray(int arr[][])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public int sumOfDigits(String inp, long k)
    {
        String arr = "2486";
        int sum  = 0;
        char four = 0;
        for(int i = 0; i < 4;i++)
        {
           int c = Character.getNumericValue(inp.charAt(i));
           if(i != 3)
           {
               sum +=c;
           }
           else
           {
               four = inp.charAt(i);
           }
        }
        
        if(four == '0')
        {
            return -1;
        }
        
        int rem = (int)((k-3)%4-1);
        //System.out.println("rem = " + rem);
        
        //System.out.println("fourth char = " + four);
        int index = arr.indexOf(four);
        if(rem == -1)
        {
            rem = (int)(k-4)%4;
            
        }
        //System.out.println("index = " + index);
        while(rem > 0)
        {
            //System.out.println("rem = " + rem);
            int ptr = (index+rem)%4;
            //System.out.println("ptr = " + ptr);
            int c = Character.getNumericValue(arr.charAt(ptr));
            //System.out.println("c = " + c);
            sum += c;
            rem--;
        }
        //System.out.println("sum =" + sum);
        return sum;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int n = Sc.nextInt();
        MULTHREE obj = new MULTHREE();
        String input = Sc.nextLine();        
        for(int j = 0; j < n; j++)
        {
            input = Sc.nextLine();
            String inparr[] = input.split(" ");
            long k = Long.parseLong(inparr[0]);
           // System.out.println("k = " + k);
            String N = "";
            N = inparr[1] + inparr[2];
            int t = (Integer.parseInt(inparr[1]) + Integer.parseInt(inparr[2]))%10;
            N = N + t;
            int x =  (Character.getNumericValue(N.charAt(0))+ Character.getNumericValue(N.charAt(1))+ Character.getNumericValue(N.charAt(2)))%10;
            //System.out.println("x = " + x);
            N = N+x;
            //System.out.println(N);
            int s = obj.sumOfDigits(N, k);
            if(s % 3 == 0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
