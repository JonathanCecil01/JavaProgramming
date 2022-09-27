package PROBLEM5;
import java.lang.Math;


class Multithread extends Thread
{
    boolean odd;
    int value;
    int n;
    Multithread(boolean oe, int n)
    {
        odd= oe;
        value = 0;
        this.n = n;
    }
    public int factorial(int j)
    {
        if(j==1)
            return 1;
        else
            return j*factorial(j-1);

    }
    public void run()
    {
        int sum =0;
        if(odd == true)
        {
            for(int i=1;i<n;i++)
            {
                double dig = Math.floor(Math.log10(2*i+1));
                double fact= Math.pow(10,dig+1)+(2*i+1);
                int int_fact= (int) fact;
                int_fact  = factorial(int_fact);
                sum+=int_fact;
            }
        }
        else
        {
            for(int i=1;i<n;i++)
            {
                double dig = Math.floor(Math.log10(2*i));
                double fact= Math.pow(10,dig+1)+(2*i);
                int int_fact= (int) fact;
                int_fact  = factorial(int_fact);
                sum+=int_fact;
            }
        }
        value =  sum;
    }
}

public class EulerNumber {
    public static void main(String[]args) throws InterruptedException {
        Multithread thread1 = new Multithread(true, 2);
        Multithread thread2 = new Multithread(false, 2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread1.value+thread2.value+1);

    }
}
