public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * unary operators, terutama perbedaan antara pre dan post increment/decrement.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5
        int counter = 5;

        // - Gunakan pre-increment (++counter) dan print hasilnya
        ++counter;
        System.out.println("pre-increment = " + counter);
        // - Gunakan post-increment (counter++) dan print hasilnya
        counter++;
        System.out.println("post-increment = " + counter);
        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
        counter = 5;
        --counter;
        System.out.println("pre-decrement = " + counter);

        // - Gunakan post-decrement (counter--) dan print hasilnya
        counter--;
        System.out.println("post-decrement = " + counter);

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST INCREMENT ===");

        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10
        int a = 10;
        int b = 10;

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        // - Print kedua 'a' dan 'result1' - amati nilainya
        int result1 = ++a;
        System.out.println("Pre-increment Nilai a = " + a + " dan Nilai result1 = " + result1);

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        // - Print kedua 'b' dan 'result2' - amati nilainya
        int result2 = b++;
        System.out.println("Post-increment Nilai b = " + b + " dan Nilai result2 = " + result2);

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya
        /*
         * Pre-increment (++a): Variabel diincrement(dijumlahkan) dulu, baru nilainya digunakan
         * Post-increment (b++): Nilai variabel digunakan dulu, baru variabel diincrement(dijumlahkan)
         * Hasil: a = 11 dan result1 = 11 vs b = 11, result2 = 10
        */

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8
        int x = 8;
        int y = 8;

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi
        System.out.println("nilai dari --x = " + --x);
        System.out.println("nilai x = " + x );

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi
        System.out.println("nilai dari y-- = " + y--);
        System.out.println("nilai y = " + y);

        // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus
        /*
         * Pre-decrement (--x): variabel y didecrement(dikurangkan) dulu ketika kita print --y, baru nilainya digunakan
         * Post-decrement (y--): Nilai variabel y digunakan dulu, baru variabel didecrement(dikurangkan)
        */

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42
        int positive = 42;

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive
        int negative = -positive;

        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)
        int backToPositive = -negative;

        // - Print ketiga variabel tersebut
        System.out.println("Unary Positive = " + positive);
        System.out.println("Unary Negative = " + negative);
        System.out.println("Unary Back to Positive = " + backToPositive);

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)
        int unaryPlusDemo = +positive;
        System.out.println("Unary +positive = " + unaryPlusDemo + " tidak berubah nilai dari = " + positive);

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\\n=== OPERATOR BOOLEAN NOT ===");

        // Latihan 5: Berlatih operator boolean NOT
        // - Buat variabel boolean 'isReady' dengan nilai true
        boolean isReady = true;

        // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady
        boolean isNotReady = !isReady;

        // - Print kedua variabel
        System.out.println("nilai tanpa operator NOT = " + isReady + ", Nilai dengan operator NOT = " + isNotReady);

        // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan nol
        // Gunakan angka apapun dan print hasilnya
        boolean mengecek = 5 != 0;
        System.out.println("5 tidak sama dengan 0 = " + mengecek);

        // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya
        boolean doubleTandaSeru = !!isReady;
        System.out.println("operator Not dengan double tanda seru = " + doubleTandaSeru);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Gunakan unary operators dalam skenario praktis
        // - Buat variabel 'attempts' dimulai dari 0
        int attempts = 0;

        // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
        // Print "Attempt: " + attempts setelah setiap increment
        System.out.println("Attempts: " + ++attempts);
        System.out.println("Attempts: " + ++attempts);
        System.out.println("Attempts: " + ++attempts);

        // - Buat variabel 'lives' dimulai dari 3
        int lives = 3;

        // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
        // Print "Lives remaining: " + lives setelah setiap decrement
        System.out.println("Lives remaining :" + --lives);
        System.out.println("Lives remaining :" + --lives);
        System.out.println("Lives remaining :" + --lives);

        // Latihan 7: Loop counters dengan increment/decrement
        // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
        // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
        // Print loop counter setiap iterasi
        int i = 1;
        while (i<=5){
            System.out.println(i++);
        }

        // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
        // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
        // Print "Countdown: " + countdown setiap iterasi
        int countdown = 3;
        while (countdown > 0){
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Skenario increment/decrement kompleks
        // - Buat variabel 'value' dengan nilai awal 5
        int value = 5;

        // - Hitung dan simpan hasil dari: value++ + ++value
        // Print kedua hasil dan nilai akhir dari 'value'
        int hasil = value++ + ++value;
        System.out.println("Hasil value++ + ++value = " + hasil);
        System.out.println("Nilai value sekarang = " + value);

        // - Reset value ke 5, lalu hitung: --value + value--
        // Print kedua hasil dan nilai akhir dari 'value'
        value = 5;
        int hasilValue = --value + value--;
        System.out.println("Hasil  --value + value-- = " + hasilValue);
        System.out.println("Nilai value: " + value);

        // - Prediksi hasilnya sebelum menjalankan dan tambahkan komentar dengan prediksi Anda
        /*
        *  Prediksi : value++ + ++value = 5 + 7 = 12
        * nilai value saat ini = 7
        *
        * Prediksi : --value + value-- = 4 + 4 = 8
        * nilai value saat ini = 3
        * */

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        // - Buat variabel 'score' dengan nilai 10
        int score = 10;

        // - Print hasil dari Math.max(++score, 12)
        // Kemudian print nilai score saat ini
        System.out.println("Hasil Math.max(++score, 12) = " + Math.max(++score, 12));
        System.out.println("Nilai score saat ini = " + score);


        // - Reset score ke 10, lalu print hasil dari Math.max(score++, 12)
        // Kemudian print nilai score saat ini
        score = 10;
        System.out.println("Hasil Math.max(score++, 12) = " + Math.max(score++, 12));
        System.out.println("Nilai score saat ini = " + score);


        // - Komentari perbedaan perilaku yang Anda amati
        /*
        Math.max(++score, 12)  nilai dari scorenya ditambah dulu menjadi 11, kemudian digunakan dalam method menjadi
        Math.max(11, 12) dan mengembalikan nilai tertinggi yaitu 12 sehingga nilai  scorenya jadi 11.

        Math.max(score++, 12) nilai dari scorenya digunakan dulu dalam method jadi Math.max(10, 12) dan mengembalikan
        nilai 12, kemudian nilai scorenya tadi ditambah menjadi 11.
        */
    }
}
