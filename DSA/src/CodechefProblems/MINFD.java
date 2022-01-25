/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodechefProblems;

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class MINFD
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
    
    public void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    
    public int findMindFD(int arr[], int req)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if(sum >= req)
            {
                return (i+1);
            }
        }
        return -1;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
	int n = Sc.nextInt();
        String inp1 = Sc.nextLine();
        MINFD obj = new MINFD();
        for(int i = 0; i < n; i++)
        {
            inp1 = Sc.nextLine();
            String inp2 = Sc.nextLine();
            String arrS[] = inp2.split(" ");
            String inp1arr[] = inp1.split(" ");
            int req = Integer.parseInt(inp1arr[1]);
            int arr[] = new int[arrS.length];
            for(int J = 0; J < arrS.length; J++)
            {
                arr[J] = Integer.parseInt(arrS[J]);
            }
            Arrays.sort(arr);
            obj.reverse(arr);   
            int ans = obj.findMindFD(arr, req);
            System.out.println(ans);
        }
    }
}
