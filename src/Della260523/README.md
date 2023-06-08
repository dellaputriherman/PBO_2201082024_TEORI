                PENJELASAN CODINGAN PADA MODUL 11

Nama : Della Putri Herman
No BP : 2201082024
Kelas : TK 1A
-----------------------------------------------------------------------------

    PENJELASAN Circle.java
    
Kode tersebut adalah sebuah kelas Java yang disebut Circle (Lingkaran). Ini memiliki beberapa properti dan metode untuk menghitung luas dan mendapatkan nama lingkaran.
Berikut adalah penjelasan lebih detail tentang kode tersebut:
Deklarasi kelas: Kode dimulai dengan deklarasi kelas Circle menggunakan kata kunci public. Ini berarti kelas ini dapat diakses dari bagian lain dari program.
Variabel instance: Ada satu variabel instance yang dideklarasikan sebagai private double radius. Variabel ini menyimpan nilai jari-jari lingkaran.
Konstruktor: Kode memiliki satu konstruktor dengan parameter double radius. Konstruktor ini digunakan untuk membuat objek Circle dengan memberikan nilai jari-jari awal.
Metode getArea(): Metode ini mengembalikan nilai bertipe double yang merupakan luas lingkaran. Luas lingkaran dihitung dengan rumus 3.14 * radius * radius. Dalam implementasi ini, nilai pi telah disederhanakan menjadi 3.14. 
Metode getName(): Metode ini mengembalikan nilai bertipe String yang merupakan nama lingkaran. Dalam implementasi ini, nama lingkaran sederhana saja yaitu "Circle".

=================================================================================================================

    PENJELASAN Person.java
    
Kode tersebut adalah sebuah kelas Java yang mungkin merupakan bagian dari hierarki kelas yang lebih besar. Kode tersebut memiliki beberapa properti (variabel instance) dan metode yang berhubungan dengan nama dan alamat. Berikut adalah penjelasan lebih detail tentang kode tersebut:
Variabel instance: Kode memiliki dua variabel instance, yaitu name dan address. Variabel name menyimpan informasi tentang nama, sedangkan variabel address menyimpan informasi tentang alamat.
Metode getName(): Metode ini mengembalikan nilai bertipe String yang merupakan nama. Di dalam metode ini, ada perintah System.out.println("Parent: getName"); yang mencetak pesan ke konsol. Namun, seharusnya metode ini hanya mengembalikan nilai name tanpa mencetak pesan.
Metode getAddress(): Metode ini mengembalikan nilai bertipe String yang merupakan alamat.
Metode setName(): Metode ini menerima parameter String name dan mengatur nilai name sesuai dengan nilai yang diberikan.
Metode setAddress(): Metode ini menerima parameter String add dan mengatur nilai address sesuai dengan nilai yang diberikan.
Dengan menggunakan kelas ini, Anda dapat membuat objek dengan nama dan alamat. Anda juga dapat mengakses dan mengubah nilai nama dan alamat menggunakan metode getName(), getAddress(), setName(), dan setAddress().

Contoh penggunaan:
java
Person person = new Person();
person.setName("John");
person.setAddress("123 Main Street");

String name = person.getName();
String address = person.getAddress();

System.out.println("Name: " + name);
System.out.println("Address: " + address);

===============================================================================================================================

    PENJELASAN Shape2.java
    
Kode tersebut merupakan contoh implementasi pewarisan dan abstraksi dalam Java. Berikut adalah penjelasan lebih rinci tentang kode tersebut:
Kelas Shape2: Ini adalah kelas utama yang berisi kelas abstrak Shape. Kelas Shape memiliki dua metode abstrak yaitu getArea() yang mengembalikan nilai bertipe double dan getName() yang mengembalikan nilai bertipe String. Karena kelas Shape bersifat abstrak, tidak bisa dibuat objek langsung dari kelas ini.

Kelas Circle: Kelas ini merupakan subkelas dari Shape2 dan mengimplementasikan kelas abstrak Shape. Itu memiliki variabel radius yang menyimpan nilai jari-jari lingkaran. Konstruktor menerima parameter double radius dan menginisialisasi variabel radius. Metode getArea() menghitung dan mengembalikan luas lingkaran menggunakan rumus 3.14 * radius * radius. Metode getName() mengembalikan nama "Circle".

