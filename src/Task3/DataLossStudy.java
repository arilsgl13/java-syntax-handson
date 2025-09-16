package Task3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!
        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!
        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // Kasus 3: Konversi Mata Uang (Rupiah ke Dollar)
        System.out.println("\n3. Konversi Mata Uang:");
        double rupiahAsli = 15_750.75; // Rp 15,750.75
        double kursUSD = 15_420.50; // 1 USD = Rp 15,420.50
        double dollarPrecise = rupiahAsli / kursUSD; // 1.0214... USD
        int dollarRounded = (int) dollarPrecise; // Data loss pada desimal!
        System.out.println("Rupiah asli: Rp " + rupiahAsli);
        System.out.println("Kurs USD: Rp " + kursUSD + "/USD");
        System.out.println("Dollar (presisi): $" + String.format("%.6f", dollarPrecise));
        System.out.println("Dollar (int casting): $" + dollarRounded);
        System.out.println("Nilai rupiah yang hilang: Rp " +
                String.format("%.2f", (dollarPrecise - dollarRounded) * kursUSD));

        // Kasus 4: Pengukuran Jarak GPS
        System.out.println("\n4. Pengukuran Jarak GPS:");
        double jarakGPSMeter = 1_247.8934; // Jarak dalam meter dengan presisi tinggi
        float jarakFloat = (float) jarakGPSMeter; // Data loss pada presisi!
        int jarakKilometer = (int) (jarakGPSMeter / 1000); // Konversi ke km, kehilangan detail
        System.out.println("Jarak GPS asli (double): " + jarakGPSMeter + " meter");
        System.out.println("Jarak setelah casting ke float: " + jarakFloat + " meter");
        System.out.println("Jarak dalam kilometer (int): " + jarakKilometer + " km");
        System.out.println("Presisi yang hilang (double vs float): " +
                (jarakGPSMeter - jarakFloat) + " meter");
        System.out.println("Detail yang hilang dalam konversi km: " +
                (jarakGPSMeter - (jarakKilometer * 1000)) + " meter");

        // Kasus 5: Perhitungan Waktu dengan Milidetik
        System.out.println("\n5. Perhitungan Waktu:");
        double waktuMilidetik = 5_436.789; // 5436.789 milidetik
        int waktuDetik = (int) (waktuMilidetik / 1000); // Konversi ke detik, data loss!
        long waktuLong = (long) waktuMilidetik; // Hilang desimal
        System.out.println("Waktu asli: " + waktuMilidetik + " ms");
        System.out.println("Waktu dalam detik (int): " + waktuDetik + " detik");
        System.out.println("Waktu setelah casting ke long: " + waktuLong + " ms");
        System.out.println("Milidetik yang tidak terhitung: " +
                (waktuMilidetik - (waktuDetik * 1000)) + " ms");
        System.out.println("Presisi desimal yang hilang: " +
                (waktuMilidetik - waktuLong) + " ms");


    }
}