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
class RIFFLES 
{
    public String createString(int x)
    {
        String word = "";
        for(int i = 1; i <= x; i++)
        {
            word = word + i + " ";
        }
        return word;
    }
    
    public String riffle(String word)
    {
        String in[] = word.split(" ");
        String riffle = "";
        String word1 = "";
        String word2 = "";
        for(int i = 0; i < in.length; i++)
        {
            if(i % 2 == 0)
            {
                word1 = word1 + in[i] + " ";
            }
            else
            {
                word2 = word2 + in[i] + " ";
            }
        }
        riffle = word1 + word2;
        return riffle;
    }
    
    public int findEqual(String word, int times)
    {
        String original = word;
        int x = 0;
        for(int j = 0; j < times; j++)
        {
            word = riffle(word);
            //System.out.println(word + "---------- " + (j+1));
            if(word.compareTo(original)==0)
            {
                break;
            }
            x++;
        }
        return (x+1);
    }
    
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        RIFFLES obj = new RIFFLES();
        int n = Sc.nextInt();
        String inp = Sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            inp = Sc.nextLine();
            String inparr[] = inp.split(" ");
            int size = Integer.parseInt(inparr[0]);
            int times = Integer.parseInt(inparr[1]);
            String str = obj.createString(size);
            int len = obj.findEqual(str, times);
            System.out.println("len = " + len);
            int times2 = times%size;
            for(int j = 0; j < times2; j++)
            {
                str = obj.riffle(str);
                //System.out.println(str + "---------- " + (j+1));
            }
            System.out.println(str);
            /*str = obj.createString(size);
            for(int j = 0; j < times2; j++)
            {
                str = obj.riffle(str);
                System.out.println(str + "---------- " + (j+1));
            }
            System.out.println("2 str = " + str);*/
        }
    }
}
