import java.lang.Math;
public class Triangle {
    double x;
    double y;
    double z;
    double area;
    String color;
    Triangle()
    {
         x = 1;
         y = 1;
         z = 1;
        double s = (x+y+z)/2;
         area = Math.pow(s*(s-x)*(s-y)*(s-z), 0.5);
            color = "White";
    }
    Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        double s = (x + y + z) / 2;
        area = Math.pow(s * (s - x) * (s - y) * (s - z), 0.5);
        color = "Red";
    }
    public double getArea()
    {
        return area;
    }
    public boolean isTriangle()
    {
        if(x+y<z||x+z<y||y+z<x)
        {
            return false;
        }
        return true;
    }
    public boolean isRight()
    {
        if(isTriangle())
        {
            if(x*x+y*y==z*z)
            {
                return true;
            }
        }
        return false;
    }
    public boolean isScalene()
    {
        if(x!=y&&x!=z&&y!=z)
        {
            return true;
        }
        return false;
    }
    public boolean isEquilateral()
    {
        return x == y && y == z;
    }
    public void display()
    {
        System.out.println("Area : "+area);
        System.out.println(
                "Color: "+color
        );
    }
public static void main(String[]args)
{
    Triangle t1 = new Triangle(3, 3, 3);
    System.out.println(t1.isEquilateral());
    t1.display();
}
}
