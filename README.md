## Class dan Method

Class merupakan sebuah kerangka/model (blueprint) atau bentuk awal (prototype), yang berfungsi untuk tempat menaruh dan mendeksripsikan variabel, method (perilaku) dari sebuah obyek. <br />
Penamaan nama class diprogram harus sama dengan nama di struktur file extention .java. <br />
Jika, nama tidak sama maka file tidak dapat dieksekusi. <br />
Contoh yang bisa kita ambil dari kehidupan nyata dari Class adalah: class binatang class mobil ,class buah dan lain-lain. <br /><br />

### Class dan Method Hewan
<hr>
Pada latihan untuk materi class ini saya membuat dua Class yakni class Hewan dan class Mobil. <br />
Pada class hewan terdapat variabel nama, warna dan umur hewan. Lalu ada method untuk menampilkan jenis suara yang dihasilkan hewan tersebut yakni method mengeong dan mengaum. <br /><br />

### Class dan Method Mobil
<hr>
Class kedua yakni class Mobil. Pada class mobil terdapat variabel nama, merek dan harga mobil. Lalu ada method untuk menampilkan jenis transmisi pada mobil tersebut yakni method auto dan manual. <br />

### Object
<hr>
Setelah class dan method telah berhasil dibuat, lalu selanjutnya membuat Object dari class yang telah kita buat pada class utama file java untuk output kepada User.

### Cara membuat Class
<hr>
<ul>
<li>Definisikan nama Class, lalu sesuaikan nama Class dengan nama file .java nya. Jika kita akan membuat class dengan nama Hewan maka file .java nya harus bernama Hewan.java</li>
<li>Public slass (namaClass) sebagai class dan { } sebagai body dari class</li>
<li>Definisikan isi dari Class tersebut dengan variabel maupun method pada body class</li>
<li>Class berhasil dibuat</li>
</ul>
<br />

### Cara membuat Method
<hr>
<ul>
<li>Modifier berbagai statement yang menandakan hak akses method tersebut dari luar class. Terdiri dari statement public, private, dan protected. Atau jika kita tidak mendefiniskannya maka method tersebut akan bersifat public.</li>
<li>return type, statement yang menandakan tipe kembalian dari method. Ada int, void, String, double, dan berbagai objek kompleks di Java.</li>
<li>Nama method, nama method yang biasanya terdiri dari alfabet saja dan ditulis dengan camel case.</li>
<li>Parameter, berbagai nilai yang diperlukan oleh method, dalam penulisannya harus diawali dulu dengan tipe datanya baru nama parameternya.</li>
<li>Return statement, kembalian suatu method harus sesuai dengan tipe data method, jadi jika method berjenis int maka kembaliannya harus int. Khusus untuk tipe void tidak perlu menggunakan return statement.</li>
<li>Dalam latihan kali ini method menggunakan void maka tidak perlu menggunakan return statement</li>
</ul>