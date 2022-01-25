/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodechefProblems;

/**
 *
 * @author shvmt
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CMONGER
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
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = Sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = Sc.nextInt();
            int x = Sc.nextInt();
            String inp = Sc.nextLine();
            inp = Sc.nextLine();
            String arr[] = inp.split(" ");
            //List<String> unique = new ArrayList<String>();

            String[] unique = Arrays.stream(arr).distinct().toArray(String[]::new);
            
            int size = unique.length;
            //System.out.println("size = " + size);
            int left = n-size;
            if(left >= x)
            {
                //System.out.println("this");
                System.out.println(size);
            }
            else
            {
                //System.out.println("this2");
                System.out.println(n-x);
            }
        }
       
    }
}
