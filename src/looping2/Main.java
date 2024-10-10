/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping2;

/**
 *
 * @author awliy
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimum 10): ");
        int n = scanner.nextInt();

        if (n <= 10) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
        }
        
        scanner.close();
    }
}

