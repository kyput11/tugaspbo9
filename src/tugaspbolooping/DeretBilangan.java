/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbolooping;

/**
 *
 * @author awliy
 */
public class DeretBilangan {
   


    public static void main(String[] args) {
        System.out.println("Deret Bilangan Prima dari 0 - 20:");
        deretBilanganPrima(20);
        System.out.println("\nDeret Bilangan Ganjil dan Genap dari 0 - 20:");
        deretBilanganGanjilGenap(20);
    }

    public static void deretBilanganPrima(int batas) {
        for (int i = 0; i <= batas; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrima(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void deretBilanganGanjilGenap(int batas) {
        int i = 0;
        System.out.println("Bilangan Genap:");
        while (i <= batas) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nBilangan Ganjil:");
        int j = 0;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= batas);
    }
}

    

