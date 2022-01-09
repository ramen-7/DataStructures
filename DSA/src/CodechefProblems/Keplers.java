/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodechefProblems;

/**
 *
 * @author shvmt
 */
import java.util.*;

public class Keplers 
{
    static Scanner Sc = new Scanner(System.in);
    public static void main(String args[])
    {
        int n = Sc.nextInt();
        String inp = Sc.nextLine();
        for(int i = 0; i < n; i++)
        { 
            inp = Sc.nextLine();
            String inparr[] = inp.split(" ");
            int arr[] = new int[inparr.length];
            for(int j = 0; j < arr.length; j++)
            {
                arr[j] = Integer.parseInt(inparr[j]);
            }
            double exp1 = Math.pow(arr[0],2)/Math.pow(arr[2],3);
            double exp2 = Math.pow(arr[1],2)/Math.pow(arr[3],3);
            if(exp1==exp2)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
