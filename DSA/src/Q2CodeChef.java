/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shvmt
 */
import java.util.*;
class Q2CodeChef 
{
    static List<List<Integer>> lowerList = new ArrayList<List<Integer>>();
    static List<List<Integer>> upperList = new ArrayList<List<Integer>>();
    public void print2dArr(int arr[][])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    public int[][] to2dArray(int arr[], int n)
    {
        int twod[][] = new int[n][n];
        int x = 0;
        int y = 1;
        for(int i = 1; i <= n*n; i++)
        {
            if(i%n == 0)
            {
                twod[x][y-1] = arr[i-1];
                //System.out.println("i = " + i + " x = " + x + " y = " + y);
                y = 1;               
                x++;
            }
            else
            {
                //System.out.println("i = " + i + " x = " + x + " y = " + y);
                twod[x][y-1] = arr[i-1];
                y++;
            }
        }
        return twod;
    }
    
    
    public void printList(List<List<Integer>> l)
    {
        int size = l.size();
        for(int i = 0; i < size; i++)
        {
            System.out.println("List " + (i+1) + l.get(i));
        }
    }
    
    public int[] to1dArray(int arr[][], int n)
    {
        int arr1d[] = new int[n*n];
        int x = -1;
        int y = 0;
        for(int i = 0; i < n*n; i++)
        {
            if(i%n == 0)
            {
                x++;
                y=0;
            }
            //System.out.println("i = " + i + " x = " + x + " y = " + y);
            arr1d[i] = arr[x][y];
            y++;
        }
        return arr1d;
    }
    
