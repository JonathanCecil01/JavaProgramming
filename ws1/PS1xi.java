/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1xi;

/**
 *
 * @author 20pt12
 */
import java.util.*;
public class PS1xi {

    static boolean checkPrime(int n)
    {
        boolean flag = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag= false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum balue in the range : ");
        int min= sc.nextInt();
        System.out.println("Enter the max value of the range : ");
        int max = sc.nextInt();
        for(int i=min;i<=max;i++)
        {
            if(checkPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    
}
