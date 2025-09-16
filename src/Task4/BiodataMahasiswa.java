package Task4;

import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== INPUT BIODATA MAHASISWA ===");

        // Input data menggunakan method Scanner yang tepat
        System.out.print("Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Umur: ");
        int umur = scanner.nextInt();

        System.out.print("IPK: ");
        double ipk = scanner.nextDouble();

        System.out.print("Tinggi Badan (cm): ");
        float tinggiBadan = scanner.nextFloat();

        System.out.print("Status Aktif (true/false): ");
        boolean statusAktif = scanner.nextBoolean();

        // Input tambahan sesuai TODO
        System.out.print("Semester saat ini: ");
        int semester = scanner.nextInt();

        // Membersihkan buffer sebelum membaca String
        scanner.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = scanner.nextLine();

        System.out.print("Tahun masuk: ");
        int tahunMasuk = scanner.nextInt();

        // Output biodata lengkap
        System.out.println("\n=== BIODATA LENGKAP ===");
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Umur      : " + umur + " tahun");
        System.out.println("IPK       : " + ipk);
        System.out.println("Tinggi    : " + tinggiBadan + " cm");
        System.out.println("Status    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));

        // Output untuk data tambahan
        System.out.println("Semester  : " + semester);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("Tahun Masuk : " + tahunMasuk);

        // Informasi tambahan berdasarkan data yang diinput
        System.out.println("\n=== INFORMASI TAMBAHAN ===");
        int tahunSekarang = 2024; // Asumsi tahun saat ini
        int lamaKuliah = tahunSekarang - tahunMasuk;
        System.out.println("Lama kuliah : " + lamaKuliah + " tahun");

        // Kategori IPK
        String kategoriIPK;
        if (ipk >= 3.5) {
            kategoriIPK = "Cumlaude";
        } else if (ipk >= 3.0) {
            kategoriIPK = "Sangat Memuaskan";
        } else if (ipk >= 2.5) {
            kategoriIPK = "Memuaskan";
        } else {
            kategoriIPK = "Perlu Perbaikan";
        }
        System.out.println("Kategori IPK : " + kategoriIPK);

        // Status berdasarkan semester
        String statusMahasiswa;
        if (semester <= 2) {
            statusMahasiswa = "Mahasiswa Baru";
        } else if (semester <= 6) {
            statusMahasiswa = "Mahasiswa Tingkat Menengah";
        } else {
            statusMahasiswa = "Mahasiswa Tingkat Akhir";
        }
        System.out.println("Status Mahasiswa : " + statusMahasiswa);

        scanner.close();
    }
}