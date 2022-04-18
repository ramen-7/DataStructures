package DSA;

public class QuickSort
{
    public int partition(int[] arr, int start, int end)
    {
        int pivot = arr[start];
        int pIndex = start;
        for(int i = start; i < end; i++)
        {
            if(arr[i] <= pivot)
            {
                int t = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = t;
                pIndex++;
            }
        }
        int t = arr[pIndex];
        arr[pIndex] = arr[start];
        arr[start] = t;
        return pIndex;
    }

    public void quickSort(int[] arr, int start, int end)
    {
        if(start >= end)
            return;
        int pIndex = partition(arr, start, end);
        quickSort(arr, start, pIndex-1);
        quickSort(arr, pIndex+1, end);

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
        QuickSort obj = new QuickSort();
        int[] arr = {5,2,4,7,1,3,2,6};
        System.out.println("Array: ");
        obj.printArray(arr);
        System.out.println("After sorting: ");
        obj.quickSort(arr, 0, arr.length-1);
        obj.printArray(arr);
    }
}
