
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
public class JobSequencing 
{
    static Scanner Sc = new Scanner(System.in);
    public void printArray(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
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
    
    public int[][] sortDescending(int arr[][])
    {
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = i+1; j < arr[0].length-1; j++)
            {
                if(arr[1][i] < arr[1][j])
                {
                    int temp = arr[1][i];
                    arr[1][i] = arr[1][j];
                    arr[1][j] = temp;
                    temp = arr[0][i];
                    arr[0][i] = arr[0][j];
                    arr[0][j] = temp;
                    temp = arr[2][i];
                    arr[2][i] = arr[2][j];
                    arr[2][j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        JobSequencing obj = new JobSequencing();
        System.out.println("Enter the total no. of jobs");
        int n = Sc.nextInt();
        System.out.println("Enter deadline fpr jobs");
        int deadline = Sc.nextInt();
        int timeslot[] = new int[deadline+1];
        int jobs[][] = new int[3][n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the deadline for job " + (i+1));
            jobs[0][i] = Sc.nextInt();
            System.out.println("Enter the profit for the job " + (i+1));
            jobs[1][i] = Sc.nextInt();
            jobs[2][i] = (i+1);
        }
        jobs = obj.sortDescending(jobs);
        System.out.println("Jobs in descending order");
        obj.printArray(jobs);
        System.out.println("------");
        int time = 0;
        String sequence = "";
        int profit = 0;
        for(int i = 0; i < jobs[0].length; i++)
        {
            int index = jobs[0][i];
            System.out.println("index" + index);
            if(index <= timeslot.length && timeslot[index] == 0)
            {
                System.out.println("adding job " + jobs[2][i]);
                timeslot[index] = (jobs[2][i]);
            }
        }
        System.out.println("Jobs sequence = ");
        obj.printArray(timeslot);
    }
}
