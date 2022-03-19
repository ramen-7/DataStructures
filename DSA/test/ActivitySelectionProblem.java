/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author shvmt
 */
public class ActivitySelectionProblem 
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
    
    public static void main(String args[])
    {
        ActivitySelectionProblem obj = new ActivitySelectionProblem();
        System.out.println("Enter no. of activites: ");
        int n = Sc.nextInt();
        int start[] = new int[n];
        int finish[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter start time for " + (i+1));
            start[i] = Sc.nextInt();
            System.out.println("Enter finsh time for " + (i+1));
            finish[i] = Sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n-1; j++)
            {
                if(finish[i] > finish[j])
                {
                    int temp = finish[i];
                    finish[i] = finish[j];
                    finish[j] = temp;
                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }
        System.out.println("The activities selected are as follow:  ");
        System.out.print(0 + " ");
        int i = 0;
        for(int j = 1; j < n; j++)
        {
            if(start[j] >= finish[i])
            {
                System.out.print(j + " ");
                i = j;
            }
        }
        System.out.println();
    }
    
}
