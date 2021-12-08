/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;

public class Q1 
{
    public int[][] diagonalMatrix(int n)
    {
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if(i==j)
                {
                    arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    
    public int[][] lowerTriangularMatrix(int n)
    {
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                arr[i][j] = 1;
            }
        }
        return arr;
    }
    
    public int[][] upperTriangularMatrix(int n)
    {
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = n-i-1; j >= 0; j--)
            {
                //System.out.println("i = " + i + "j = " + j);
                arr[i][j] = 1;
            }
        }
        return arr;
    }
    
    public int[][] triDiagonalMatrix(int n)
    {
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                if(i == j && i != (n-1))
                {
                    arr[i][j] = 1;
                    arr[i+1][j] = 1;
                    arr[i][j+1] = 1;
                }
                if(i == j && i == (n-1))
                {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
    
    public void displayArray(int arr[][], int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.println("Enter the size of matrix:   ");
        int n = Sc.nextInt();
        int x = 1;
        while (x != 0)
        {
            System.out.println("Enter\n" + "1.Diagonal Matrix\n" + "2.Tri-Diagonal Matrix\n" + "3.Lower Triangular Matrix\n" + "4.Upper Triangular Matrix\n" + "5.Exit");
            x = Sc.nextInt();
            System.out.println("Here's your array:  ");
            switch (x) 
            {
                case 1:
                    obj.displayArray(obj.diagonalMatrix(n),n);
                    break;
                case 2:
                    obj.displayArray(obj.triDiagonalMatrix(n),n);
                    break;
                case 3:
                    obj.displayArray(obj.lowerTriangularMatrix(n),n);
                    break;
                case 4:
                    obj.displayArray(obj.upperTriangularMatrix(n), n);
                    break;
                case 5:
                    x = 0;
                    break;
                default:
                    System.out.println("Enter a proper value.");
                    break;
            }
        }
    }
}
