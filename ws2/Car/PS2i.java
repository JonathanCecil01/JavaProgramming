/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2i;

/**
 *
 * @author 20pt12
 */
public class PS2i {
    String name;
    int age;
    PS2i(String name, int age)
    {
       this.name = name;
       this.age = age;
    }
    String get_name()
    {
    return name;
    }
    int get_age()
    {
        return age;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PS2i obj1 = new PS2i("Jonathan", 120);
       System.out.println(obj1.get_name());
       
    }
    
}
