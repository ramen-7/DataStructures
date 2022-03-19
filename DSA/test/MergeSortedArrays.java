
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
public class MergeSortedArrays 
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
    
    public static void main(String args[])
    {
        MergeSortedArrays  obj = new MergeSortedArrays();
        int arr1[] = {1, 3, 4, 7};
        int arr2[] = {1, 2, 4};
        int arr3[] = new int[arr1.length + arr2.length];
        int x = 0;
        int i = 0;
        for(i = 0; i < Math.min(arr1.length, arr2.length); i++)
        {
            if(Math.min(arr1[i], arr2[i]) == arr1[i])
            {
                arr3[x] = arr1[i];
                x++;
                arr3[x] = arr2[i];
                x++;
            }
            else
            {
                arr3[x] = arr2[i];
                x++;
                arr3[x] = arr1[i];
                x++;
            }
        }
        obj.printArray(arr3);
        
        if(Math.max(arr1.length, arr2.length) == arr1.length)
        {
            for(; i < arr1.length; i++)
            {
                arr3[x] = arr1[i];
                x++;
            }
        }
        else
        {
            for(; i < arr2.length; i++)
            {
                arr3[x] = arr2[i];
                x++;
            }
        }
        
        obj.printArray(arr3);
    }
}
