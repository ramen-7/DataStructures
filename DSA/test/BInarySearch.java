/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;
public class BInarySearch 
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
    
    public int iterativeSearchBinary(int arr[], int search)
    {
        int l = 0;
        int u = arr.length - 1;
        int mid = (l+u)/2;
        
        while(l <= u)
        {
            mid = (l+u)/2;
            //System.out.println("mid = " + mid);
            //System.out.println(arr[mid]);
            if(arr[mid] == search)
            {
                return mid;
            }
            if(arr[mid] < search)
            {
                //System.out.println("low");
                l = mid+1;
            }
            if(arr[mid] > search)
            {
                //System.out.println("high");
                u = mid-1;
            }          
        }
        return -1;
    }
    
    public int recursiveBinarySearch(int arr[], int l, int u, int search)
    {
        if(l > u)
        {
            return -1;
        }
        int mid = (u+l)/2;
        //System.out.println("mid = " + mid);
        //System.out.println("arr[mid] = " + arr[mid]);
        //System.out.println("search = " + search);
        if(arr[mid] == search)
        {
            return mid;
        }
        else if(arr[mid] > search)
        {
            return recursiveBinarySearch(arr, l, mid - 1, search);
        }   
        else
        {
            return recursiveBinarySearch(arr, mid + 1, u, search);
        }
    }
    
    
    public static void main(String args[])
    {
        BInarySearch obj = new BInarySearch();
        int arr[] = {1, 5, 32, 45, 69, 75, 89, 100};
        obj.printArray(arr);
        System.out.println("Enter number to be searched");
        int search = Sc.nextInt();        
        /*int index = obj.iterativeSearchBinary(arr, search);
        if(index == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Found at index " + (index+1));
        }*/
        int index2 = obj.recursiveBinarySearch(arr, 0, arr.length-1, search);
        //System.out.println("index2 = " + index2);
        if(index2 != -1)
        {
            System.out.println("Found at index " + (index2+1));
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
