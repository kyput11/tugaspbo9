/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbolooping;

import java.util.Scanner;

/**
 *
 * @author awliy
 */
public class LaguAnakAyam {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();
        nyanyikanLaguAnakAyam(n);
    }

    public static void nyanyikanLaguAnakAyam(int n) {
        while (n > 0) {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
    }
}

