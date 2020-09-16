/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcode;
import java.util.Scanner;
/**
 *
 * @author sharmila
 */
public class Caesarcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
        char a;
        int n=0,n1;char n2;
        System.out.println("enter the plaintext string");
        String str=obj.next();
        System.out.println("enter the number of position");
        int m=obj.nextInt();
        for (int i = 0; i < str.length(); i++) {
             a=str.charAt(i);
             n=(int)a;
             n1=n+m;
             n2=(char)n1;
             System.out.print(Character.toUpperCase(n2));
        }
    }
    
}