Kelas Square: Kelas ini juga merupakan subkelas dari Shape2 dan mengimplementasikan kelas abstrak Shape. Itu memiliki variabel side yang menyimpan nilai panjang sisi persegi. Konstruktor menerima parameter double side dan menginisialisasi variabel side. Metode getArea() menghitung dan mengembalikan luas persegi menggunakan rumus side * side. Metode getName() mengembalikan nama "Square".

================================================================================================================================

    PENJELASAN Main.java
    
Kode tersebut merupakan kelas Main yang berisi metode main(). Metode main() adalah titik masuk (entry point) dari program Java yang akan dieksekusi saat program dijalankan. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

Kelas Main: Ini adalah kelas utama yang berisi metode main(). Kode program Java harus memiliki kelas utama seperti ini agar dapat dijalankan.

Metode main(): Metode ini adalah metode utama yang akan dieksekusi saat program dijalankan. Itu memiliki parameter String[] args yang digunakan untuk menerima argumen baris perintah (command-line arguments). Namun, dalam contoh ini, argumen tersebut tidak digunakan.

Baris pertama dalam metode main() membuat objek Circle dengan jari-jari 10. Objek tersebut disimpan dalam variabel circle.
Baris kedua mencetak pesan ke konsol yang mencakup nama lingkaran dan luasnya. circle.getName() mengembalikan nama lingkaran ("Circle") dan circle.getArea() mengembalikan luas lingkaran yang dihitung menggunakan rumus 3.14 * radius * radius.

=====================================================================================================================================

    PENJELASAN Square.java
    
Kode tersebut adalah kelas Square yang merepresentasikan persegi. Berikut adalah penjelasan lebih rinci tentang kode tersebut:
Variabel instance: Kode memiliki satu variabel instance yang dideklarasikan sebagai private double side. Variabel ini menyimpan nilai panjang sisi persegi.
Konstruktor: Kode memiliki satu konstruktor dengan parameter double side. Konstruktor ini digunakan untuk membuat objek Square dengan memberikan nilai panjang sisi awal.
Metode getArea(): Metode ini mengembalikan nilai bertipe double yang merupakan luas persegi. Luas persegi dihitung dengan mengalikan panjang sisi dengan dirinya sendiri menggunakan rumus side * side.
Metode getName(): Metode ini mengembalikan nilai bertipe String yang merupakan nama persegi. Dalam implementasi ini, nama persegi sederhana saja yaitu "Square".
Dengan menggunakan kelas Square ini, Anda dapat membuat objek persegi dengan memberikan nilai panjang sisi pada saat instansiasi. Anda juga dapat menggunakan metode getArea() untuk menghitung luas persegi dan metode getName() untuk mendapatkan nama persegi.

Contoh penggunaan:
java

Square square = new Square(5.0);
double area = square.getArea();
String name = square.getName();

System.out.println("Area: " + area);
System.out.println("Name: " + name);
Output:

makefile

Area: 25.0
Name: Square

================================================================================================================================

    PENJELASAN Student.java

Kode tersebut adalah kelas Student yang merupakan subkelas dari Person. Berikut adalah penjelasan lebih rinci tentang kode tersebut:
Deklarasi kelas: Kode dimulai dengan deklarasi kelas Student yang meng-extends (mewarisi) kelas Person. Ini berarti Student adalah subkelas dari Person dan mewarisi semua properti dan metode dari Person.
Konstruktor: Kode memiliki satu konstruktor Student tanpa parameter. Di dalam konstruktor, ada beberapa pernyataan yang dieksekusi:
Pernyataan super() digunakan untuk memanggil konstruktor dari kelas induk (Person). Dalam hal ini, konstruktor tanpa parameter dari Person dipanggil.
Pernyataan super.name = "Anna" dan super.address = "Padang" digunakan untuk mengakses dan mengatur nilai properti name dan address dari kelas Person.
Pernyataan System.out.println("Inside Student:Constructor") mencetak pesan ke konsol.
Metode getName(): Metode ini merupakan overriding (penggantian) metode getName() dari kelas Person. Dalam implementasi ini, metode getName() mencetak pesan ke konsol dan mengembalikan nilai properti name dari kelas Person.

