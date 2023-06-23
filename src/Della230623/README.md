    Nama : Della Putri Herman
    No BP : 2201082024
    Kelas : TK 1A
---------------------------------------------------------------------------------------------------------

      Panjelasan Codingan MAKHLUK HIDUP
      
Codingan Makhluk Hidup merupakan definisi dari kelas abstrak `MakhlukHidup` dalam bahasa pemrograman Java. Berikut adalah penjelasan untuk setiap bagian kode:

1. `public abstract class MakhlukHidup`: Mendefinisikan kelas abstrak dengan nama `MakhlukHidup`. Kata kunci `public` menandakan bahwa kelas ini dapat diakses dari kelas lain. Kata kunci `abstract` menandakan bahwa kelas ini adalah sebuah kelas abstrak yang tidak dapat diinstansiasi secara langsung.

2. `public void bernafas()`: Ini adalah sebuah metode (atau fungsi) yang dideklarasikan dalam kelas `MakhlukHidup`. Metode ini memiliki kata kunci `public` yang menandakan bahwa metode ini dapat diakses dari luar kelas. Tipe data `void` menunjukkan bahwa metode ini tidak mengembalikan nilai apa pun. Metode ini mengeluarkan teks "Bernafas" dengan menggunakan `System.out.println()`, yang akan mencetak teks ke konsol saat metode ini dipanggil.

3. `public abstract void jalan()`: Ini adalah sebuah metode abstrak yang dideklarasikan dalam kelas `MakhlukHidup`. Kata kunci `abstract` menandakan bahwa metode ini hanya dideklarasikan di kelas ini dan harus diimplementasikan di kelas turunannya. Metode ini tidak memiliki implementasi (kode), dan kelas yang mewarisi `MakhlukHidup` harus memberikan implementasi untuk metode `jalan()`.

Kelas abstrak biasanya digunakan sebagai kerangka dasar untuk kelas-kelas turunan yang lebih spesifik. Dalam hal ini, `MakhlukHidup` memberikan beberapa fitur dasar (metode bernafas) dan membutuhkan implementasi khusus untuk metode `jalan()` dari kelas-kelas turunannya.

---------------------------------------------------------------------------------------------------------

    Penjelasan Codingan PERSEGI PANJANG

Codingan Persegi panjang merupakan implementasi kelas `PersegiPanjang` yang mengimplementasikan antarmuka `Relation` dalam bahasa pemrograman Java. Berikut adalah penjelasan untuk setiap bagian kode:

1. `public class PersegiPanjang implements Relation`: Mendefinisikan kelas `PersegiPanjang` yang mengimplementasikan antarmuka `Relation`. Dengan melakukan implementasi tersebut, kelas `PersegiPanjang` harus menyediakan implementasi untuk semua metode yang didefinisikan dalam antarmuka `Relation`.

2. `private float panjang` dan `private float lebar`: Mendeklarasikan dua variabel angka desimal (`float`) yang menyimpan nilai panjang dan lebar persegi panjang. Variabel ini bersifat private, yang berarti hanya dapat diakses di dalam kelas `PersegiPanjang` sendiri.

3. Konstruktor `PersegiPanjang()`: Konstruktor tanpa parameter yang tidak melakukan apa-apa. Ini adalah konstruktor default yang diperlukan karena ada konstruktor lain yang didefinisikan dalam kelas ini.

4. Konstruktor `PersegiPanjang(int panjang, int lebar)`: Konstruktor yang menerima dua parameter bertipe integer (`int`) untuk menginisialisasi nilai panjang dan lebar persegi panjang.

5. Metode `getLuas()`: Metode yang mengembalikan hasil perkalian panjang dengan lebar, yang merupakan luas persegi panjang.

6. Metode `getKeliling()`: Metode yang mengembalikan hasil perhitungan keliling persegi panjang, yaitu dua kali jumlah panjang dan lebar.

7. Implementasi metode `isGreater(Object a, Object b)`: Metode ini mengimplementasikan metode `isGreater` dari antarmuka `Relation`. Metode ini membandingkan luas dari dua objek `PersegiPanjang` yang diberikan sebagai parameter dan mengembalikan `true` jika luas objek pertama lebih besar daripada luas objek kedua.

8. Implementasi metode `isLess(Object a, Object b)`: Metode ini mengimplementasikan metode `isLess` dari antarmuka `Relation`. Metode ini membandingkan luas dari dua objek `PersegiPanjang` yang diberikan sebagai parameter dan mengembalikan `true` jika luas objek pertama lebih kecil daripada luas objek kedua.