    public List<Integer> arrToList(int arr[])
    {
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }
        return intList;
    }
    
    public void print1dArr(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    
    public List<Integer> reverseList(List<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revArrayList.add(alist.get(i));
        }
 
        // Return the reversed arraylist
        return revArrayList;
    }
    
    public int[][] convertLto2d(List<List<Integer>> lower, List<List<Integer>> upper, int n)
    {
        int check[] = new int[n/2];
        int arr[][] = new int[n][n];
        //lower L
        if(n%2 != 0)
        {
            for(int i = 0; i < n/2; i++)
            {
                int x = 0;
                for(int j = i; j < n-i-1; j++)
                {
                    arr[j][i] = lower.get(i).get(x);
                    check[i]++;
                    x++;
                }
            }
            //System.out.println();
            //print2dArr(arr);
            //System.out.println("---");
            int x = 0;
            //System.out.println("val = " + lower.get(1).get(1));
            for(int i = n-1;i > n/2; i--)
            {
                for(int j = x; j < n-x-1; j++)
                {
                    //System.out.println( "j = " + j + " CHECK x = " + x +  " " + check[x]);
                    arr[i][j] = lower.get(x).get(check[x]);
                    check[x]++;
                }
                /*print2dArr(arr);
                System.out.println("---");*/
                x++;
            }
            arr[n/2][n/2] = lower.get(lower.size()-1).get(0);
        }
        else
        {
            for(int i = 0; i < (n/2); i++)
            {
                int x = 0;
                for(int j = i; j < n-i; j++)
                {
                    arr[j][i] = lower.get(i).get(x);
                    check[i]++;
                    x++;
                }
            }
            for(int i = 0; i < check.length; i++)
            {
                check[i]--;
            }
            //print2dArr(arr);
            //System.out.println("--");
            int x = 0;
            for(int i = n-1; i > (n/2); i--)
            {
                //System.out.println("i = " + i);
                for(int j = x; j < n-x-1; j++)
                {
                    arr[i][j] = lower.get(x).get(check[x]);
                    check[x]++;
                }
                x++;
            }
            //print2dArr(arr);
            //System.out.println("--");
        }
        //print2dArr(arr);
        //System.out.println("--");
        //check to 0
        for(int i = 0; i < check.length; i++)
        {
            check[i] = 0;
        }
        //upper L
        if(n %2 != 0)
        {
            int x = 0;
            for(int i = n-1; i > n/2; i--)
            {
                for(int j = n-x-1; j > x; j--)
                {
                    //System.out.println("Check " + x + " = " + check[x] + " value = " + upper.get(x).get(check[x]));
                    arr[j][i] = upper.get(x).get(check[x]);
                    check[x]++;                    
                }
                //check[x]--;
                x++;
            }
            //print2dArr(arr);
            //System.out.println("--");
            /*for(int i = 0; i < check.length; i++)
            {
                System.out.println("Check " + i + " = " + check[i]);
            }*/
            //System.out.println("Check= " + check[0] + " value = " + upper.get(0).get(check[0]));
            for(int i = 0; i < n/2; i++)
            {
                List<Integer> rev = new ArrayList<Integer>();
                rev = reverseList(upper.get(i));
                //System.out.println("rev = " + rev);
                List<Integer> req = new ArrayList<Integer>();
                for(x = 0; x < check[i]; x++)
                {
                    req.add(rev.get(x));
                }
                //System.out.println("req = " + req);
                x = 0;
                for(int j = i+1; j < n-i; j++, x++)
                {
                    arr[i][j] = req.get(x);
                }
                //print2dArr(arr);
                //System.out.println("--");
            }
            //print2dArr(arr);
            //System.out.println("--");
        }
        else
        {
            int x = 0;
            for(int i = n-1; i >= n/2; i--)
            {
                for(int j = n-x-1; j >= x; j--)
                {
                    //System.out.println("Check " + x + " = " + check[x] + " value = " + upper.get(x).get(check[x]));
                    arr[j][i] = upper.get(x).get(check[x]);
                    check[x]++;                    
                }
                check[x]--;
                x++;
            }
            //print2dArr(arr);
            //System.out.println("--");
            for(int i = 0; i < n/2; i++)
            {
                List<Integer> rev = new ArrayList<Integer>();
                rev = reverseList(upper.get(i));
                //ystem.out.println("rev = " + rev);
                List<Integer> req = new ArrayList<Integer>();
                for(x = 0; x < check[i]; x++)
                {
                    req.add(rev.get(x));
                }
                //^System.out.println("req = " + req);
                x = 0;
                for(int j = i+1; j < n-i; j++, x++)
                {
                    arr[i][j] = req.get(x);
                }
                //print2dArr(arr);
                //System.out.println("--");
            }
            //print2dArr(arr);
            //System.out.println("--");
        }
        return arr;
    }
    
    public void insertion(List<List<Integer>> lower, List<List<Integer>> upper, int n)
    {
       // System.out.println("Upper = " + upper);
        //System.out.println("Lower = " + lower);
        //System.out.println("--");
        int size[] = new int[upper.size()];
        for(int i = 0; i < 2*n-2; i++)
        {
            for(int k = 0; k < upper.size(); k++)
            {
                int arr[] = convertIntegers(upper.get(k));
                if(i < arr.length)
                {
                    int key = arr[i];
                    int j = i-1;
                    while(j >= 0 && arr[j] > key)
                    {
                        arr[j+1] = arr[j];
                        j--;
                    }
                    arr[j+1] = key;
                }
                List<Integer> list1 = arrToList(arr);
                upper.set(k, list1);
                size[k] = upper.get(k).size();
            }
            //System.out.println("Upper = " + upper);
            for(int k = 0; k < lower.size()-1; k++)
            {
                int arr[] = convertIntegers(lower.get(k));
                if(i < arr.length)
                {
                    int key = arr[i];
                    int j = i-1;
                    while(j >= 0 && arr[j] > key)
                    {
                        arr[j+1] = arr[j];
                        j--;
                    }
                    arr[j+1] = key;
                }
                List<Integer> list1 = arrToList(arr);
                lower.set(k, list1);
            }
            if(i > 0)
            {
                //System.out.println("Lower = " + lower);
                int arr2[][] = convertLto2d(lower, upper, n);
                //print2dArr(arr2);
                int arr3[] = to1dArray(arr2, n);
                print1dArr(arr3);
            }           
            
        }
        
        /*System.out.println("Sizes = ");
        for(int i = 0; i < size.length; i++)
        {
            System.out.println(upper.get(i) + " " + size[i]);
            System.out.println(lower.get(i) + " " + size[i]);
        }  */ 
        //System.out.println("Merging");
        //merging insert
        int l = upper.size()-1;
        for(int i = -1 ; i <= (2*n-2); i++)
        {
            int arr5[] = new int[n*n];
            int arr4[][] = new int[n][n];
            for(int k = upper.size()-1; k >= 0; k--)
            {
                //System.out.println("k = " + k);
                List<Integer> list1 = new ArrayList<Integer>();
                list1.addAll(lower.get(k));
                list1.addAll(upper.get(k));
                int arr[] = convertIntegers(list1);
                //System.out.println("Before");
                //print1dArr(arr);
                //System.out.println("i = " + i);
                //System.out.println("size[k] = " + size[k]);
                //System.out.println("size[k]+i = " +  size[k] + " + " + i + " = " + (size[k]+i));
                if(i<=size[k])
                {
                    Arrays.sort(arr, 0, size[k]+i);
                }
                //print1dArr(arr);
                //System.out.println("After");
                //print1dArr(arr);
                int arr2[] = new int[size[k]];
                int arr3[] = new int[size[k]];
                list1 = arrToList(arr);
                for(int u = 0; u < size[k]; u++)
                {
                    arr2[u] = list1.get(u);
                }
                int x = 0;
                for(int u = size[k]; u < 2*size[k]; u++)
                {
                    arr3[x] = list1.get(u);
                    x++;
                }
                //print1dArr(arr2);
                //print1dArr(arr3);
                
                List<Integer> list2 = arrToList(arr2);
                List<Integer> list3 = arrToList(arr3);
                lower.set(k, list2);
                upper.set(k, list3);
                //System.out.println("Upper = " + upper);
                //System.out.println("Lower = " + lower);
                arr4= convertLto2d(lower, upper, n);
                
                arr5 = to1dArray(arr4, n);
                
                //System.out.println("next");
            }
            if(i > 0)
            {
                //print2dArr(arr4);
                print1dArr(arr5);
            }
        }
        
    }
    
    public void creatingLowerLs(int n, int arr[][])
    {
        for(int i = 0; i < n/2; i++)
        {
            List<Integer> list1 = new ArrayList<Integer>();
            //System.out.println("Column " + i);
            for(int j = i; j < n-i-1; j++)
            {
                //ystem.out.print(arr[j][i] + " ");
                list1.add(arr[j][i]);
            }
            //System.out.println();
            if(!list1.isEmpty())
            {
                lowerList.add(list1);
            }
        }
        //System.out.println("List = " + finalList);
        int x = 0;
        for(int i = n-1; i>(n/2)-1; i--)
        {
            //System.out.println("i = " + i);
            //System.out.println("Row " + i);
            for(int j = x; j < n-x-1; j++)
            {
                //System.out.print("i = " + i + " j = " + j + " " );
                //System.out.print(arr[i][j] + " ");
                lowerList.get(x).add(arr[i][j]);
            }
            //System.out.println("List n= " + finalList.get(n-1));
            //finalList.get(n/2).add(arr[n/2][n/2]);
            //System.out.println();
            x++;
        }
        if(n %2 != 0)
        {
            int mid = (n/2);
            List<Integer> list1 = new ArrayList<Integer>();
            list1.add(arr[n/2][n/2]);
            lowerList.add(list1);
        }
        //printList(finalList);
        //System.out.println("lowerList = " + lowerList);
        
    }
    
    public void creatingUpperLs(int n, int arr[][])
    {
        int x = 0;
        for(int i = n-1; i > (n/2)-1; i--)
        {
            List<Integer> list1 = new ArrayList<Integer>();
            //System.out.println("Column " + i);
            for(int j = n-x-1; j > x; j--)
            {
                //System.out.print(arr[j][i] + " ");
                list1.add(arr[j][i]);
            }
            //System.out.println();
            if(!list1.isEmpty())
            {
                upperList.add(list1);
            }
            x++;
        }
        x = 0;
        //System.out.println("BigList size = " + BigList.size());
        /*for(int i = 0; i < BigList.size(); i++)
        {
            System.out.println("Biglist " + i + " = " + BigList.get(i));
        }*/
        for(int i = 0; i < n/2; i++)
        {
            for(int j = n-i-1; j > i; j--)
            {               
                //System.out.print("i = " + i + " j = " + j + " " + arr[i][j] + " ");
                //System.out.println("Biglist " + i + " = " + BigList.get(i));
                upperList.get(i).add(arr[i][j]);
            }
        }
        //printList(BigList);
        //System.out.println();
        //System.out.println("upperList= " + upperList);
        /*for(int i = BigList.size()-1; i >= 0; i--)
        {
            finalList.add(BigList.get(i));
        }
        System.out.println("FinalList = " + finalList);*/
    }
            
    public static void main(String args[])
    {
        Q2CodeChef obj = new Q2CodeChef(); 
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n>100)
        {
            return;
        }
        String inp = Sc.nextLine();
        inp = Sc.nextLine();
        
        if(inp.length()==1)
        {
            System.out.println(inp);
        }
        String inparr[] = inp.split(" ");
        int arr[] = new int[n*n];
        for(int i = 0; i < n*n; i++)
        {
            arr[i] = Integer.parseInt(inparr[i]);
        }
        int arr2[][] = obj.to2dArray(arr, n);
        int arr3[] = obj.to1dArray(arr2, n);
        //obj.print1dArr(arr3);
        obj.creatingLowerLs(n, arr2);
        obj.creatingUpperLs(n, arr2);
        //arr2 = obj.convertLto2d(lowerList, upperList, n);
        //obj.print2dArr(arr2);
        obj.insertion(lowerList, upperList, n);
    }
}
