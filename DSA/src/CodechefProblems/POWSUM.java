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
class POWSUM
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
    
    public int sumArray(String arr[])
    {
        double l = (double)arr.length/2;
        int length = (int)Math.ceil(l);
        //System.out.println(l);
        l = Math.floor(l);
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < l; i++)
        {
            sum1 += Integer.parseInt(arr[i]);
            sum2 += Integer.parseInt(arr[i+(int)l]);
        }        
        if(length % 2 != 0)
        {
            sum2 += Integer.parseInt(arr[arr.length-1]);
        }
        //System.out.println("sum1 = " + sum1);
        //System.out.println("sum2 = " + sum2);
        return sum1+sum2;
    }

    public String[] powsum(String arr[])
    {
        Arrays.sort(arr);
        String output[] = new String[4];
        boolean check = true;
        int sumfull = sumArray(arr);    
        int c = 1;
        int d = 0;
        while(true)
        {         
            
            int sum = 0, sum_n = 0, multiple = 0, nos = 0, x=0, iterations = 0;
            String ans = "";
            int next = nextPow(sumfull, d);
            //System.out.println("c = " + c);
            outer:
            for(int i = 0; i < arr.length; i++)
            {   
                if((sumfull-sum)+sum_n <= next)
                {
                    //System.out.println("next = " + next);
                    //System.out.println("math.pow(2, c)" + Math.pow(2,c));
                    sum += Integer.parseInt(arr[i]);
                    //System.out.println("added = " + Integer.parseInt(arr[i]) * Math.pow(2, c));
                    sum_n += (Integer.parseInt(arr[i]) * Math.pow(2, c));
                    ans = ans +(i+1) +" " ;
                    //System.out.println("ans = " + ans);
                    //System.out.println("sum = " + sum);
                    //System.out.println("sum_n = " + sum_n);
                    //System.out.println((sumfull-sum)+sum_n);
                    //System.out.println("difference = " + difference);
                    //System.out.println("--------");
                    if((sumfull-sum)+sum_n == next)
                    {
                        multiple = (int)Math.pow(2, c);
                        nos = i+1;
                        check = false;
                        iterations = c;
                        break outer;
                    }
                }
            }
            c++;
            d++;
            output[0] = Integer.toString(nos);
            output[1] = Integer.toString(multiple);
            output[2] = ans;
            output[3] = Integer.toString(iterations);
            if(check == false)
            {
                break;
            }
        }
        return output;
    }
    
    public int nextPow(int sum, int x)
    {
        //System.out.println("sum = " + sum);
        int power = (int)(Math.log(sum)/Math.log(2));
        //System.out.println("power = " + power);
        int next = (int)(Math.pow(2, power+1+x));
        //System.out.println("next = " + next);
        return next;
    }
    
    public boolean IsPowerOfTwo(int x)
    {
        return (x != 0) && ((x & (x - 1)) == 0);
    }
            
    public static void main (String[] args) throws java.lang.Exception
    {   
        POWSUM obj = new POWSUM();
        int n = Sc.nextInt();
        String inp = Sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            String num = Sc.nextLine();
            inp = Sc.nextLine();
            String inparr[] = inp.split(" ");
            int sum = obj.sumArray(inparr);
            if(obj.IsPowerOfTwo(sum))
            {
                System.out.println(0);
                break;
            }
            String ans[] = obj.powsum(inparr);
            System.out.println(ans[3]);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println(ans[2]);
        }
    }
}
