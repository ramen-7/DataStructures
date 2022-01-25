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
class XORED
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
            int n = Sc.nextInt();
            String inp = Sc.nextLine();
            for(int i = 0; i < n; i++)
            {
               inp = Sc.nextLine();
               String inparr[] = inp.split(" ");
               int X = Integer.parseInt(inparr[1]);
               String binval = Integer.toBinaryString(X);
               System.out.println(binval);
               int len = Integer.parseInt(inparr[0]);
               String arr[] = new String[n];
               for(int j = 0; j < len; j++)
               {
                   arr[i] = new String(new char[len]).replace('\0','0');
                   System.out.println(arr[i]);
               }
               int rem = len - binval.length();
               System.out.println(rem);
               for(int j = 0; j < rem; j++)
               {
                   arr[j] = arr[j].substring(0, j) + 1 + arr[j].substring(i + 1);
                   System.out.println(arr[i]);
               }
            }
	}
}
