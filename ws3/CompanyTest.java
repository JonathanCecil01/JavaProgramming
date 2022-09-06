class Employee {
    int age;
    int salary;

    Employee(int age, int salary)
    {
        this.age = age;
        this.salary = salary;
    }
    public void increaseSalary(int amount)
    {
        salary+=amount;
    }
    public boolean checkRetirement()
    {
        if(age<66)
        {
            return false;
        }
        return true;
    }
    public void paySalary(int i)
    {
        System.out.println("The company pays to the employee"+i);
    }
    public void display()
    {
        System.out.println(age+" "+salary);
    }
}
class Clerk extends Employee
{
    int illdays = 0;
    Clerk(int age, int salary)
    {
        super(age, salary);
    }
    public void addIlldays()
    {
        illdays+=1;
    }
    public int getIlldays()
    {
        return illdays;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(illdays);
    }
}

class Director extends Employee
{
    double gratification;
    Director(int age, int salary)
    {
        super(age, salary);
        gratification = 0.10*salary;
    }
    public void payGratification(int i)
    {
        System.out.println(gratification);
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Gratification " + gratification);
    }
}
class Company
{
    int noOfEmployees;
    int profit;
    int currentSize;
    Employee [] employees;
    Company(int maxSize)
    {
        this.employees = new Employee[maxSize];
        this.noOfEmployees = maxSize;
        currentSize = 0;
    }
    public void addClerk(int age, int salary)
    {
        if(currentSize< employees.length-1)
        {
            employees[currentSize] = new Clerk(age, salary);
            currentSize++;
        }
    }
    public void addDirector(int age, int salary)
    {
        if(currentSize< employees.length-1)
        {
            employees[currentSize] = new Director(age, salary);
            currentSize++;
        }
    }
    public void printCompany()
    {
        System.out.println(noOfEmployees+"  "+ currentSize);
    }
}
public class CompanyTest
{
    public static void main(String[]args)
    {
        Company myCompany = new Company(100);
        myCompany.printCompany();
    }
}