Nama : Della Putri Herman

No BP : 2201082024

     PENJELASAN KODE PROGRAM MODUL 5
     
     
README MODUL 5.1

Kode program MODUL 5.1 adalah program Java yang meminta pengguna memasukkan tiga kata dan kemudian menampilkannya di konsol. Program menggunakan kelas BufferedReader dan InputStreamReader untuk membaca masukan dari pengguna.

Program pertama-tama mendeklarasikan tiga variabel String, nama, nama, dan namawa, dan menginisialisasinya menjadi string kosong.

Program kemudian membuat tiga instance BufferedReader, masing-masing melilit InputStreamReader yang membaca input dari aliran System.in.

Untuk masing-masing dari tiga kata, program meminta pengguna untuk memasukkan kata dengan mencetak pesan ke konsol menggunakan metode System.out.print(), dan kemudian membaca masukan pengguna menggunakan metode readLine() dari kelas BufferedReader . Jika pengecualian terjadi saat membaca masukan pengguna, program akan menangkap IOException dan mencetak pesan kesalahan ke konsol.

Terakhir, program mencetak tiga kata yang digabungkan dengan karakter spasi di antaranya, menggunakan metode System.out.println().

Saat dieksekusi, output akan bergantung pada input pengguna. Misalnya, jika pengguna memasukkan "hello", "world", dan "java" sebagai tiga kata, hasilnya adalah: hello world java

Program ini adalah contoh sederhana cara membaca input dari konsol di Java menggunakan kelas BufferedReader dan InputStreamReader dan cara mencetak teks ke konsol menggunakan metode System.out.println().




README MODUL 5.2

Kode program MODUL 5.2 adalah program Java yang meminta pengguna untuk memasukkan tiga kata menggunakan tiga dialog input JOptionPane yang terpisah dan kemudian menampilkan kata yang digabungkan dalam dialog pesan JOptionPane.

Program pertama-tama mendeklarasikan tiga variabel String, nama, nama, dan namawa, dan menginisialisasinya menjadi string kosong.

Program kemudian menggunakan metode JOptionPane.showInputDialog() untuk menampilkan tiga dialog input terpisah, meminta pengguna untuk memasukkan kata di setiap dialog. Setiap dialog input menyimpan input pengguna di salah satu dari tiga variabel String.

Terakhir, program menggabungkan ketiga kata tersebut bersama-sama dengan karakter spasi menggunakan operator + dan menyimpan hasilnya dalam variabel String baru, msg. Program kemudian menggunakan metode JOptionPane.showMessageDialog() untuk menampilkan kata gabungan dalam dialog pesan.

Saat dijalankan, program akan menampilkan tiga dialog input terpisah yang meminta pengguna untuk memasukkan sebuah kata. Setelah pengguna memasukkan kata di setiap dialog, program akan menampilkan dialog pesan yang berisi kata-kata gabungan. Output akan tergantung pada input pengguna.

Program ini adalah contoh sederhana bagaimana menggunakan dialog JOptionPane di Java untuk membaca masukan dari pengguna dan menampilkan keluaran kepada pengguna.
