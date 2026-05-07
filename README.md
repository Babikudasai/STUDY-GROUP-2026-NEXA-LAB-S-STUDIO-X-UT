# 🚀 Bedah Pola Tugas 1: Struktur Data (Java)
**Oleh: Fitra Ajax (CEH) - Nexa Lab's Studio Tutor**

Selamat datang di repositori *dummy case* untuk Tugas 1 Struktur Data. Kode di dalam folder ini BUKAN kunci jawaban mentah, melainkan **kode tiruan (dummy)** yang memiliki logika 100% sama dengan soal tugas aslimu. 

Gunakan repositori ini untuk belajar pola logikanya, sehingga kamu bisa mengerjakan tugas aslinya dengan cepat, mandiri, dan aman dari plagiarisme kampus.

---

## 🛠️ Persiapan Awal (Requirements)

Sebelum mulai *coding*, pastikan komputermu sudah siap. Jika kamu menggunakan Visual Studio Code (VS Code), ikuti 3 langkah wajib ini:

1. **Install Java Development Kit (JDK):** Pastikan JDK (minimal versi 11, disarankan versi 17 atau 21) sudah terpasang di laptopmu. 
2. **Install Visual Studio Code:** Unduh dan *install* VS Code jika belum punya.
3. **Install Ekstensi Java:** Buka VS Code, masuk ke menu *Extensions* (atau tekan `Ctrl+Shift+X`), lalu cari dan *install* **"Extension Pack for Java"** buatan Microsoft.

---

## 🏃‍♂️ Cara Menjalankan Kode (Step-by-Step)

Jika semua persiapan di atas sudah selesai, ikuti langkah berikut dari nol sampai kode berjalan:

1. **Buat Folder:** Buat folder baru di laptopmu, misalnya beri nama `Tugas1-StrukturData`.
2. **Buka di VS Code:** Buka VS Code, klik `File` > `Open Folder`, dan pilih folder yang baru saja kamu buat.
3. **Buat File Java:** Di dalam panel sebelah kiri VS Code, buat file baru **WAJIB** dengan nama `Tugas1Dummy.java` (Perhatikan huruf besar/kecilnya, harus sama persis).
4. **Copy-Paste Kode:** *Copy* seluruh kode program *dummy* dari *study group* Nexa Labs dan *paste* ke dalam file `Tugas1Dummy.java` tersebut.
5. **Jalankan (Run):** * Cukup klik tombol **"▶ Run"** yang biasanya muncul di pojok kanan atas editor VS Code.
   * Atau, klik kanan di tengah layar kodemu, lalu pilih **"Run Java"**.
6. **Lihat Hasilnya:** Buka panel `Terminal` di bagian bawah VS Code untuk melihat *output* mini poster ASCII dan hasil eksekusi variabel, *Array*, serta *LinkedList*.

---

## ⚠️ Aturan Main (Do's and Don'ts)

Agar nilai tugasmu aman dan maksimal (terutama untuk poin video presentasi), perhatikan hal-hal berikut:

### ✅ Boleh Dilakukan (DO's)
* **Pelajari Polanya:** Amati bagaimana deklarasi `float` menggunakan huruf `f` di belakangnya, dan bagaimana kurung siku `[]` digunakan pada *Array*.
* **Eksperimen Sendiri:** Ubah angka di dalam `antrianTiket.add(100);` menjadi angka lain dan *Run* ulang untuk melihat perubahannya di terminal.
* **Gunakan Sebagai Skrip Video:** Gunakan logika kode ini sebagai contekan (*cheat sheet*) saat kamu merekam video penjelasan tugas berdurasi 15 menit.
* **Terapkan ke Tugas Asli:** Buat file Java baru (misal: `Tugas1.java`) dan kerjakan tugas aslimu dengan meniru struktur *dummy* ini. Ubah nama variabel (seperti `suhuRuangan` menjadi `StrukturBaris`) sesuai permintaan soal kampus.

### ❌ Tidak Boleh Dilakukan (DON'Ts)
* **JANGAN Kumpulkan Kode Ini:** Dilarang keras men-*submit* file `Tugas1Dummy.java` ini langsung ke *e-learning*. Ini akan dianggap plagiarisme.
* **JANGAN Hapus Baris Import:** Jangan menghapus `import java.util.LinkedList;` atau `import java.util.Arrays;` di baris paling atas. Jika dihapus, kodemu akan *error* (merah).
* **JANGAN Ubah Nama Class Sembarangan:** Nama file (`Tugas1Dummy.java`) harus sama persis dengan nama *class* di dalam kode (`public class Tugas1Dummy`). Jika kamu mengubah nama filenya, kamu juga wajib mengubah nama *class*-nya.

