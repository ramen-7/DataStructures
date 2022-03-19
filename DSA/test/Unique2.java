/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;
public class Unique2 
{
	static Scanner Sc = new Scanner(System.in);
        public static void main(String args[]) 
	{
        int t = Sc.nextInt();
        int xor = 0;
        String inp = Sc.nextLine();
        inp = Sc.nextLine();
	String arr[] = inp.split(" ");
        System.out.println(java.util.Arrays.toString(arr));
	while(t-->0)
	{
            System.out.println("t = " + t);
            xor ^= Integer.parseInt(arr[t]);
	}
	String bin = Integer.toBinaryString(xor);
	String padding = String.format("%64s", bin).replace(' ', '0');
	//System.out.println(padding);
	int index = padding.lastIndexOf('1');
	List<Integer> l1 = new ArrayList<Integer>();
	List<Integer> l2 = new ArrayList<Integer>();
	for(int i = 0; i < arr.length; i++)
	{
            String tbin = Integer.toBinaryString(Integer.parseInt(arr[i]));
            String tpadding = String.format("%64s", tbin).replace(' ', '0');
		//System.out.println(arr[i] + " = " + tpadding);
            if(tpadding.charAt(index) == '1')
            {
		l1.add(Integer.parseInt(arr[i]));
            }
            else
            {
		l2.add(Integer.parseInt(arr[i]));
            }
	}
	//System.out.println(l1);
	//System.out.println(l2);
	int ans1 = 0;
	int ans2 = 0;
	for(Integer E : l1)
	{
            ans1 ^= E.intValue();
	}
	for(Integer E : l2)
	{
            ans2 ^= E.intValue();
	}
	System.out.println(ans1 + " " + ans2);
    }
}

