/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;

public class SpiralMatrix 
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.println("Enter element " + i + " " + j);
                arr[i][j] = Sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        String out = "";
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n-i; j++)
            {
                out += arr[j][i] + " ";
            }
            for(int j = i+1; j < n-i; j++)
            {
                out += arr[n-i-1][j] + " ";
            }
            for(int j = n-i-2; j >= 0+i; j--)
            {
                out += arr[j][n-i-1] + " ";
            }
            for(int j = n-i-2; j > i; j--)
            {
                out += arr[i][j] + " ";
            }
        }
        
        System.out.println(out);
    }
}
