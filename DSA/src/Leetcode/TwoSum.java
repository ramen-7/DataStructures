import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoSum
{
    static Scanner Sc = new Scanner(System.in);
    public float[][] roundRobin(float bt[], float at[], float tq, int n)
    {
        float ctwt[][] = new float[n][2];
        float rem_bt[] = new float[n];
        float t = at[0];
        for(int i = 0; i < n; i++)
        {
            rem_bt[i] = bt[i];
        }
        while(true)
        {
            boolean done = true;
            for(int i = 0; i < n; i++)
            {
                //System.out.println("Hello");
                if((at[i] <= t) && rem_bt[i] > tq)
                {
                    done = false;
                    t += tq;
                    rem_bt[i] -= tq;
                }
                else if(at[i] <= t && rem_bt[i] <= tq && rem_bt[i]>0)//last cycle
                {
                    t += rem_bt[i];
                    rem_bt[i] = 0;
                    ctwt[i][0] = t;
                    //ctwt[i][1] = t - bt[i];
                }
            }
            if(done == true)
            {
                //System.out.println("Hello there");
                break;
            }
        }
        return ctwt;
    }
   
   
    public static void main(String args[])
    {
        int n = Sc.nextInt();//number of processes
        float tq = Sc.nextFloat();
        float BT[] = new float[n];
        float AT[] = new float[n];
        for(int i = 0; i < n; i++)
        {
            AT[i] = Sc.nextFloat();
           
        }
         for(int i = 0; i < n; i++)
        {
            BT[i] = Sc.nextFloat();
        }
        float CTWT[][] = new float[n][2];
        float CT[] = new float[n];
        float WT[] = new float[n];
        float TAT[] = new float[n];
        TwoSum obj = new TwoSum();
        CTWT = obj.roundRobin(BT, AT, tq, n);
        float avgtat = 0;
        float avgwt = 0;
        for(int i = 0; i < n; i++)
        {
            CT[i] = CTWT[i][0];
            //System.out.println("CT " + i + " is " + CT[i]);
            TAT[i] = CT[i] - AT[i];
            WT[i] = TAT[i] - BT[i];
            //System.out.println("TAT " + i + " is " + TAT[i]);
            avgtat += TAT[i];
            avgwt += WT[i];
        }
        avgtat = avgtat/n;
        avgwt = avgwt/n;
        System.out.println(avgwt);
        System.out.println(avgtat);
    }
}
