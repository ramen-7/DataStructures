/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayQuickSort3D
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
    
    public int[][][] inputArray(int arr[][][], int m, int n, int r)
    { 
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                for(int k = 0; k < r; k++)
                {
                    System.out.println("Enter element " + i + " " + j + " " + k);
                    arr[i][j][k] = Sc.nextInt();
                }
            }
        }
        return arr;
    }
    
    public void QuickSortOnce(int arr[],int pivot)
    {
        int low = 0;
        int high = arr.length-1;
        int i = (low-1);
        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
    }
    
    public int[] copy1stDimension(int arr3d[][][], int m, int x, int y, int z)
    {
        int arr[] = new int[m];
        for(int i = 0; i < m; i++)
        {
            arr[i] = arr3d[i][y][z];
        }
        return arr;
    }
    
    
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayQuickSort3D obj = new  ArrayQuickSort3D();
        System.out.println("Enter value of m");
        int m = Sc.nextInt();
        System.out.println("Enter value of n");
        int n = Sc.nextInt();
        System.out.println("Enter value of r");
        int r= Sc.nextInt();
        int arr3d[][][] = new int[m][n][r];
        System.out.println("Enter elements");
        arr3d = obj.inputArray(arr3d, m, n, r);
        System.out.println("Enter x");
        int x = Sc.nextInt();
        System.out.println("Enter y");
        int y = Sc.nextInt();
        System.out.println("Enter z");
        int z = Sc.nextInt();
        int pivot = arr3d[x][y][z];
        int arr1d[] = obj.copy1stDimension(arr3d, m, x, y, z);
        int pivot1 = arr1d[x];
        obj.QuickSortOnce(arr1d, pivot1);
        //then we find the pivot again, make a 1d array copy of 2nd dimension, and then same for the third dimension
    }
}
    
