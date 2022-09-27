package PROBLEM3;

class Global
{
    static int GlobalX = 0;
}

class Increment extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
            Global.GlobalX++;
      System.out.println(Global.GlobalX);
    }
}

public class SharedCounter {
    public static void main(String[]args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Increment thread = new Increment();
            thread.start();
        }

    }
}
