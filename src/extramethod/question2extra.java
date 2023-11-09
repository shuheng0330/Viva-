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
        int oriNum=num;
        System.out.print("Reversed integer:");
        
        
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        num=oriNum;

        
        if(num <0){
           System.out.print("-");
           num=-num;
        for(int i=count-1;i>=0;i--){
            System.out.print(num%10);
            num=num/10;
        }
        }
        else
         for(int i=count-1;i>=0;i--){
            System.out.print(num%10);
            num=num/10;
         }
            
        
    }
    
}
