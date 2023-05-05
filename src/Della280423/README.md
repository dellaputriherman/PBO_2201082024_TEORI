Nama : Della Putri Herman
No BP : 2201082024

          PENJELASAN CODINGAN MODUL 8
          
    README LATIHAN 8 MENCETAK ARGUMEN      

Kode yang diberikan adalah program Java yang mencetak argumen yang diberikan pada baris perintah saat program dijalankan.

Program ini menggunakan argumen yang diteruskan ke program melalui parameter String[] args yang merupakan argumen baris perintah (command line arguments). Saat program dijalankan, argumen ini dapat diberikan setelah nama file program di terminal atau command prompt.

Program menggunakan loop for untuk mengiterasi setiap elemen array args dan mencetaknya ke konsol menggunakan perintah System.out.println(). Kemudian program mencetak jumlah argumen yang diteruskan menggunakan args.length.

Jadi, jika program dijalankan dengan beberapa argumen, program akan mencetak setiap argumen tersebut, diikuti dengan jumlah argumen yang diteruskan ke program. Contohnya seperti ini:

> java Latihan8MencetakArgumen arg1 arg2 arg3
arg1
arg2
arg3
number of array: 3

=========================================================================================================================================================================


      README LATIHAN 8 OPERASI ARITMATIKA
      
 Kode yang diberikan adalah program Java yang melakukan operasi aritmatika dasar pada dua bilangan yang diteruskan sebagai argumen baris perintah saat program dijalankan.

Program ini menggunakan argumen yang diteruskan ke program melalui parameter String[] args yang merupakan argumen baris perintah (command line arguments). Saat program dijalankan, program akan memeriksa apakah terdapat 2 argumen yang diteruskan. Jika tidak, program akan mencetak perintah yang harus digunakan untuk menjalankan program dan program akan berhenti menggunakan perintah return.

Jika terdapat 2 argumen yang diteruskan, program akan mengambil nilai dari argumen tersebut dan menyimpannya dalam variabel num1 dan num2 dengan mengkonversi tipe data String ke tipe data int menggunakan perintah Integer.parseInt().

Kemudian program melakukan operasi aritmatika dasar pada bilangan tersebut dan menyimpan hasilnya dalam variabel sum, difference, product, dan quotient. Program kemudian mencetak hasil operasi tersebut ke konsol menggunakan perintah System.out.println().

Jadi, jika program dijalankan dengan 2 argumen, program akan mencetak hasil operasi aritmatika dasar pada kedua bilangan tersebut, seperti ini:

> java Latihan8OperasiAritmatika 4 2
sum = 6
difference = 2
product = 8
quotient = 2

