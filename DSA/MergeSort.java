package DSA;

import java.util.Scanner;

public class MergeSort
{
    public int[] merge(int[] l, int[] r, int[] a)
    {
        int nl = l.length;
        int nr = r.length;
        int i = 0, j = 0, k = 0;
        while(i < nl && j < nr)
        {
            if(l[i] <= r[j])
            {
                a[k] = l[i];
                i++;
            }
            else
            {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        //for leftovers
        while(i < nl)
        {
            a[k] = l[i];
            i++;
            k++;
        }
        while(j < nl)
        {
            a[k] = r[j];
            j++;
            k++;
        }
        return a;
    }

    public void mergeSort(int[] a)
    {
        int n = a.length;
        if(n < 2)
            return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        System.arraycopy(a, 0, left, 0, mid);
        for(int i = mid; i < n; i++)
        {
            right[i-mid] = a[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, a);
    }

    public void printArray(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        MergeSort obj = new MergeSort();
        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int n = Sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++)
//        {
//            arr[i] = Sc.nextInt();
//        }
        int[] arr = {2, 4, 1, 6, 8, 5, 3, 7};
        System.out.println("Original Array: ");
        obj.printArray(arr);
        obj.mergeSort(arr);
        System.out.println("After sorting: ");
        obj.printArray(arr);
    }
}
