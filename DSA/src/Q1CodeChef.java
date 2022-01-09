/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shivamtaneja
 */
import java.util.*;
import java.lang.Math;
public class Q1CodeChef 
{
    static Stack <Integer>S1 = new Stack<Integer>();
    static Stack <Integer>S2 = new Stack<Integer>();
    static Queue <Integer>Q = new LinkedList<Integer>();
    
    public void printStack(Stack<Integer> s)
    {
        String out = "";
        Stack <Integer>temp = new Stack<Integer>();
        for(int e : s)
        {
            temp.push(e);
        }
        //System.out.println("Temp stack is " + temp);
       // System.out.print("Stack = ");
        for(int e : s)
        {
            out = out + temp.peek() + " ";
            temp.pop();
        }
        System.out.println(out);
        //System.out.println("Stack is  " + s);
    }
    
    public void printQueue(Queue<Integer> q)
    {
        //System.out.print("Queue = ");
        for(int s : q)
        {
            System.out.print(s + " ");
        }
        System.out.println();
        //System.out.println("Queue is  " + q);
    }
    
    public void reverseQueue(Queue<Integer> q)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while(!q.isEmpty())
        {
            stack.add(q.peek());
            q.remove();
        }
        while(!stack.isEmpty())
        {
            q.add(stack.peek());
            stack.pop();
        }
    }
    
    public void printInfo(Stack<Integer> s1, Stack<Integer> s2, Queue<Integer> q)
    {
        if(!q.isEmpty())
        {
            printQueue(q);
        }
        if(!s1.isEmpty())
        {
            printStack(s1);
        }
        if(!s2.isEmpty())
        {
            printStack(s2);
        }   
    }
    
    public void reverseStack(Stack<Integer> s)
    {
        s.sort(Collections.reverseOrder());
    }
    
    public boolean conditionOne(Stack<Integer> s, int x)
    {
        if(s.isEmpty() || x < s.peek())
        {
            return true;
        }
        return false;
    }
    
    public boolean conditionTwo(Stack<Integer> s, int x)
    {
        if(s.isEmpty() || x > s.peek())
        {
            return true;
        }
        return false;
    }
    
    public void insert(Stack<Integer> s1, Stack<Integer> s2, Queue<Integer> q, int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            int x = arr[i];
            //System.out.println("x = " + x);
            if(conditionOne(s1, x))
            {
                //System.out.println("Condition 1");
                s1.push(x);
                printInfo(s1, s2, q);
            }
            else if(conditionTwo(s2, x))
            {
                //System.out.println("Condition 2");
                s2.push(x);
                printInfo(s1, s2, q);
            }
            else
            {
                //System.out.println("Condition 3");
                int s2diff = s2.peek() - x;
                int s1diff = s1.peek() - x;
                /*System.out.println("s1.peek() = " + s1.peek());
                System.out.println("s2.peek() = " + s2.peek());
                System.out.println("s1diff = " + s1diff);
                System.out.println("s2diff = " + s2diff);*/
                if(Math.abs(s1diff) < Math.abs(s2diff))
                {
                    //may have to remove from stack and add to queue here
                    while(true)
                    {
                        boolean done = false;
                        if(conditionOne(s1, x))
                        {
                            //System.out.println("x = " + x);
                            s1.push(x);
                            printInfo(s1, s2, q);
                            done = true;
                        }
                        else
                        {
                            q.add(s1.peek());
                            s1.pop();
                            //printInfo(s1, s2, q);                            
                        }
                        if(done == true)
                        {
                            break;
                        }
                    }
                    
                    reverseQueue(q);
                    
                    while(!q.isEmpty())
                    {
                        s1.push(q.peek());
                        q.remove();
                        //printInfo(s1, s2, q);
                    }
                }
                else
                {
                    while(true)
                    {
                        boolean done = false;
                        if(conditionTwo(s2, x))
                        {
                            s2.push(x);
                            printInfo(s1, s2, q);
                            done = true;
                        }
                        else
                        {
                            q.add(s2.peek());
                            s2.pop();
                            //printInfo(s1, s2, q);                           
                        }
                        if(done == true)
                        {
                            break;
                        }
                    }
                    
                    reverseQueue(q);
                    
                    while(!q.isEmpty())
                    {
                        s2.push(q.peek());
                        q.remove();
                        //printInfo(s1, s2, q);                       
                    }
                }
            }
        }
    }
    
    
    public static void main(String args[])
    {
        Q1CodeChef obj = new Q1CodeChef();
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        String inp = Sc.nextLine();
        inp = Sc.nextLine();
        String inparr[] = inp.split(" ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(inparr[i]);
        }
        obj.insert(S1, S2, Q, arr);
        obj.reverseStack(S2);
        /*for(int i = 0; i < 10; i++)
        {
            S1.push(i);
            System.out.println(S1.peek());
        }
        obj.printStack(S1);*/
        while(!S1.isEmpty() && !S2.isEmpty())
        {
            if(S1.peek() < S2.peek())
            {
                Q.add(S1.peek());
                S1.pop();
                obj.printInfo(S1, S2, Q);
            }
            else
            {
                Q.add(S2.peek());
                S2.pop();
                obj.printInfo(S1, S2, Q);
            }
        }
        while(!S1.isEmpty())
        {
            Q.add(S1.peek());
            S1.pop();
            obj.printInfo(S1, S2, Q);
        }
        while(!S2.isEmpty())
        {
            Q.add(S2.peek());
            S2.pop();
            obj.printInfo(S1, S2, Q);
        }   
    }
}
