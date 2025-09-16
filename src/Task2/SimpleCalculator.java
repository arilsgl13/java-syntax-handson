package Task2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== KALKULATOR SEDERHANA ===");


        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();


        System.out.println("\n=== HASIL PERHITUNGAN ===");

        // Penjumlahan
        double penjumlahan = angka1 + angka2;
        System.out.printf("Penjumlahan    : %.2f + %.2f = %.2f\n", angka1, angka2, penjumlahan);

        // Pengurangan
        double pengurangan = angka1 - angka2;
        System.out.printf("Pengurangan    : %.2f - %.2f = %.2f\n", angka1, angka2, pengurangan);

        // Perkalian
        double perkalian = angka1 * angka2;
        System.out.printf("Perkalian      : %.2f × %.2f = %.2f\n", angka1, angka2, perkalian);

        // Pembagian (dengan pengecekan pembagian dengan nol)
        if (angka2 != 0) {
            double pembagian = angka1 / angka2;
            System.out.printf("Pembagian      : %.2f ÷ %.2f = %.2f\n", angka1, angka2, pembagian);
        } else {
            System.out.printf("Pembagian      : %.2f ÷ %.2f = Error! Tidak dapat membagi dengan nol\n", angka1, angka2);
        }

        // Modulus/sisa bagi (dengan pengecekan pembagian dengan nol)
        if (angka2 != 0) {
            double modulus = angka1 % angka2;
            System.out.printf("Modulus        : %.2f %% %.2f = %.2f\n", angka1, angka2, modulus);
        } else {
            System.out.printf("Modulus        : %.2f %% %.2f = Error! Tidak dapat modulus dengan nol\n", angka1, angka2);
        }


    }

    // Method helper untuk mengkategorikan bilangan
    public static String kategoriBilangan(double angka) {
        StringBuilder kategori = new StringBuilder();

        if (angka > 0) {
            kategori.append("Positif");
        } else if (angka < 0) {
            kategori.append("Negatif");
        } else {
            kategori.append("Nol");
        }

        // Cek apakah bilangan bulat
        if (angka == (int)angka) {
            kategori.append(", Bilangan Bulat");
        } else {
            kategori.append(", Bilangan Desimal");
        }

        // Cek apakah genap/ganjil (hanya untuk bilangan bulat)
        if (angka == (int)angka && angka != 0) {
            if ((int)angka % 2 == 0) {
                kategori.append(", Genap");
            } else {
                kategori.append(", Ganjil");
            }
        }

        return kategori.toString();
    }
}

