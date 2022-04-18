package DSA;

import java.util.*;
public class eval
{
    public int occurences(String str, int p, int n)
    {
        Stack<Character> s = new Stack<>();
        for(int i = str.length()-1; i >= 0; i--)
        {
            s.push(str.charAt(i));
        }
        System.out.println(s);
        if(p > str.length())
        {
            return -1;
        }
        char atP = str.charAt(p);
        System.out.println("atP = " + atP);
        String temp = "";
        int occ = 0;
        for(int i = 0; i < p; i++)
        {
            System.out.println(s.peek());
            if(s.peek() == atP)
                occ++;
            temp += s.pop();
        }
        return occ;
    }

    public static void main(String[] args)
    {
        eval obj = new eval();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = Sc.nextInt();
        System.out.println("Enter String");
        String str = Sc.nextLine();
        str = Sc.nextLine();
        System.out.println("Enter Q");
        int q = Sc.nextInt();
        for(int i = 0; i < q; i++)
        {
            System.out.println("Enter P");
            int p = Sc.nextInt();
            int ans = obj.occurences(str, p, n);
            System.out.println("No. of occureces BEFORE p are: ");
            System.out.println(ans);
        }

    }
}
