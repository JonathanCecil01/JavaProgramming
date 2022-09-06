/*
Author : Jonathan Cecil 
Program : Unit conversion Program */
package ps1i;

/**
 *
 * @author 20pt12
 */
import java.util.*;
public class PS1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the unit to converrt from : ");
        String fr = sc.nextLine();
        System.out.println(fr);
        System.out.println("Entr the unit to converrt to : ");
        String to = sc.nextLine();
        System.out.println(to);
        System.out.println("Entr the value : ");
        double value = sc.nextDouble();
        System.out.println(value);
    }
    
}
