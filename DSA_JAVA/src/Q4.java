/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;

public class Q4 
{
    public boolean saddlePoint(int[][] arr)
    {
        int c = arr[0].length;
        int r = arr.length;
        for(int i = 0; i < r; i++)
        {
            int min_row = arr[i][0];
            int col_ind = 0;
            for(int j = 0; j < c; j++)
            {
                if(arr[i][j] < min_row)
                {
                    min_row = arr[i][j];
                    col_ind = j;                    
                }
            }
            System.out.println("min_row = " + min_row);
            System.out.println("col_ind = " + col_ind);
            int k;
            for(k = 0; k < r; k++)
            {
                if(arr[k][col_ind] > min_row)
                {
                    break;
                }
            }
            System.out.println("k = " + k);
            if(k == r)
            {
                System.out.println("Saddle point is at  : [" + i + "][" + col_ind + "] and its value is:    " + min_row);  
                return true;
            }
        }
        return false;
    }
    
    public void display(int[][] arr)
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
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter no. of rows;  ");
        int r = Sc.nextInt();
        System.out.println("Enter no. of columns;  ");
        int c = Sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.println("Enter element arr[" + i + "][" + j + "]:    ");
                arr[i][j] = Sc.nextInt();
            }
        }
        Q4 obj = new Q4();
        System.out.println("Array is as follows:    ");
        obj.display(arr);
        if(obj.saddlePoint(arr) == false)
        {
            System.out.println("No saddle point");
        }
    }
    
}
