/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodechefProblems;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EXAMTIME
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
    
    public int greater(int d, int s)
    {
        if (d>s)
        {
            return 1;
        }
        else if(d == s)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    
    
    public String better(String dragon, String sloth)
    {
        String dragonMarks[] = dragon.split(" ");
        String slothMarks[] = sloth.split(" ");
        int sumDrag = Integer.parseInt(dragonMarks[0])+ Integer.parseInt(dragonMarks[1]) + Integer.parseInt(dragonMarks[2]);
        int sumSloth = Integer.parseInt(slothMarks[0]) + Integer.parseInt(slothMarks[1]) + Integer.parseInt(slothMarks[2]);
        int total = greater(sumDrag, sumSloth);
        int DSA = greater(Integer.parseInt(dragonMarks[0]),Integer.parseInt(slothMarks[0]));
        int TOC = greater(Integer.parseInt(dragonMarks[1]),Integer.parseInt(slothMarks[1])); 
        int DM = greater(Integer.parseInt(dragonMarks[2]),Integer.parseInt(slothMarks[2]));
        if(total == 1)
        {
            return "DRAGON";
        }
        else if(total == -1)
        {
            return "SLOTH";
        }
        else
        {
            if(DSA == 1)
            {
                return "DRAGON";
            }
            else if(DSA == -1)
            {
                return "SLOTH";
            }
            else
            {
                if(TOC == 1)
                {
                    return "DRAGON";
                }
                else if(TOC == -1)
                {
                    return "SLOTH";
                }
                else
                {
                    if(DM == 1)
                    {
                        return "DRAGON";
                    }
                    else if(DM == -1)
                    {
                        return "SLOTH";
                    }
                    else
                    {
                        return "TIE";
                    }
                }
            }
        }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        EXAMTIME obj = new EXAMTIME();
        int n = Sc.nextInt();
        String dragon, sloth;
        dragon = Sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            dragon = Sc.nextLine();
            sloth = Sc.nextLine();
            String ans = obj.better(dragon, sloth);
            System.out.println(ans);
        }
    }
}
