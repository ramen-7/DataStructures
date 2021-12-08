/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;
public class Q3 
{
    int sum_r, sum_c;
    public void sumOf(int arr[][])
    {
        int r = arr.length;
        int c = arr[0].length;
        for(int i = 0; i < r; i++)
        {
            sum_r = 0;
            for(int j = 0; j < c; j++)
            {
                sum_r += arr[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is " + sum_r);
        }
        for(int i = 0; i < c; i++)
        {
            sum_c = 0;
            for(int j = 0; j < r; j++)
            {
                sum_c += arr[j][i];
            }
            System.out.println("Sum of column " + (i+1) + " is " + sum_c);
        }
    }
    
    public void displayArray(int arr[][], int r, int c)
    {
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    public static void main(String a[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter no. of columns");
        int c = Sc.nextInt();
        System.out.println("Enter no. of rows");
        int r = Sc.nextInt();
        int arr[][] = new int[r][c];
        Q3 obj = new Q3();
        System.out.println("Enter array:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.println("Enter element arr[" + i + "][" + j + "]");
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("Array is as follows:    ");
        obj.displayArray(arr, r, c);
        obj.sumOf(arr);
    }
}
