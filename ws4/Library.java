
abstract class Book {
    String title;
    int dayTaken;

    Book(String title, int dayTaken)
    {
        this.title = title;
        this.dayTaken = dayTaken;
    }

    abstract int daysOverdue(int d);
    abstract boolean isOverdue(int d);
    abstract int computeFine(int d);
}

class RegularBook extends Book {
    String author;

    RegularBook(String title, String author, int dayTaken)
    {
        super(title, dayTaken);
        this.author = author;
    }

    int daysOverdue(int d)
    {
        return d - dayTaken - 14;
    }

    boolean isOverdue(int d)
    {
        if(d > dayTaken + 14)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    int computeFine(int d)
    {
        int days = daysOverdue(d);

        if(days > 0)
        {
            return days;
        }
        else
        {
            return 0;
        }
    }
}

class RefBook extends Book {
    RefBook(String title, int dayTaken)
    {
        super(title, dayTaken);
    }

    int daysOverdue(int d)
    {
        return d - dayTaken - 2;
    }

    boolean isOverdue(int d)
    {
        if(d > dayTaken + 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    int computeFine(int d)
    {
        int days = daysOverdue(d);

        if(days > 0)
        {
            return days;
        }
        else
        {
            return 0;
        }
    }
}

class AudioBook extends Book {
    String author;

    AudioBook(String title, String author, int dayTaken)
    {
        super(title, dayTaken);
        this.author = author;
    }

    int daysOverdue(int d)
    {
        return d - dayTaken - 14;
    }

    boolean isOverdue(int d)
    {
        if(d > dayTaken + 14)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    int computeFine(int d)
    {
        int days = daysOverdue(d);

        if(days > 0)
        {
            return days * 2;
        }
        else
        {
            return 0;
        }
    }
}

public class Library {
    public static void main(String[] args)
    {
        Book b1 = new RegularBook("The History of QB", "Sreyas S", 10);
        Book b2 = new RefBook("Notes and References", 100);
        Book b3 = new AudioBook("QB's Hits", "Shreya", 50);

        int day = 101;

        if(b1.isOverdue(day))
        {
            System.out.println("No. of days overdue for the regular book is: " + b1.daysOverdue(day));
            System.out.println("Fine amount to be paid: " + b1.computeFine(day));
        }
        else
        {
            System.out.println("You have " + -1 * b1.daysOverdue(day) + " days to return the book");
        }

        if(b2.isOverdue(day))
        {
            System.out.println("No. of days overdue for the reference book is: " + b2.daysOverdue(day));
            System.out.println("Fine amount to be paid: " + b2.computeFine(day));
        }
        else
        {
            System.out.println("You have " + -1 * b2.daysOverdue(day) + " days to return the book");
        }

        if(b3.isOverdue(day))
        {
            System.out.println("No. of days overdue for the audio book is: " + b3.daysOverdue(day));
            System.out.println("Fine amount to be paid: " + b3.computeFine(day));
        }
        else
        {
            System.out.println("You have " + -1 * b3.daysOverdue(day) + " days to return the book");
        }
    }
}

