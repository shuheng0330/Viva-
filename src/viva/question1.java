/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva;
public class question1 {
    public static void main(String[] args) {
      
        
      int rows=10;  
      for (int i = 1; i <= rows; i++) {
      for (int j = rows; j >= 1; j--)
        System.out.print(j <= i ? j + " " : "  ");
      for (int j = 2; j <= i; j++){
        System.out.print(j + " ");
      }
        System.out.println();    
        }
    }
    
}
