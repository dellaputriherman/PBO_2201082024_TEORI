Nama: Della Putri Herman
No BP: 2201082024

    PENJELASAN KODE PROGRAM MODUL 7
      
README MODUL 7.1 DO WHILE
Kode program MODUL 7.1 DO WHILE adalah sebuah program sederhana dalam bahasa pemrograman Java yang mencetak setiap elemen dalam sebuah array yang berisi nama-nama hari dalam seminggu. Program ini terdiri dari satu kelas bernama "Latihan71DoWhile" yang memiliki metode "main" sebagai titik masuk untuk menjalankan program. Ketika program dijalankan, nama-nama hari akan dicetak ke konsol dalam urutan yang sama seperti urutan di dalam array.

Program ini menggunakan perulangan while untuk mencetak setiap elemen dalam array. Variabel "i" digunakan sebagai indeks untuk mengakses setiap elemen dalam array. Perulangan akan terus berjalan selama "i" kurang dari panjang array, dan pada setiap iterasi, elemen array yang sesuai akan dicetak ke konsol menggunakan perintah "System.out.println(hari[i]);". Setelah mencetak elemen terakhir dalam array, perulangan akan berhenti dan program akan selesai dijalankan.




README MODUL 7.1 FOR LOOP
Kode program  MODUL 7.1 FOR LOOP adalah sebuah program sederhana dalam bahasa pemrograman Java yang mencetak setiap elemen dalam sebuah array yang berisi nama-nama hari dalam seminggu. Program ini terdiri dari satu kelas bernama "Latihan71ForLoop" yang memiliki metode "main" sebagai titik masuk untuk menjalankan program. Ketika program dijalankan, nama-nama hari akan dicetak ke konsol dalam urutan yang sama seperti urutan di dalam array.

Program ini menggunakan perulangan do-while untuk mencetak setiap elemen dalam array. Variabel "i" digunakan sebagai indeks untuk mengakses setiap elemen dalam array. Perulangan akan terus berjalan sampai kondisi while terpenuhi, yaitu selama "i" kurang dari panjang array. Pada setiap iterasi, elemen array yang sesuai akan dicetak ke konsol menggunakan perintah "System.out.println(hari[i]);". Setelah mencetak elemen terakhir dalam array, perulangan akan berhenti dan program akan selesai dijalankan.

Secara fungsional, program ini melakukan hal yang sama seperti program dalam contoh sebelumnya yang menggunakan perulangan while. Namun, perbedaannya terletak pada urutan pengecekan kondisi. Dalam program ini, perulangan do-while memastikan bahwa setidaknya satu iterasi dilakukan sebelum memeriksa kondisi while, sehingga pasti akan mencetak setidaknya satu elemen dalam array.




README MODUL 7.2 BUFFER READER
Kode program MODUL 7.2 BUFFER READER adalah sebuah program sederhana dalam bahasa pemrograman Java yang meminta pengguna untuk memasukkan lima bilangan bulat dan mencetak bilangan terbesar di antara kelima bilangan tersebut. Program ini menggunakan kelas "BufferedReader" untuk membaca masukan pengguna dari konsol dan kelas "Integer" untuk mengonversi masukan pengguna menjadi bilangan bulat.

Program ini terdiri dari satu kelas bernama "Latihan72BufferedReader" yang memiliki metode "main" sebagai titik masuk untuk menjalankan program. Pertama-tama, program membuat objek "BufferedReader" dengan menginisialisasi input stream dengan "System.in" menggunakan konstruktor kelas "InputStreamReader". Kemudian, program membuat array integer dengan panjang 5 untuk menyimpan bilangan-bilangan yang dimasukkan oleh pengguna.

Selanjutnya, program memulai sebuah perulangan for untuk meminta pengguna memasukkan lima bilangan bulat. Pada setiap iterasi, program mencetak pesan "Masukkan angka [i]:" ke konsol, di mana [i] adalah nomor urut bilangan yang diminta (1 sampai 5). Kemudian, program membaca masukan pengguna menggunakan metode "readLine()" dari objek "BufferedReader", mengonversi masukan tersebut ke dalam bilangan bulat menggunakan metode "Integer.parseInt()", dan menyimpannya ke dalam array "a".

Selanjutnya, program membandingkan bilangan yang baru saja dimasukkan dengan bilangan terbesar yang sudah ada. Jika bilangan baru lebih besar dari bilangan terbesar saat ini, maka bilangan baru akan disimpan sebagai bilangan terbesar.

Setelah lima bilangan dimasukkan dan diuji, program mencetak bilangan terbesar ke konsol menggunakan pesan "Terbesar adalah [terbesar]".

Program ini menunjukkan cara menggunakan kelas "BufferedReader" dan "Integer" untuk membaca masukan pengguna dari konsol dan melakukan operasi sederhana pada bilangan bulat.




README MODUL 7.2 JOPTION PANE
Kode program MODUL 7.2 JOPTION PANE adalah sebuah program sederhana dalam bahasa pemrograman Java yang meminta pengguna untuk memasukkan 10 bilangan bulat menggunakan dialog box "JOptionPane" dan mencetak bilangan terbesar di antara 10 bilangan tersebut. Program ini menggunakan kelas "JOptionPane" untuk menampilkan kotak dialog dan kelas "Integer" untuk mengonversi masukan pengguna menjadi bilangan bulat.

Program ini terdiri dari satu kelas bernama "Latihan72JoptionPane" yang memiliki metode "main" sebagai titik masuk untuk menjalankan program. Pertama-tama, program membuat objek "BufferedReader" dengan menginisialisasi input stream dengan "System.in" menggunakan konstruktor kelas "InputStreamReader". Kemudian, program membuat array integer dengan panjang 10 untuk menyimpan bilangan-bilangan yang dimasukkan oleh pengguna.

Selanjutnya, program memulai sebuah perulangan for untuk meminta pengguna memasukkan 10 bilangan bulat. Pada setiap iterasi, program menampilkan sebuah dialog box menggunakan metode "showInputDialog()" dari kelas "JOptionPane" dan meminta pengguna memasukkan bilangan. Kemudian, program mengonversi masukan tersebut ke dalam bilangan bulat menggunakan metode "Integer.parseInt()" dan menyimpannya ke dalam array "angka".

Setelah 10 bilangan dimasukkan dan diuji, program mencari bilangan terbesar dengan menggunakan perulangan for kedua yang membandingkan setiap bilangan dalam array "angka" dengan bilangan terbesar saat ini. Jika bilangan baru lebih besar dari bilangan terbesar saat ini, maka bilangan baru akan disimpan sebagai bilangan terbesar.

Setelah program menemukan bilangan terbesar, program menampilkan sebuah dialog box menggunakan metode "showMessageDialog()" dari kelas "JOptionPane" untuk mencetak bilangan terbesar ke layar.

Program ini menunjukkan cara menggunakan kelas "JOptionPane" dan "Integer" untuk membaca masukan pengguna dari dialog box dan melakukan operasi sederhana pada bilangan bulat.




README MODUL 7.3 BUKU ALAMAT
Kode program MODUL 7.3 BUKU ALAMAT ini mendemonstrasikan penggunaan larik dua dimensi untuk menyimpan dan menampilkan entri dalam buku alamat sederhana.

Program mendefinisikan array dua dimensi yang disebut entryyang berisi tiga kolom: nama, nomor telepon, dan alamat. Setiap baris array mewakili entri di buku alamat.

Program kemudian menggunakan for-each loop untuk mengulangi baris array dan mencetak data untuk setiap entri, termasuk nama, nomor telepon, dan alamat.
