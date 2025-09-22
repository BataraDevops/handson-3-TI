public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18
        int firstNum = 25, secondNum = 18;

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum > secondNum = " + (firstNum > secondNum));

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum < secondNum = " + (firstNum < secondNum));

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum >= secondNum = " + (firstNum >= secondNum));

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum <= secondNum = " + (firstNum <= secondNum));

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum == secondNum = " + (firstNum == secondNum));

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum != secondNum = " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99, price2 = 20.0;

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai
        boolean murah = price1 < price2;
        System.out.println("Lebih murah price1? " + murah);

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        boolean perbedaanKurang = (price2 - price1) < 1.0;
        System.out.println("Perbedaan harga itu kurang dari 1.0 kah? " + perbedaanKurang);

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3
        double jumlah = 19.99 + 0.1;
        boolean banding = jumlah == price2;
        System.out.println("sama atau tidak 19.99 + 0.1 dengan 20.0 ? " + banding);

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1 = 'A', letter2 = 'B';

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        System.out.println("letter1 < letter2: " + (letter1 < letter2));

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        char letterA = 'a', letterB = 'B';
        System.out.println("letterA < letterB " + (letterA < letterB));

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char lima = '5';
        boolean bandingDigit = lima >= '0' && lima <= '9';
        System.out.println("Apakah " + lima + " adalah digit? " + bandingDigit);


        // ===== PERBANDINGAN STRING =====
        System.out.println("\\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java", name2 = "Java";

        // - Bandingkan name1 == name2 dan print hasilnya
        System.out.println("name1 == name2 : " + (name1 == name2));

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        System.out.println("name1 == name3 : " + (name1 == name3));
        // karena jika menggunakan new string yang dibandingkan bukannlah isi atau nilainya.

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        System.out.println("name1.equals(name3): " + name1.equals(name3));

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        String name4 = "java";
        System.out.println("name1.equals(name4) : " + name1.equals(name4));

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        System.out.println("name1.equalsIgnoreCase(name4) : " + name1.equalsIgnoreCase(name4));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        int grade = 85, passingGrade = 60, honorRoll = 90;

        // - Periksa apakah siswa lulus menggunakan operator perbandingan
        boolean apakahLulus = grade >= passingGrade;
        System.out.println("Apakah Lulus? : " + apakahLulus);

        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        boolean memenuhi = grade >= honorRoll;
        System.out.println("Memenuhi syarat untuk honor roll ? " + memenuhi);

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;

        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        System.out.println("kelayakan untuk mengemudi ? " + (age >= drivingAge));
        System.out.println("kelayakan untuk memilih ? " + (age >= votingAge));
        System.out.println("kelayakan untuk minum ? " + (age >= drinkingAge));

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60
        int originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60;

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)
        System.out.println("memenuhi syarat untuk diskon bulk ? : " + (originalPrice > discountThreshold));

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior
        System.out.println(" memenuhi syarat untuk diskon senior? :" + (customerAge >= seniorAge));

        // - Gabungkan kondisi untuk menentukan kelayakan akhir
        System.out.println("menentukan kelayakan akhir  : " + ((originalPrice > discountThreshold) || (customerAge >= seniorAge)));

        // ===== PENGUJIAN BATAS =====
        System.out.println("\\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan
        System.out.println("Apakah score berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        score = 0;
        System.out.println("Apakah 0 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));
        score = 100;
        System.out.println("Apakah 100 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));
        score = -1;
        System.out.println("Apakah -1 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));
        score = 101;
        System.out.println("Apakah 101 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        int suhu = 32;
        System.out.println("Apakah suhu 32 C beradala dalam rentang -10 C sampai 40 C? " + ((suhu >= -10) && (suhu <= 40)));

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175, minHeight = 160, maxHeight = 200;

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        System.out.println("Apakah tinggi berada dalam rentang minHeight-maxHeight? " + ((height >= minHeight) && (height <= maxHeight)));

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        score = 87;
        char huruf;
        if (score >=90){
            huruf = 'A';
        } else if (score >= 80) {
            huruf = 'B';
        } else if (score >= 70) {
            huruf = 'C';
        } else if (score >60) {
            huruf ='D';
        }else {
            huruf='F';
        }
        System.out.println("Nilai : " + huruf);
    }
}
