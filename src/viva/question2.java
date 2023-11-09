/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter an integer:");
        int num=input.nextInt();
        System.out.print("Reversed integer:");
        
        String a=String.valueOf(num);
        int count=a.length();
        
        if(a.charAt(0)=='-'){
           System.out.print("-");
        for(int i=count-1;i>0;i--){
            System.out.print(a.charAt(i));
        }}
        else
         for(int i=count-1;i>=0;i--)
            System.out.print(a.charAt(i));
        
    }}
            
            
    
        
    
    