Metode main(): Metode ini merupakan metode utama yang akan dieksekusi saat program dijalankan. Di dalamnya, objek Student dengan nama anna dibuat. Kemudian, pesan yang mencakup nilai properti name dan address dari anna dicetak ke konsol.

====================================================================================================================================

    PENJELASAN StudentComputer.java
  
Kode tersebut adalah kelas StudentComputer yang merupakan subkelas dari StudentRecord. Kelas ini merepresentasikan catatan nilai dan informasi siswa komputer. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

Variabel instance: Kode memiliki beberapa variabel instance yang mewakili nilai-nilai dalam catatan siswa komputer. Variabel tersebut adalah network, pbo, web, dan average. Variabel average digunakan untuk menyimpan nilai rata-rata dari tiga mata pelajaran.

Metode getter dan setter: Kode memiliki metode getter dan setter untuk setiap variabel instance. Metode getter digunakan untuk mengembalikan nilai dari variabel, sedangkan metode setter digunakan untuk mengatur nilai variabel.

Metode getAverage(): Metode ini menghitung dan mengembalikan rata-rata dari tiga mata pelajaran (network, pbo, dan web) dengan menggunakan rumus (web + pbo + network) / 3. Nilai rata-rata tersebut disimpan dalam variabel average.

Metode getName(): Metode ini merupakan overriding (penggantian) metode getName() dari kelas StudentRecord. Dalam implementasi ini, metode getName() mencetak pesan ke konsol dan mengembalikan nilai properti name dari kelas StudentRecord.

Metode main(): Metode ini merupakan metode utama yang akan dieksekusi saat program dijalankan. Di dalamnya, objek StudentComputer dengan nama siswa1 dibuat. Nilai-nilai untuk mata pelajaran dan informasi siswa diatur menggunakan metode setter. Kemudian, pesan yang mencakup informasi siswa dan nilai mata pelajaran dicetak ke konsol menggunakan metode getter.

=====================================================================================================================================

    PENJELASAN StudentRecord.java
    
Kode tersebut adalah kelas StudentRecord yang berfungsi sebagai superclass atau kelas dasar. Kelas ini memiliki properti yang merepresentasikan informasi dasar seorang siswa, yaitu name, address, dan age. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

Variabel instance: Kode memiliki tiga variabel instance, yaitu name, address, dan age. Variabel ini digunakan untuk menyimpan informasi nama, alamat, dan usia siswa.

Konstruktor: Kode memiliki tiga konstruktor. Konstruktor pertama (StudentRecord()) adalah konstruktor default yang mencetak pesan "SuperClass" ke konsol. Konstruktor kedua (StudentRecord(String name, String address, String age)) menerima argumen nama, alamat, dan usia untuk menginisialisasi properti yang sesuai. Konstruktor ketiga (StudentRecord(String name)) menerima argumen nama dan menginisialisasi properti name, address, dan age dengan nilai default.

Metode getter dan setter: Kode memiliki metode getter dan setter untuk masing-masing properti name, address, dan age. Metode getter digunakan untuk mengembalikan nilai properti, sedangkan metode setter digunakan untuk mengatur nilai properti.

Metode getName(): Metode ini mencetak pesan "StudentRecord name: [name]" ke konsol dan mengembalikan nilai properti name.

Dalam contoh ini, terdapat dua subkelas yang meng-extend StudentRecord, yaitu Student dan StudentComputer. Subkelas menggunakan konstruktor superclass untuk menginisialisasi properti yang diwarisi dari StudentRecord. Metode getter dan setter pada kelas StudentRecord memungkinkan akses ke properti tersebut di subkelas.

Kelas StudentRecord tidak dijalankan secara langsung dalam metode main(). Namun, kelas ini menjadi superclass yang digunakan untuk menciptakan objek siswa1 pada contoh sebelumnya dalam kelas StudentComputer.

================================================================================================================================
