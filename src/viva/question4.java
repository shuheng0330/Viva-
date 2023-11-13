/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int sumLowerCase=0,sumUpperCase=0,sumSpecial=0,sumDigit=0;
        
        System.out.print("Enter a string:");
        String password=input.nextLine();
        
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>='a' && password.charAt(i)<='z')
                sumLowerCase=sumLowerCase+1;
            if(password.charAt(i) >='A' && password.charAt(i) <='Z')
                sumUpperCase+=1;
            if(password.charAt(i)=='!' ||password.charAt(i)=='@' || password.charAt(i)== '#' || password.charAt(i)=='$' || password.charAt(i)=='%' || password.charAt(i)=='^' ||  password.charAt(i)=='&' ||  password.charAt(i)=='*' ||  password.charAt(i)=='(' ||  password.charAt(i)==')' ||  password.charAt(i)=='-' ||  password.charAt(i)=='+')
                 sumSpecial+=1;
            
            if(password.charAt(i)>='0' &&  password.charAt(i) <='9')
                sumDigit+=1;
        }
        
        System.out.print("Strength of password:");
        if(sumLowerCase>=1 && sumUpperCase>=1 && sumSpecial>=1 &&password.length() >=8 && sumDigit >=1)
            System.out.println("Strong");
        else if(sumLowerCase>=1 && sumUpperCase>=1 && sumSpecial>=1 && password.length() >=6)
            System.out.println("Moderate");
        else
            System.out.println("Weak");
    }
    
}
