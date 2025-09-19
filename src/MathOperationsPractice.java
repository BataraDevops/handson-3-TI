public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int penjumlahan = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int pengurangan = num1 - num2;


        // - Hitung dan simpan hasil perkalian num1 dan num2
        int perkalian = num1 * num2;


        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int pembagian = num1 / num2;


        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int sisaBagi = num1 % num2;


        // - Print semua hasil dengan label yang deskriptif
        System.out.println(num1 + " + " + num2 + " = " + penjumlahan);
        System.out.println(num1 + " - " + num2 + " = " + pengurangan);
        System.out.println(num1 + " x " + num2 + " = " + perkalian);
        System.out.println(num1 + " : " + num2 + " = " + pembagian);
        System.out.println(num1 + " % " + num2 + " = " + sisaBagi);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int pembagianInt = 17 / 5;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double nilai1 = 17.0;
        int nilai2 = 5;
        double result = nilai1 / nilai2;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        int nilai3 = 17;
        int nilai4 = 5;
        double hasil = (double)nilai3 / nilai4;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("17 / 5 = " + pembagianInt);
        System.out.println(nilai1 + " / " + nilai2 + " = " + result);
        System.out.println(nilai3 + " / " + nilai4 + " = " + hasil);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
            double panjang = 12.5, lebar = 8.3;
            double luas = panjang * lebar;
        // - Hitung keliling persegi panjang yang sama
            double keliling = 2 * (panjang + lebar);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double totalHargaBarang = 3 * 15.99;
        double totalpajak = totalHargaBarang * 0.08;
        double totalHarga =totalHargaBarang + totalpajak;


        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        int celcius = 25;
        double fahrenheit = (celcius * 9/5) + 32;

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int totalHari = 50;
        int hariPerMinggu = 7;
        int totalMinggu = totalHari / hariPerMinggu;
        int sisaHari = totalHari % hariPerMinggu;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("Luas Persegi Panjang : " + panjang + " x " + lebar + " = " + luas);
        System.out.println("Keliling Persegi Panjang :  2 x (" + panjang + " + " + lebar + ") = " + keliling );
        System.out.println("Total Harga : $ " + totalHarga);
        System.out.println(celcius + "C = " + fahrenheit + "F");
        System.out.println("total minggu penuh dalam 50 hari = " + totalMinggu + " minggu dan sisa = " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5, waktu = 2.75;
        double jarak = kecepatan * waktu;

        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun

        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88

        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())


    }
}