---

## 📚 Mini Ensiklopedia: Tipe Data & Struktur Data Java

Agar kamu tidak sekadar *copy-paste* tapi benar-benar paham secara fundamental, berikut adalah ensiklopedia singkat mengenai tipe dan struktur data yang kita gunakan di Tugas 1 ini:

### 1. Float (`float`)
* **Apa itu?** Tipe data primitif untuk menyimpan angka desimal (pecahan). `float` memiliki presisi tunggal (32-bit), yang berarti cukup untuk menyimpan sekitar 6-7 angka di belakang koma.
* **Kapan Digunakan?** Sangat cocok untuk data metrik yang tidak membutuhkan presisi absolut tingkat tinggi namun butuh menghemat memori, seperti suhu ruangan (`25.5f`), berat badan, atau tinggi badan.
* **Aturan Khusus Java:** Kamu **wajib** menambahkan huruf `f` atau `F` di akhir angka (contoh: `3.14f`). Jika tidak, Java akan menganggapnya sebagai tipe data `double` dan akan menghasilkan pesan *error* karena ketidakcocokan ukuran memori.

### 2. String (`String`)
* **Apa itu?** `String` adalah tipe data non-primitif (sebuah *Class* di Java) yang digunakan untuk menyimpan kumpulan karakter atau teks. Tipe data ini selalu ditandai dengan huruf kapital `S` di awal.
* **Kapan Digunakan?** Untuk menyimpan nama, alamat, kalimat, nomor telepon (karena nomor telepon tidak digunakan untuk operasi matematika), atau kata sandi. 
* **Aturan Khusus Java:** Nilai sebuah `String` wajib diapit oleh tanda kutip ganda (`"..."`).

### 3. Array 1 Dimensi (`tipeData[]`)
* **Apa itu?** Array adalah struktur data statis yang bisa menyimpan banyak nilai dalam satu variabel, asalkan tipe datanya sama semua. Analoginya seperti loker memanjang atau deretan gerbong kereta api.
* **Kapan Digunakan?** Saat kamu punya kumpulan data tunggal yang ukurannya sudah pasti dari awal, seperti daftar nilai 5 mahasiswa, 7 hari dalam seminggu, atau deret angka tertentu.
* **Kelemahan:** Ukurannya statis. Sekali kamu bikin Array berukuran 5, kamu tidak bisa tiba-tiba memasukkan data ke-6.

### 4. Array 2 Dimensi (`tipeData[][]`)
* **Apa itu?** Sederhananya, ini adalah "Array di dalam Array". Strukturnya menyerupai tabel yang memiliki baris (*row*) dan kolom (*column*), atau seperti sistem koordinat matriks.
* **Kapan Digunakan?** Sangat ideal untuk menyimpan data berbentuk grid/papan permainan (seperti papan catur atau *tic-tac-toe*), tabel database sederhana, atau denah tempat duduk di bioskop.

### 5. Linked List (`LinkedList<Tipe>`)
* **Apa itu?** Struktur data dinamis yang menyimpan data dalam bentuk *node* (simpul). Berbeda dengan Array yang datanya berjejer rapat di memori, elemen-elemen di *LinkedList* bisa menyebar di memori, namun setiap elemen memiliki "tali pengikat" (*pointer*) yang menunjuk ke elemen berikutnya.
* **Kapan Digunakan?** Saat kamu membutuhkan fleksibilitas tingkat tinggi. Misalnya, data antrian rumah sakit atau *playlist* musik.
* **Keunggulan Utama:** Sangat cepat dan efisien jika kita sering menambah atau menghapus data di tengah-tengah antrian. Ukurannya bisa membesar atau mengecil secara otomatis sesuai jumlah isinya, berbeda 180 derajat dengan Array.

---
*Mentoring ini didesain khusus untuk mendukung rekan-rekan mahasiswa Universitas Terbuka Surabaya dan UPBJJ lainnya. Terus semangat belajarnya!*
