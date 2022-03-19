
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
public class FractionalKnapsack 
{
    static Scanner Sc = new Scanner(System.in);
    public void printArray(double arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void printArray(double arr[][])
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
    
    public double[][] calcRatio(double arr[][])
    {
        for(int i = 0; i <= arr[0].length; i++)
        {
            arr[i][3] = arr[i][2]/arr[i][1];
        }
        return arr;
    }
    
    public double[][] swapRow(double arr[][], int x, int y)
    {
        for(int i = 0; i < arr[0].length; i++)
        {
            double temp = arr[x][i];
            arr[x][i] = arr[y][i];
            arr[y][i] = temp;
        }
        return arr;
    }
    
    public double[][] sortDec(double arr[][])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i][3] < arr[j][3])
                {
                    arr = swapRow(arr, i, j);
                }
            }
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        FractionalKnapsack obj = new FractionalKnapsack();
        double arr[][] = {{1, 5, 30, 0},
                      {2, 10, 40, 0},
                      {3, 15, 45, 0},
                      {4, 22, 77, 0},
                      {5, 25, 90, 0}};
        //obj.printArray(arr);
        arr =  obj.calcRatio(arr);
        obj.printArray(arr);
        System.out.println("--------");
        arr = obj.sortDec(arr);
        obj.printArray(arr);
        int M = 60;
        int p = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(M > 0 && arr[i][1] <= M)
            {
                M -= arr[i][1];
                p += arr[i][2];
            }
            else if(M > 0)
            {
                p += arr[i][2]*M/arr[i][1];
                break;
            }
        }
        System.out.println(p);
    }
}
