/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extramethod;
import java.util.Scanner;
public class question2extra {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num=input.nextInt();
        System.out.print("Reversed integer:");
        
        if(num <0){
           System.out.print("-");//print negative sign to indicate negative integer
           num=-num; //convert negative integer to positive integer for simple reverse
        }
           while(num !=0){
            System.out.print(num%10);//print  last digit
            num=num/10;              //remove last digit
        }
        
        }
            
    }
    
