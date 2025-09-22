public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        // - Buat variabel boolean: isLoggedIn = true, hasPermission = false
        boolean isLoggedIn = true, hasPermission = false;

        // - Gunakan operator AND untuk mengecek apakah user bisa akses admin panel (kedua kondisi harus true)
        boolean bisaAksesAdmin = isLoggedIn && hasPermission;
        System.out.println("apakah user bisa akses admin panel ? " + bisaAksesAdmin);

        // - Test keempat kombinasi operator AND:
        // true && true, true && false, false && true, false && false
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        // Latihan 2: Berlatih operator OR (||)
        // - Buat variabel boolean: isWeekend = false, isHoliday = true
        boolean isWeekend = false, isHoliday = true;

        // - Gunakan operator OR untuk mengecek apakah hari libur (salah satu kondisi bisa true)
        boolean hariLibur = isWeekend || isHoliday;
        System.out.println("apakah hari libur ?" + hariLibur);

        // - Test keempat kombinasi operator OR:
        // true || true, true || false, false || true, false || false
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));

        // Latihan 3: Berlatih operator NOT (!)
        // - Buat variabel boolean: isRaining = true
        boolean isRaining = true;

        // - Gunakan operator NOT untuk membuat variabel 'isSunny'
        boolean isSunny = !isRaining;
        System.out.println("Is Sunny ? " + isSunny);

        // - Terapkan operator NOT dua kali (!(!isRaining)) dan amati hasilnya
        System.out.println("Hasil NOT dua kali (!(!isRaining)) : " + (!(!isRaining)));

        // - Gunakan NOT dengan perbandingan: !(5 > 3) dan jelaskan hasilnya
        System.out.println("NOT dengan perbandingan: !(5 > 3) : " + (!(5 > 3)));
        // hasilnya adalah false karena ada tanda seru sebelum 5>3. pernyataanya benar 5>3 tetapi karena ada operator not sehingga nilai nya false

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        // - Buat variabel untuk evaluasi siswa
        // attendanceGood = true, gradesHigh = false, behaviorGood = true
        boolean attendanceGood = true, gradesHigh = false, behaviorGood = true;

        // - Buat ekspresi untuk "siswa outstanding": attendanceGood && gradesHigh && behaviorGood
        boolean siswaOutStanding = attendanceGood && gradesHigh && behaviorGood;
        System.out.println("Siswa Outstanding : " + siswaOutStanding);

        // - Buat ekspresi untuk "siswa memuaskan": attendanceGood && (gradesHigh || behaviorGood)
        boolean siswaMemuaskan = attendanceGood && (gradesHigh || behaviorGood);
        System.out.println("siswa memuaskan : " + siswaMemuaskan);

        // - Buat ekspresi untuk "perlu perbaikan": !attendanceGood || !behaviorGood
        boolean perluPerbaikan = !attendanceGood || !behaviorGood;
        System.out.println("Perlu Perbaikan : " + perluPerbaikan);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        // - Buat variabel untuk sistem keamanan
        // hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false
        boolean hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false;

        // - Buat logika untuk akses normal: hasKeyCard && knowsPassword && isAuthorizedTime
        boolean aksesNormal = hasKeyCard && knowsPassword && isAuthorizedTime;
        System.out.println("Akses Normal : " + aksesNormal);

        // - Buat logika untuk akses darurat: isEmergency || (hasKeyCard && isAuthorizedTime)
        boolean aksesDarurat = isEmergency || (hasKeyCard && isAuthorizedTime);
        System.out.println("Akses Darurat : " + aksesDarurat);

        // - Buat logika untuk akses ditolak: !(akses normal OR akses darurat)
        boolean aksesDitolak = !(aksesNormal || aksesDarurat);
        System.out.println("Akses Ditolak : " + aksesDitolak);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        // - Buat variabel kondisi cuaca
        // isRaining = false, isSnowing = true, temperature = -5, isCloudy = true
        boolean isRaining2 = false, isSnowing = true, isCloudy = true;
        int temperature = -5;

        // - Tentukan apakah cuaca bagus untuk aktivitas outdoor
        // Cuaca bagus: tidak hujan AND tidak salju AND suhu > 0
        boolean cuacaBagus = !isRaining2 && !isSnowing && temperature > 0;
        System.out.println("Cuaca Bagus : " + cuacaBagus);

        // - Tentukan apakah Anda butuh payung: isRaining OR (isCloudy AND temperature > 20)
        boolean butuhPayung = isRaining2 || (isCloudy && temperature > 20);
        System.out.println("Butuh Payung : " + butuhPayung);

        // - Tentukan apakah jalan mungkin berbahaya: isSnowing OR (isRaining AND temperature < 5)
        boolean jalanBerbahaya = isSnowing || (isRaining2 && temperature < 5);
        System.out.println("apakah jalan mungkin berbahaya : " + jalanBerbahaya);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        // - Buat variabel: a = 5, b = 0
        int a = 5, b = 0;

        // - Buat ekspresi boolean: (b != 0) && (a / b > 2)
        // Ini TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean shortCircuit = (b != 0) && (a / b > 2);
        System.out.println("Hasil : " + shortCircuit);

        // - Buat ekspresi lain: (b == 0) || (a / b > 2)
        // Ini juga TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean shortCircuit2 = (b == 0) || (a / b > 2);
        System.out.println("Hasil : " + shortCircuit2);

        // - Jelaskan dalam komentar mengapa ekspresi ini aman
        /*
        ekspresi (b != 0) && (a / b > 2) aman, karenaperilaku short-circuit AND dimana jika kondisi pertama
        false, kondisi kedua tidak dicek.

        ekspresi (b == 0) || (a / b > 2) aman, karena perilaku short-circuit OR dimana jika kondisi pertama
        true, kondisi kedua tidak dicek.
         */


        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)
        // - Buat variabel untuk simulasi operasi mahal
        // expensiveCheck1 = false, expensiveCheck2 = true
        boolean expensiveCheck1 = false, expensiveCheck2 = true;

        // - Simulasikan AND short-circuit: expensiveCheck1 && expensiveCheck2
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
        boolean andShort = expensiveCheck1 && expensiveCheck2;
        System.out.println("AND short-circuit : " + andShort);
        // Karena expensiveCheck1 false, expensiveCheck2 tidak akan dicek dan method untuk expensiveCheck2 tidak akan dipanggil

        // - Simulasikan OR short-circuit: expensiveCheck2 || expensiveCheck1
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
        boolean orCircuit = expensiveCheck2 || expensiveCheck1;
        System.out.println("OR short-circuit : " + orCircuit);
        // Karena expensiveCheck2 true, expensiveCheck1 tidak akan dievaluasi dan method untuk expensiveCheck1 tidak akan dipanggil
    }
}
