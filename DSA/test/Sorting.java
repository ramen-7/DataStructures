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
            //displayArray(arr);
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
            displayArray(arr);
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
            displayArray(arr);
        }
    }
    
    public void swap(int arr[], int i, int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    public int partition(int arr[], int l, int h)
    {
        int pivot = arr[l];
        
        int i = l, j = h;
        System.out.println("pivot = " + pivot);   
        while(i < j)
        {
            
            while(arr[i] <= pivot)
            {
                System.out.println("arr[i] = " + arr[i]);
                i++;
                System.out.println("i++");
                
            }  
            System.out.println("i over");
            System.out.println("------");
            while(arr[j] > pivot)
            {
                System.out.println("arr[j] = " + arr[j]);
                j--;               
                System.out.println("j--");             
            }
            System.out.println("j over");
            System.out.println("------");
            System.out.println("swapping " + arr[i] + " " + arr[j]);
            if(i < j)
            {
                swap(arr, i, j);
            }
            
            displayArray(arr);
        }
        System.out.println("----------");
        //System.out.println("l = " + l);
        //System.out.println("j = " + j);
        swap(arr, l, j);
        return j;
    }
    
    public void quickSort(int arr[], int l, int h)
    {
        if (l < h) 
        {           
            int j = partition(arr, l, h);
            
            quickSort(arr, l, j);
            quickSort(arr, j + 1, h);
        }
    }
    
    public void displayArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r] using
    // merge()
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            mergeSort(arr, l, m);
            displayArray(arr);
            System.out.println();
            mergeSort(arr, m + 1, r);
            displayArray(arr);
            System.out.println("--------------------");
            // Merge the sorted halves
            merge(arr, l, m, r);
            
        }
    }
    
    public static void main(String a[])
    {
        Scanner Sc = new Scanner(System.in);
        Sorting obj = new Sorting();
        /*(for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element" + (i+1));
            arr[i] = Sc.nextInt();
        }*/
        
        int arr[] = {69, 75, 102, 1, 87, 7, 62, 36, 12};
        System.out.println("Unsorted array: ");
        obj.displayArray(arr);
        
        //System.out.println("Press" + "\n" +"1.Bubble Sort" + "\n" + "2.Selection Sort" + "\n" + "3.Insertion Sort");
        //int c = Sc.nextInt();
        
        System.out.println("Sorted array:   ");
        
        //obj.bubbleSort(arr);
        //obj.selectionSort(arr);
        //obj.insertionSort(arr);
        //obj.mergeSort(arr, 0, arr.length-1);
        //obj.quickSort(arr, 0, arr.length-1);
        //obj.displayArray(arr);
        obj.insertionSort(arr);
    }
    
}
