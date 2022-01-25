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
class CRYCOLR
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
            String b1 = Sc.nextLine();
            
            b1 = Sc.nextLine();
            //System.out.println("b1 = " + b1);
            String b2 = Sc.nextLine();
            String b3 = Sc.nextLine();
            String box1[] = b1.split(" ");
            String box2[] = b2.split(" ");
            String box3[] = b3.split(" ");
            int sum1= Integer.parseInt(box1[1]) + Integer.parseInt(box1[2]) + Integer.parseInt(box2[2]);
            int sum2 = Integer.parseInt(box2[0]) + Integer.parseInt(box3[0]) + Integer.parseInt(box3[1]);
            
            int largest = sum1>sum2?sum1:sum2;
            System.out.println(largest);
        }
    }
}
