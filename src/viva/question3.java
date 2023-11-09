/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num=input.nextInt();
        
        int sum=0;
        String a=String.valueOf(num);
        
        for(int i=0;i < a.length();i++){
            int digit=Character.getNumericValue(a.charAt(i));
            int factorial=1;
            
            for(int b=1;b<=digit;b++){
                factorial=factorial*b;
            }
            sum=sum+factorial;
            if(a.length()-1 > i){
                System.out.print(factorial+" + ");
            }
            else
                System.out.println(factorial+" = "+sum);


        }
        if(num==sum){
            System.out.println(num+" is a strong number");
        }
        else
            System.out.println(num+ " is a weak number");
            
        
        
    }}
       
    
    
