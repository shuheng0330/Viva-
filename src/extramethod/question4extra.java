/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extramethod;
import java.util.Scanner;
public class question4extra {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        boolean sumLowerCase=false,sumUpperCase=false,sumSpecial=false,sumDigit=false;
        
        System.out.print("Enter a string:");
        String password=input.nextLine();
        
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>='a' && password.charAt(i)<='z')
                sumLowerCase=true;
            if(password.charAt(i) >='A' && password.charAt(i) <='Z')
                sumUpperCase=true;
            if(password.charAt(i)=='!' ||password.charAt(i)=='@' || password.charAt(i)== '#' || password.charAt(i)=='$' || password.charAt(i)=='%' || password.charAt(i)=='^' ||  password.charAt(i)=='&' ||  password.charAt(i)=='*' ||  password.charAt(i)=='(' ||  password.charAt(i)==')' ||  password.charAt(i)=='-' ||  password.charAt(i)=='+')
                 sumSpecial=true;
            
            if(password.charAt(i)>='0' &&  password.charAt(i) <='9')
                sumDigit=true;
        }
        
        System.out.print("Strength of password:");
        if(sumLowerCase && sumUpperCase && sumSpecial &&password.length() >=8 && sumDigit)
            System.out.println("Strong");
        else if(sumLowerCase && sumUpperCase && sumSpecial && password.length() >=6)
            System.out.println("Moderate");
        else
            System.out.println("Weak");
    }
    
}
