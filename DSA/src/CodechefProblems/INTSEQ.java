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
class INTSEQ
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
    
    public void createA(int k, List<Double> arr)
    {
        boolean check = false;
        for(int i = 1; i <= k; i++)
        {  
            arr.add(k/Math.pow(2,i));
            //System.out.println(arr.get(i-1) % 2);
            if(arr.get(i-1) % 2 != 0)
            {
                return;
            }
        }
    }
    
    public boolean checkForDecimal(List<Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) % 1 != 0)
            {
                return true;
            }
        }
        return false;
    }
    
    /*public double[] createS(double arr1[], double arr2[])
    {
        double sum = 0;
        for(int i = 0; i < (arr1.length)/2 ;i++)
        {
            arr2[i] = 
        }
    }*/
    
    public static void main (String[] args) throws java.lang.Exception
    {
        INTSEQ obj = new INTSEQ();
        int t = Sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int k = Sc.nextInt();
            List<Double> A = new ArrayList<Double>();
            obj.createA(k, A);
            //System.out.println(A);      
            boolean check = obj.checkForDecimal(A);
            if(check == true)
            {
                System.out.println(0);
                continue;
            }
            else
            {
                System.out.println(A.size());
            }    
            
        }
    }
}
