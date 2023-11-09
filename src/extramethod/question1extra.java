/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extramethod;
public class question1extra {
    public static void main(String[] args) {
        int rows = 10; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the numbers
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }

            // Print decreasing sequence from i to 1
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing sequence from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}

    

