/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodechefProblems;

/**
 *
 * @author shvmt
/* package; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class PSGRADE
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
                int am = Sc.nextInt();
                int bm = Sc.nextInt();
                int cm = Sc.nextInt();
                int total = Sc.nextInt();
                int a = Sc.nextInt();
                int b = Sc.nextInt();
                int c = Sc.nextInt();
                int max_t = a+b+c;
                System.out.println("total = " + total);
                if(am <= a && bm <= b && cm <= c && max_t > total)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            
                
            }
            
	}
}
