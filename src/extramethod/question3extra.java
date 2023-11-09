/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extramethod;
import java.util.Scanner;
public class question3extra {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num=input.nextInt();
        
        int count=0;
        int sum=0;
        int oriNum=num;//use variable oriNum to store the original number
        while(num !=0){
           num=num/10;
           count++;
        }
        num=oriNum;//reset num to the original number
        for(int i=0;i < count;i++){
            int digit=num%10;
            int factorial=1;
            for(int b=1;b <=digit;b++)
                factorial=factorial*b;
            sum=factorial+sum;
            num=num/10;
            
            if(count-1 >i){
                System.out.print(factorial+" + ");
            }
            else
                System.out.println(factorial+" = "+sum);
            
        }
        if(oriNum==sum)
            System.out.print(oriNum+" is a strong number");
        else
            System.out.println(oriNum+" is not a strong number");
        
    }
    
}
