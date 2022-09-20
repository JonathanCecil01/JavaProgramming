package PROBLEM1;

class Divisors extends Thread{
    int starting;
    int ending;
    int max;
    int divisorCnt;
    Divisors(int starting, int ending)
    {
        this.starting = starting;
        this.ending = ending;
        max = 0;
        divisorCnt = 0;
    }
    public int maxDivisors()
    {
        int counter = 0;
        int maxCount = 0;
        int maxNoOfDivisors =0;
        for(int i=starting;i<ending+1;i++)
        {
            counter =0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                    counter+=1;
            }
            if(counter>maxCount)
            {
                maxCount = counter;
                maxNoOfDivisors = i;
            }
        }
        divisorCnt = maxCount;
        return maxNoOfDivisors;
    }
    public void run()
    {
        System.out.println("Thread "+starting+" - "+ending+ " running");
        max = maxDivisors();
    }
}

public class Problem1 {
    public static void main(String[]args) throws InterruptedException {
        int n = 10;
        Divisors threads[];
        threads = new Divisors[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new Divisors(i*10000+1, i*10000+10000);
            threads[i].start();
        }
        int max = 0;
        int max_value= 9837;
        for (int i = 0; i < n; i++) {
            threads[i].join();
            System.out.println(threads[i].max+" : " + threads[i].divisorCnt);
            if(threads[i].divisorCnt>max)
            {
                max = threads[i].divisorCnt;
                max_value = threads[i].max;
            }
        }
        System.out.println("The element with the maximum divisors is "+ max_value+" with "+max+" Divisors");
    }
}
