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
class PINBS 
{
    public boolean substrings(String in)
    {
        outer:
        if(in.contains("10") || in.contains("11"))
        {
            return true;
        }
        return false;
    }
    
    public int binToDec(String num)
    {
        return Integer.parseInt(num,2);
    }
    
    public boolean checkPrime(int num)
    {
        if(num == 1 || num == 0)
        {
            return false;
        }
        else if(num == 2 || num == 3)
        {
            return true;
        }
        else
        {
            for(int i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    return false;
                }
            }
        }    
        return true;
    }
    
    public void printInfo(boolean c)
    {
        if(c == true)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
    }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        PINBS obj = new PINBS();
        int n = Sc.nextInt();
        ArrayList<String> substrs = new ArrayList<String>();
        for(int i = 0; i < n; i++)
        {
            String inp = Sc.next();
            //String sub1 = inp.substring(0,(inp.length()/2));
            //String sub2 = inp.substring((inp.length()/2), inp.length());
            //boolean c = obj.substrings(sub2);
            /*if(c == false)
            {
                boolean c2 = obj.substrings(inp);
                obj.printInfo(c2);
            }
            else
            {*/
            boolean c = obj.substrings(inp);
            obj.printInfo(c);
            //}
            /*int c = 0;
            for(int j = 0; j < substrs.size(); j++)
            {
                int dec = obj.binToDec(substrs.get(j));
                System.out.println(substrs.get(j));
                System.out.println(dec);
                boolean check = obj.checkPrime(dec);
                if(check == true)
                {
                    c++;
                    System.out.println("----");
                    break;
                }                
            }
            if(c > 0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        /*for(int i = 1; i <= 200; i++)
        {
            if(obj.checkPrime(i))
            {
                System.out.println(i);
            }
        }*/
        }
    }   
}
