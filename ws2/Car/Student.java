/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author 20pt12
 */
public class Student {
    String name;
    int totalqz_sc;
    int no_quizzes;
    Student(String name)
    {
        this.name = name;
        totalqz_sc= 0;
        no_quizzes = 0;
    }
    void Add_score(int score)
    {
        totalqz_sc = totalqz_sc+score;
        no_quizzes++;
    }
    String get_name()
    {
        return name;
    }
    int get_score()
    {
        return totalqz_sc;
    }
    
    public static void main(String[] args) {
       Student s1 = new Student("Jonathan");
       for(int i=0;i<10;i++)
       {
           s1.Add_score(i);
       }
       s1.Add_score(100);
       System.out.println(s1.get_score());
    }
    
}
