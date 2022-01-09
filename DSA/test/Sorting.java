/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */

import java.util.*;

public class Sorting 
{   
    public void insertionSort(int arr[])
    {
        int l = arr.length;
        for(int i = 0; i<l; i++)
        {
            int key = arr[i];
            System.out.println("key1 = "+ key);
            int j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                System.out.println("arr[j+1] =  " + arr[j+1] + "arr[j] = " + arr[j]);
                arr[j+1] = arr[j];//copying values 
                j--;
            }
            displayArray(arr);
            arr[j+1] = key;           
            displayArray(arr);
            System.out.println("---");
        }
    }
    
    public void bubbleSort(int arr[])
    {
        int l = arr.length;
        for(int i = 0; i < l-1; i++)
        {
            for(int j = 0; j < l-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    
    public void selectionSort(int arr[])
    {
        int l = arr.length;
        for(int i = 0; i < l-1; i++)
        {
            //int min = i;
            for(int j = i+1; j < l; j++)
            {
                if(arr[i] < arr[j])
                {
                    //min = j;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                //int temp = arr[min];
                //arr[min] = arr[i];
                //arr[i] = temp;
            }
        }
    }
    
    /*public void quickSort(int arr[])
    {
        int l = arr.length;
        System.o
    }*/
    
    public void displayArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String a[])
    {
        Scanner Sc = new Scanner(System.in);
        Sorting obj = new Sorting();
        System.out.println("Enter the length of the array:  ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:   ");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element" + (i+1));
            arr[i] = Sc.nextInt();
        }
        System.out.println("Unsorted array: ");
        obj.displayArray(arr);
        System.out.println("Press" + "\n" +"1.Bubble Sort" + "\n" + "2.Selection Sort" + "\n" + "3.Insertion Sort");
        int c = Sc.nextInt();
        System.out.println("Sorted array:   ");
        if(c == 1)
        {
            obj.bubbleSort(arr);
            obj.displayArray(arr);
        }
        else if(c == 2)
        {
            obj.selectionSort(arr);
            obj.displayArray(arr);
        }
        else
        {
            obj.insertionSort(arr);
            obj.displayArray(arr);
        }
        /*Random r = new Random();
        int low = 10;
        int high = 100;
        
        for(int i = 1; i <= 17*17; i++)
        {
            int result = r.nextInt(high-low) + low;
            System.out.print(result + " ");
        }  */
    }
    
}
