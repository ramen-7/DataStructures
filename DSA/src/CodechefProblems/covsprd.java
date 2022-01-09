
package CodechefProblems;

/**
 *
 * @author shvmt
 */
import java.util.*;
public class covsprd 
{
    static Scanner Sc = new Scanner(System.in);
    
    public double times(double r, int n)
    {
        double sum = Math.pow(r,n);
        return sum;
    }
    
    
    public static void main(String args[])
    {
        covsprd obj = new covsprd();
        int t = Sc.nextInt();
        String inp = Sc.nextLine();
        /*double sum1 = obj.times(2,10);
        System.out.println("sum1 = " + sum1);
        double sum2 = obj.times(3,2);
        System.out.println("sum2 = " + sum2);*/
        double inf = 1;
        for(int l = 0; l < t; l++)
        {
            inp = Sc.nextLine();
            inf = 1;
            String inparr[] = inp.split(" ");
            int N = Integer.parseInt(inparr[0]);
            int D = Integer.parseInt(inparr[1]);
            boolean check = false;
            //System.out.println("N = " + N);
            //System.out.println("D = " + D); 
            if(D > 10)
            {
                int rem = D - 10;
                inf = 1024 * obj.times(3, rem);
            }
            else
            {
                inf = obj.times(2, D);
            }
            if(inf > N)
            {
                System.out.println(N);
            }
            else
            {
                System.out.println((int)inf);
            }
        }
        
    }
}
