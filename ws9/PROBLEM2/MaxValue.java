package PROBLEM2;

class findMax extends Thread
{
    int arr[];
    int max;
    findMax(int []arr)
    {
        this.arr = arr;
        max = 0;
    }
    public int maxValue()
    {
        int local_max=0;
        for(int i=0;i< arr.length;i++)
        {
            if(local_max<arr[i])
            {
                local_max = arr[i];
            }
        }
        return local_max;
    }
    public void run()
    {
        System.out.println("Thread running");
        max = maxValue();
    }
}



public class MaxValue {
    public static int[] slicedArray(int [] arr, int start, int end)
    {
        int slicedarray[] = new int[end-start];
        for(int i=0;i<end-start;i++)
        {
            slicedarray[i] = arr[i+start];
        }
        return slicedarray;
    }
    public static void main(String[]args) throws InterruptedException {
        int arr[] = {1,7, 8,9, 78, 3, 2, 4, 7, 1000, 1, 2};
        int n =4;
        findMax threads[];
        threads = new findMax[4];
        int split = arr.length/4;
        int start = 0;
        for(int i=0;i<4;i++)
        {
            threads[i] = new findMax(slicedArray(arr,start, start+split ));
            threads[i].start();
            start+=split;
        }
        for(int i=0;i<4;i++)
        {
            threads[i].join();
            System.out.println(threads[i].max);
        }
    }
}
