package Task4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("=== KONVERTER SATUAN ===");
        System.out.println("1. Meter ke Centimeter");
        System.out.println("2. Celsius ke Fahrenheit");
        System.out.println("3. Rupiah ke Dollar (kurs: 15000)");
        System.out.print("Pilih konversi (1-3): ");
        int pilihan = scanner.nextInt();

        switch(pilihan) {
            case 1:
                System.out.print("Masukkan panjang dalam meter: ");
                double meter = scanner.nextDouble();
                double centimeter = meter * 100;
                System.out.println(meter + " meter = " + centimeter + " cm");
                break;

            case 2:
                // Implementasi konversi Celsius ke Fahrenheit
                // Rumus: F = (C × 9/5) + 32
                System.out.print("Masukkan suhu dalam Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.println(celsius + "°C = " + df.format(fahrenheit) + "°F");

                // Informasi tambahan
                if (celsius <= 0) {
                    System.out.println("Status: Air membeku pada suhu ini");
                } else if (celsius >= 100) {
                    System.out.println("Status: Air mendidih pada suhu ini");
                } else if (celsius >= 36 && celsius <= 37.5) {
                    System.out.println("Status: Suhu normal tubuh manusia");
                } else if (celsius >= 20 && celsius <= 25) {
                    System.out.println("Status: Suhu ruangan yang nyaman");
                }
                break;

            case 3:
                // Implementasi konversi Rupiah ke Dollar
                // Menggunakan tipe data yang tepat untuk mata uang (double untuk presisi)
                System.out.print("Masukkan jumlah dalam Rupiah: ");
                double rupiah = scanner.nextDouble();
                double kursUSD = 15000.0; // Kurs tetap sesuai soal
                double dollar = rupiah / kursUSD;

                System.out.println("Rp " + df.format(rupiah) + " = $" + df.format(dollar));
                System.out.println("Kurs yang digunakan: 1 USD = Rp " + df.format(kursUSD));

                // Informasi tambahan berdasarkan jumlah
                if (dollar >= 1000) {
                    System.out.println("Kategori: Investasi Besar");
                } else if (dollar >= 100) {
                    System.out.println("Kategori: Investasi Menengah");
                } else if (dollar >= 10) {
                    System.out.println("Kategori: Investasi Kecil");
                } else {
                    System.out.println("Kategori: Uang Saku");
                }

                // Perhitungan biaya transaksi (contoh: 1% dari nilai tukar)
                double biayaTransaksi = dollar * 0.01;
                double totalDiterima = dollar - biayaTransaksi;
                System.out.println("Perkiraan biaya transaksi (1%): $" + df.format(biayaTransaksi));
                System.out.println("Jumlah yang diterima: $" + df.format(totalDiterima));
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                System.out.println("Silakan pilih angka 1, 2, atau 3");
        }

        // Pesan penutup
        System.out.println("\nTerima kasih telah menggunakan Konverter Satuan!");
        scanner.close();
    }
}