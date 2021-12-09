/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;
public class Q2
{
    public int[][] toSparse(int arr[][])
    {
        int c = arr[0].length;
        int r = arr.length;
        int l = 0;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(arr[i][j] != 0)
                {
                    l++;
                }
            }
        }
        int sparse[][] = new int[l][3];
        int k = 0;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(arr[i][j] != 0)
                {
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = arr[i][j];
                    k++;
                }
            }
        }
        return sparse;
    }
    
    public int[][] transposeSparse(int arr[][])
    {
        int c = arr[0].length;
        int r = arr.length;
        int transpose[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            transpose[i][0] = arr[i][1];
            transpose[i][1] = arr[i][0];
            transpose[i][2] = arr[i][2];
        }
        return transpose;
    }
    
    public void display(int arr[][])
    {
        int c = arr[0].length;
        int r = arr.length;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public int[][] addSparse(int arr[][], int arr2[][], int r, int c)
    {
        int r1 = arr.length;
        int r2 = arr2.length;
        int r3 = r*c*r*c;
        int added[][] = new int[r3][3];
        for(int i= 0; i < r3; i++)
        {
            
        }        
    }
    
    public int[][] toNormal(int arr[][], int r, int c)
    {
        int normal[][] = new int[r][c];
        int r_2 = arr.length;
        int c_2 = arr[0].length;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                normal[i][j] = 0;
            }
        }
        for(int i = 0; i < r_2; i++)
        {
            int row = arr[i][0];
            int column = arr[i][1];
            int value = arr[i][2];
            normal[row][column] = value;
        }   
        return normal;
    }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:  ");
        int r = Sc.nextInt();
        System.out.println("Enter no. of columns:   ");
        int c = Sc.nextInt();
        int arr[][] = new int[r][c];
        Q2 obj = new Q2();
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.println("Enter element:  ");
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("Array is as follows:    ");
        obj.display(arr);
        System.out.println("Sparse matrix is as follows:    ");
        int sparse[][] = obj.toSparse(arr);
        obj.display(sparse);
        int transpose[][] = obj.transposeSparse(sparse);
        System.out.println("Transpose Sparse array: ");
        obj.display(transpose);
        System.out.println("Normal Array Transposed:    ");
        int normal[][] = obj.toNormal(transpose, r, c);
        obj.display(normal);
    }
}
