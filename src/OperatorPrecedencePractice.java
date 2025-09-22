public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2
        int a = 10, b = 5, c = 2;

        // - Hitung hasil dari: a + b * c
        int hasil = a + b * c;
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        System.out.println("Hasil : " + hasil);
        // - Tambahkan komentar dengan prediksi vs hasil aktual
        // prediksi hasil adalah 20 karena yang dikerjakan terlebih dahulu adalah *
        // hasil aktualnya adalah 20


        // - Hitung hasil dari: (a + b) * c
        int hasil2 = (a + b) * c;
        System.out.println("Hasil2 : " + hasil2);
        // - Bandingkan dengan hasil sebelumnya
        /*
        * kalau hasil sebelumnya 20 karena yang dikerjakan adalah * dulu
        * sekarang hasilnya 30 karena a+b dibungkus didalam tanda kurung sehingga yang dieksekusi terlebih dahulu adalah yang didalam kurung
        *
        * */


        // - Hitung hasil dari: a * b + c / 2
        int hasil3 =  a * b + c / 2;
        System.out.println("Hasil3 : " + hasil3);
        // - Jelaskan urutan operasi dalam komentar
        /*
        * yang dieksekusi terlebih dahulu adalah perkalian
        * lalu eksekusi pembagian
        * dan terakhir adalah eksekusi penjumlahan
        * */

        // - Hitung hasil dari: a / b + c * 2
        int hasil4 = a / b + c * 2;
        System.out.println("Hasil4 : " + hasil4);
        // - Tunjukkan evaluasi step-by-step dalam komentar
        /*
        * pertama eksekusi a/b
        * lalu eksekusi c*2
        * dan terakhir eksekusi hasil a/b ditambahkan dengan hasil c*2
        *
        * */

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15, y = 10, z = 20;

        // - Evaluasi: x + y > z - 5
        boolean evaluasi = x + y > z - 5;
        System.out.println("evaluasi : " + evaluasi);
        // - Uraikan urutan evaluasi dalam komentar
        /*
        * eksekusi x + y
        *eksekusi z - 5
        * lalu mengeksekusi perbandingan lebih besar mana hasil x + y dengan z - 5
        *
        * */

        // - Evaluasi: x > y + z / 4
        boolean evaluasi2 = x > y + z / 4;
        System.out.println("evaluasi2 : " + evaluasi2);
        // - Jelaskan operasi mana yang terjadi lebih dulu
        /*
        * pertama mengeksekusi z / 4
        * lalu y + hasil z/4
        * dan terakhir melakukan perbandingan dengan x
        * */

        // - Evaluasi: (x + y) > (z - 5) && x < z
        boolean evaluasi3 = (x + y) > (z - 5) && x < z;
        System.out.println("evaluasi3 : " + evaluasi3);
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi
        /*
        * nilai di dalam tanda kurung akan dikerjakan terlebih dahulu yang (x+y) dan (z - 5)
        * lalu melakukan perbandingan apakah hasil (x+y) lebih besar dari (z - 5) dan apakah x lebih kecil dari z
        * lalu terakhir mengerjakan operator &&
        *
        * */

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        boolean evaluasi4 = x * 2 + y > z && y < x + 5;
        System.out.println("evaluasi4 : " + evaluasi4);
        // - Prediksi hasilnya, lalu verifikasi
        /*
        * prediksi = true
        * hasil akhir yang benar : true
        *
        * */

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true, q = false, r = true;

        // - Evaluasi: p && q || r
        boolean evaluasiLogika =  p && q || r;
        System.out.println("evaluasiLogika : " + evaluasiLogika);
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||
        //operator && memiliki precedence lebih tinggi karena mirip dengan operator perkalian, dimana operasi perkalian dilakukan dulu sebelum penjumlahan.

        // - Evaluasi: p || q && r
        boolean evaluasiLogika2 = p || q && r;
        System.out.println("evaluasiLogika2 : " + evaluasiLogika2);
        // - Bandingkan dengan hasil sebelumnya
        // tidak ada perbedaan sama sama menghasilkan nilai true

        // - Evaluasi: !p && q || r
        boolean evaluasiLogika3 = !p && q || r;
        System.out.println("evaluasiLogika3 : " + evaluasiLogika3);
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi
        /*
        * ! akan dieksekusi terlebih dahulu
        * !p = !true = false
        * !p && q = false && false = false
        * false || r = false || true = true
        *
        * */
        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        boolean evaluasiLogika4 = p && (q || r);
        System.out.println("evaluasiLogika4 : " + evaluasiLogika4);
        // - Bandingkan dengan p && q || r
        /*
        * Seperti biasa yang dikerjakan terlebih dahulu adalah yang didalam kurung
        * untuk perbandingan sama sama menghasilkan nilai true tetapi beda cara
        * yang !p && q || r akan menghasilkan false || true
        * sedangkan p && (q || r) menghasilkan true && true
        * */

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25, num2 = 15, num3 = 30;

        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        boolean evaluasiArit = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("evaluasiArit : " + evaluasiArit);
        // - Uraikan urutan evaluasi lengkap
        // urutan evaluasi: /, +, >, <, &&

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        boolean evaluasiArit2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("evaluasiArit2 : " + evaluasiArit2);
        // - Tunjukkan evaluasi step-by-step
        /*
        * num1 + num2
        * num3 - num1
        * hasil num1 + num2 > 30
        * hasil num3 - num1 < 10
        * num2 > 10
        * true || true && true = true && true = true
        * true || true = true
        * */

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        boolean evaluasiArit3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("evaluasiArit3 : " + evaluasiArit3);
        // - Bandingkan hasil dan jelaskan perbedaannya
        // hasilnya sama sama true yang beda urutan evaluasi atau pengrejaanya

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8
        int value = 8;

        // - Evaluasi: ++value * 2
        int evaluasiUnary = ++value * 2;
        System.out.println("evaluasiUnary : " + evaluasiUnary);
        // - Jelaskan operasi mana yang terjadi lebih dulu
        // Operasi yang terjadi lebih dulu adalah ++value karena precendencenya lebih tinggi
        // - Reset value ke 8, lalu evaluasi: value++ * 2
        value = 8;
        int evaluasiUnary2 = value++ * 2;
        System.out.println("evaluasiUnary2 : " + evaluasiUnary2);
        // - Bandingkan dengan hasil sebelumnya
        /*
        * yang sebelumnya ++value jadi nilai dari value ditambahkan dulu baru dipakai
        * yang sekarang value++ nilai value dipakai dulu baru dijumlahkan
        * */

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        value = 8;
        int evaluasiUnary3 = 2 * ++value;
        System.out.println("evaluasiUnary3 : " + evaluasiUnary3);
        // - Amati urutan evaluasi
        // urutan evaluasi = ++value baru kali

        // - Reset value ke 8, lalu evaluasi: -value + 10
        value = 8;
        int evaluasiUnary4 = -value + 10;
        System.out.println("evaluasiUnary4 : " + evaluasiUnary4);
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi
        // -value = -8 lalu -8 + 10 = 2

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10
        a = 5;
        b = 10;

        // - Evaluasi dan jelaskan: a += b * 2
        a += b * 2;
        System.out.println("a += b * 2 adalah " + a);
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment
        // yang dikerjakan b*2 lalu a += 20.

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        a = 5;
        a *= b + 3;
        System.out.println(" a *= b + 3 adalah " + a);
        // - Jelaskan urutan evaluasi
        // urutan evaluasi adalah dilakukan + baru mengerjakan *=

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        a = b > 5 ? b * 2 : b / 2;
        System.out.println("a = b > 5 ? b * 2 : b / 2 adalah " + a);
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment
        /*
        * jika b > 5 = true, maka a = b * 2 = 20
        * jika b > 5 = false, maka a = b / 2 = 5
        * b > 5 jadi 10 > 5 = true
        * maka a = true ? 20 : 5 dan hasilnya adalah a = 20
        * */

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6
        a = 8;
        b = 4;
        c = 2;
        int d = 6;

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        int bandingHasil = a + b * c - d;
        System.out.println("a + b * c - d : " + bandingHasil);
        int bandingHasil2 = (a + b) * (c - d);
        System.out.println("(a + b) * (c - d) : " + bandingHasil2);
        // - Tunjukkan langkah kalkulasi untuk keduanya
        /*
        * a + b * c - d pengerjaan b * c = 4 * 2 = 8
        *                          a + 8 = 8 + 8 = 16
        *                          16 - d = 16 - 6 = 10
        *
        * (a + b) * (c - d) pengerjaan a + b = 8 + 4 = 12
        *                              c - d = 2 - 6 = -4
        *                              12 * -4 = -48
        * */

        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        boolean bandingHasil3 = a > b && c < d || a == b;
        System.out.println("a > b && c < d || a == b : " + bandingHasil3);
        boolean bandingHasil4 =  a > b && (c < d || a == b);
        System.out.println(" a > b && (c < d || a == b) : " + bandingHasil4);
        // - Jelaskan bagaimana tanda kurung mengubah logika
        /*
        * kalau ada tanda kurung maka akan membuat ekspresi di dalamnya harus dievaluasi duluan
        * kalau ngga ada maka yang dievaluasi duluan adalah && tetapi karna tanda kurung membungkus ||
        * maka yg di evaluasi dulu adalah || walaupun && lebih tinggi
        *
        * */

        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        boolean nestedKompleks = ((a + b) * c) / (d - 2) > (a - b);
        System.out.println("((a + b) * c) / (d - 2) > (a - b) = " + nestedKompleks);
        // - Tunjukkan evaluasi step-by-step
        // urutan evaluasi: +, *, -, /, -, >
    }
}
