package Task1;
public class NamingConvention {
    public static void main(String[] args) {
        // Buatlah variabel dengan nama yang mengikuti camelCase
        // untuk data mahasiswa berikut:
        // - nama lengkap mahasiswa
        // - nomor induk mahasiswa
        // - IPK semester lalu
        // - status aktif kuliah
        // - alamat rumah
        // - jumlah SKS yang diambil

        // Deklarasi dan inisialisasi variabel dengan camelCase
        String namaLengkapMahasiswa = "Andi Wijaya";
        String nomorIndukMahasiswa = "2023001234";
        double ipkSemesterLalu = 3.75;
        boolean statusAktifKuliah = true;
        String alamatRumah = "Jl. Merdeka No. 45, Jakarta Selatan";
        int jumlahSksYangDiambil = 21;

        // Tampilkan semua data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Lengkap        : " + namaLengkapMahasiswa);
        System.out.println("Nomor Induk         : " + nomorIndukMahasiswa);
        System.out.println("IPK Semester Lalu   : " + ipkSemesterLalu);
        System.out.println("Status Aktif        : " + (statusAktifKuliah ? "Aktif" : "Tidak Aktif"));
        System.out.println("Alamat Rumah        : " + alamatRumah);
        System.out.println("Jumlah SKS Diambil  : " + jumlahSksYangDiambil + " SKS");
        System.out.println("========================");
    }
}