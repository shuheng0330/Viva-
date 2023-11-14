/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int sumLowerCase=0,sumUpperCase=0,sumSpecial=0,sumDigit=0; //initialize the variables into 0
        
        System.out.print("Enter a string:");
        String password=input.nextLine(); //Allow user to input the password
        
        for(int i=0;i<password.length();i++){    //use for loop to check the each character inside the password
            if(password.charAt(i)>='a' && password.charAt(i)<='z')  //check whether each character contains lowercase by comparing with ASCII 
                sumLowerCase=sumLowerCase+1;                        //value of sumLowerCase increases by 1 if each character contains lowercase
            if(password.charAt(i) >='A' && password.charAt(i) <='Z')  //check whether each character contains uppercase by comparing with ASCII
                sumUpperCase+=1;                                      //value of sumUpperCase increases by 1 if each character contains uppercase
            if(password.charAt(i)=='!' ||password.charAt(i)=='@' || password.charAt(i)== '#' || password.charAt(i)=='$' || password.charAt(i)=='%' || password.charAt(i)=='^' ||  password.charAt(i)=='&' ||  password.charAt(i)=='*' ||  password.charAt(i)=='(' ||  password.charAt(i)==')' ||  password.charAt(i)=='-' ||  password.charAt(i)=='+')
                 sumSpecial+=1;      //value of sumSpeical increases by 1 if each character contains special character
            
            if(password.charAt(i)>='0' &&  password.charAt(i) <='9')
                sumDigit+=1;         //value of sumDigit increases by 1 if each character contains digit
        }
        
        System.out.print("Strength of password:");
        if(sumLowerCase>=1 && sumUpperCase>=1 && sumSpecial>=1 &&password.length() >=8 && sumDigit >=1)
            System.out.println("Strong"); //if the password satisfies all the conditions,hence the password is strong
        else if(sumLowerCase>=1 && sumUpperCase>=1 && sumSpecial>=1 && password.length() >=6)
            System.out.println("Moderate"); //if the password satisfies the first three conditions,thus the password is moderate
        else
            System.out.println("Weak");
    }
    
}
