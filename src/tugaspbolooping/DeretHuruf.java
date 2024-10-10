/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbolooping;

/**
 *
 * @author awliy
 */
public class DeretHuruf {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        System.out.println("Deret Huruf dari Z - A:");
        deretHuruf();
    }

    public static void deretHuruf() {
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }
    }
}
