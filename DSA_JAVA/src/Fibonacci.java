/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.Scanner;
public class Fibonacci 
{
    public int Fibo(int x)
    {
        if(x <= 1)
        {
            return x;
        }
        else
        {
            return Fibo(x-2) + Fibo(x-1);
        }
    }

    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number:   ");
        int x = Sc.nextInt();
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.Fibo(x));
    }
}
