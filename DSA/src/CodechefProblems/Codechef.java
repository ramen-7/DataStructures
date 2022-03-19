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
class Codechef
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
    
    public String createBinary(int l, int n)
    {
        String ans = "";
        for(int i = 0; i < l; i++)
        {
            ans = ans + 0; 
        }
        ans += 1;
        for(int i = l+1; i < n; i++)
        {
            ans = ans + 0;
        }
        //System.out.println(ans);
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int t = Sc.nextInt();
		Codechef obj = new Codechef();
		for(int i = 0; i < t; i++)
		{
		    int n = Sc.nextInt();
		    for(int j = 0; j < n; j++)
		    {
		        String print = obj.createBinary(j, n);
		        int a = Integer.parseInt(print,2);
		        System.out.print(a + " ");
		    }
		    System.out.println();
		}
	}
}
