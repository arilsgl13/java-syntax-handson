package Task5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== SISTEM PERHITUNGAN NILAI ===");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Mata Kuliah: ");
        String mataKuliah = scanner.nextLine();

        // Input komponen nilai dengan validasi
        double nilaiTugas = inputNilaiValid(scanner, "Nilai Tugas (0-100): ");
        double nilaiUTS = inputNilaiValid(scanner, "Nilai UTS (0-100): ");
        double nilaiUAS = inputNilaiValid(scanner, "Nilai UAS (0-100): ");

        // Hitung nilai akhir (bobot: Tugas 30%, UTS 30%, UAS 40%)
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

        // Tentukan grade huruf
        char gradeHuruf;
        String keterangan;
        if (nilaiAkhir >= 85) {
            gradeHuruf = 'A';
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = 'D';
            keterangan = "Kurang";
        } else {
            gradeHuruf = 'E';
            keterangan = "Gagal";
        }

        // Konversi nilai ke skala 4.0
        double skala4 = konversiKeSkala4(gradeHuruf);

        // Status kelulusan (lulus jika >= 60)
        boolean lulus = nilaiAkhir >= 60;
        String statusKelulusan = lulus ? "LULUS" : "TIDAK LULUS";

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("Mahasiswa     : " + nama);
        System.out.println("Mata Kuliah   : " + mataKuliah);
        System.out.println("-----------------------------------");
        System.out.println("Komponen Nilai:");
        System.out.println("  Tugas (30%)  : " + nilaiTugas);
        System.out.println("  UTS (30%)    : " + nilaiUTS);
        System.out.println("  UAS (40%)    : " + nilaiUAS);
        System.out.println("-----------------------------------");
        System.out.println("Nilai Akhir   : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade         : " + gradeHuruf);
        System.out.println("Skala 4.0     : " + String.format("%.2f", skala4));
        System.out.println("Keterangan    : " + keterangan);
        System.out.println("Status        : " + statusKelulusan);

        // Analisis dan rekomendasi
        System.out.println("\n=== ANALISIS NILAI ===");
        analisisKomponen(nilaiTugas, nilaiUTS, nilaiUAS);

        if (!lulus) {
            System.out.println("\n=== REKOMENDASI ===");
            System.out.println("- Anda perlu meningkatkan nilai untuk mencapai batas kelulusan (60)");
            double kekurangan = 60 - nilaiAkhir;
            System.out.println("- Kekurangan nilai: " + String.format("%.2f", kekurangan) + " poin");
            System.out.println("- Fokus pada komponen dengan bobot tertinggi (UAS 40%)");
        } else if (nilaiAkhir < 85) {
            System.out.println("\n=== MOTIVASI ===");
            double selisihA = 85 - nilaiAkhir;
            System.out.println("- Selamat! Anda telah lulus mata kuliah ini");
            System.out.println("- Untuk mencapai grade A, tingkatkan " + String.format("%.2f", selisihA) + " poin lagi");
        } else {
            System.out.println("\n=== APRESIASI ===");
            System.out.println("- Luar biasa! Anda mendapat grade A");
            System.out.println("- Pertahankan prestasi yang excellent ini!");
        }

        scanner.close();
    }

    // Method untuk validasi input nilai (harus 0-100)
    public static double inputNilaiValid(Scanner scanner, String prompt) {
        double nilai;
        do {
            System.out.print(prompt);
            nilai = scanner.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100. Silakan input ulang.");
            }
        } while (nilai < 0 || nilai > 100);
        return nilai;
    }

    // Method untuk konversi nilai ke skala 4.0
    public static double konversiKeSkala4(char grade) {
        switch (grade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'E':
                return 0.0;
            default:
                return 0.0;
        }
    }

    // Method untuk analisis komponen nilai
    public static void analisisKomponen(double tugas, double uts, double uas) {
        double tertinggi = Math.max(Math.max(tugas, uts), uas);
        double terendah = Math.min(Math.min(tugas, uts), uas);

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Selisih        : " + String.format("%.2f", tertinggi - terendah));

        // Identifikasi komponen terbaik dan terlemah
        String komponenTerbaik = "";
        String komponenTerlemah = "";

        if (tugas == tertinggi) komponenTerbaik = "Tugas";
        else if (uts == tertinggi) komponenTerbaik = "UTS";
        else komponenTerbaik = "UAS";

        if (tugas == terendah) komponenTerlemah = "Tugas";
        else if (uts == terendah) komponenTerlemah = "UTS";
        else komponenTerlemah = "UAS";

        System.out.println("Komponen terbaik : " + komponenTerbaik);
        System.out.println("Komponen terlemah: " + komponenTerlemah);
    }
}
