package PROBELM4;

class PriorityThread extends Thread
{
    int priority;
    PriorityThread(int priority)
    {
        this.priority = priority;
    }
    public void run()
    {
        System.out.println(priority);
    }
}

public class Q4 {
    public static void main(String[]args)
    {
        Thread threads[] = new PriorityThread[4];
        for(int i=0;i<4;i++)
        {
            PriorityThread thread = new PriorityThread(i+1);
            threads[i] = thread;
        }
        for(int i=2;i<4;i++)
        {
            threads[i].start();
        }
    }
}