9. Implementasi metode `isEqual(Object a, Object b)`: Metode ini mengimplementasikan metode `isEqual` dari antarmuka `Relation`. Metode ini membandingkan luas dari dua objek `PersegiPanjang` yang diberikan sebagai parameter dan mengembalikan `true` jika luas objek pertama sama dengan luas objek kedua.

10.Metode main(String[] args): Metode utama yang akan dieksekusi saat menjalankan program. Di dalamnya, dua objek PersegiPanjang (p1 dan p2) diinisialisasi dengan panjang dan lebar tertentu. Kemudian, objek PersegiPanjang baru diciptakan dan disimpan dalam variabel r yang bertipe Relation. Akhirnya, hasil perbandingan luas antara p1 dan p2 dicetak ke konsol menggunakan metode isGreater() dan isLess() dari objek r.

Dengan mengimplementasikan antarmuka Relation, kelas PersegiPanjang dapat membandingkan luas dua objek PersegiPanjang dan memberikan hasil perbandingannya.

-------------------------------------------------------------------------------------------------------------------------------------------

     Penjelasan Codingan RELATION

Codingan Relation merupakan definisi dari antarmuka (interface) `Relation` dalam bahasa pemrograman Java. Berikut adalah penjelasan untuk setiap bagian kode:

1. `public interface Relation`: Mendefinisikan antarmuka dengan nama `Relation`. Antarmuka adalah kumpulan metode yang tidak memiliki implementasi dan hanya memiliki deklarasi metode.

2. `public boolean isGreater(Object a, Object b)`: Ini adalah deklarasi metode `isGreater()` dalam antarmuka `Relation`. Metode ini menerima dua parameter bertipe `Object` (objek generik) yang akan dibandingkan, dan mengembalikan `true` jika objek `a` lebih besar dari objek `b`, dan `false` sebaliknya.

3. `public boolean isLess(Object a, Object b)`: Ini adalah deklarasi metode `isLess()` dalam antarmuka `Relation`. Metode ini menerima dua parameter bertipe `Object` (objek generik) yang akan dibandingkan, dan mengembalikan `true` jika objek `a` lebih kecil dari objek `b`, dan `false` sebaliknya.

4. `public boolean isEqual(Object a, Object b)`: Ini adalah deklarasi metode `isEqual()` dalam antarmuka `Relation`. Metode ini menerima dua parameter bertipe `Object` (objek generik) yang akan dibandingkan, dan mengembalikan `true` jika objek `a` sama dengan objek `b`, dan `false` sebaliknya.

Antarmuka `Relation` menyediakan tiga metode untuk melakukan perbandingan antara dua objek. Metode-metode ini akan diimplementasikan di kelas-kelas yang mengimplementasikan antarmuka `Relation` sesuai dengan logika perbandingan yang diinginkan.    

--------------------------------------------------------------------------------------------------------------------------------------

    Penjelasan Codingan Manusia

Codingan Manusia merupakan implementasi kelas `Manusia` yang merupakan turunan dari kelas abstrak `MakhlukHidup` dalam bahasa pemrograman Java. Berikut adalah penjelasan untuk setiap bagian kode:

1. `public class Manusia extends MakhlukHidup`: Mendefinisikan kelas `Manusia` yang merupakan turunan dari kelas abstrak `MakhlukHidup`. Dengan melakukan pewarisan ini, kelas `Manusia` akan mewarisi semua metode dan properti dari kelas `MakhlukHidup` dan juga harus memberikan implementasi untuk metode abstrak `jalan()` yang dideklarasikan dalam `MakhlukHidup`.

2. Metode `jalan()`: Ini adalah implementasi metode `jalan()` yang didefinisikan dalam kelas `Manusia`. Metode ini mencetak teks "Berjalan Manusia" ke konsol saat dipanggil.

3. Metode `main(String[] args)`: Metode utama yang akan dieksekusi saat menjalankan program. Di dalamnya, objek `Manusia` baru dibuat menggunakan operator `new` dan disimpan dalam variabel `m`. Kemudian, metode `bernafas()` dari kelas `MakhlukHidup` dipanggil melalui objek `m` untuk mencetak teks "Bernafas". Selanjutnya, metode `jalan()` dari kelas `Manusia` dipanggil melalui objek `m` untuk mencetak teks "Berjalan Manusia".

Dengan mewarisi dari kelas abstrak `MakhlukHidup`, kelas `Manusia` memiliki implementasi untuk metode `jalan()`, dan dapat menggunakan metode `bernafas()` yang didefinisikan dalam kelas `MakhlukHidup`.    
