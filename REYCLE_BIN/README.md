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

## 📚 Ensiklopedia Mini: Konsep & Logika Struktur Data

Buat kamu yang masih bingung dengan istilah-istilah di atas, jangan khawatir. Di pemrograman, semuanya berakar dari logika dunia nyata. Berikut adalah "contekan" konsep, analogi, dan contoh dari tipe data yang kita gunakan di Tugas 1:

### 1. `float` (Bilangan Pecahan)
* **Pemahaman Konsep:** `float` adalah tipe data primitif di Java yang digunakan untuk menyimpan angka desimal (pecahan). Ingat, setiap mengisi nilai `float`, kamu **wajib** menambahkan huruf `f` (huruf kecil atau kapital) di akhir angka agar Java tidak menganggapnya sebagai tipe data `double` (yang ukurannya lebih besar).
* **Analogi:** Bayangkan `float` seperti **gelas takar**. Kamu tidak harus mengisinya dengan benda utuh bulat (seperti 1 batu bata). Kamu bisa mengisinya sebanyak 1.5 liter, atau 2.75 liter.
* **Contoh Penggunaan Asli:** Mengukur suhu ruangan (`25.5f`), berat badan (`65.4f`), atau nilai ujian (`88.5f`).

### 2. `String` (Teks / Kumpulan Karakter)
* **Pemahaman Konsep:** `String` digunakan untuk menampung teks. Bentuknya bisa berupa satu kata, satu kalimat penuh, atau bahkan campuran angka dan huruf (alfanumerik) asalkan **diapit oleh tanda kutip ganda** (`"..."`). Angka di dalam `String` tidak bisa dipakai untuk operasi hitung matematika.
* **Analogi:** `String` itu seperti **label stiker pada kardus kemasan**. Kamu bisa menulis apa saja di label tersebut ("Baju Ukuran L", "Kamar 01A"), tapi tulisan angka di situ hanya sebagai identitas, bukan untuk dihitung.
* **Contoh Penggunaan Asli:** Menyimpan nama orang (`"Andi"`), alamat lengkap (`"Jl. Sudirman No. 1"`), atau plat nomor kendaraan (`"L 1234 XY"`).

### 3. Array 1 Dimensi (Kumpulan Data Searah)
* **Pemahaman Konsep:** *Array* adalah struktur data tetap (ukurannya tidak bisa diubah setelah dibuat) yang digunakan untuk menyimpan banyak nilai di dalam **satu variabel tunggal**. Semua nilai di dalamnya harus memiliki tipe data yang sama (misalnya, angka semua atau teks semua).
* **Analogi:** Bayangkan *Array 1D* seperti **rak sepatu memanjang** di depan masjid. Rak sepatu tersebut punya nomor urut (indeks) dari 0, 1, 2, dst. Sepatu ayah ada di loker nomor 0, sepatu anak ada di loker nomor 1.
* **Contoh Penggunaan Asli:** Menyimpan 5 daftar nilai ujian dalam satu variabel, misal: `int[] nilai = {80, 85, 90, 75, 88};`.

### 4. Array 2 Dimensi (Tabel / Matriks)
* **Pemahaman Konsep:** *Array 2D* pada dasarnya adalah "*Array* di dalam *Array*". Datanya disimpan dalam bentuk tabel yang memiliki baris (mendatar) dan kolom (menurun). Ciri khasnya di Java adalah menggunakan dua pasang kurung siku `[][]`.
* **Analogi:** Sama persis dengan **kursi di dalam bioskop**. Untuk mencari di mana kamu harus duduk, kamu butuh dua informasi: Baris ke berapa (misal Baris A) dan Kolom ke berapa (misal Kursi 5). Pertemuan antara baris A dan kolom 5 itulah datamu.
* **Contoh Penggunaan Asli:** Menyimpan data jadwal piket harian (Hari vs Nama Siswa), atau posisi bidak di atas papan catur.

### 5. `LinkedList` (Kumpulan Data Dinamis)
* **Pemahaman Konsep:** Berbeda dengan *Array* yang ukurannya kaku, `LinkedList` adalah struktur data yang sangat fleksibel. Datanya tidak disimpan berdampingan di memori secara kaku. Setiap data (disebut *node*) menyimpan nilainya sendiri sekaligus "menyimpan alamat" dari data setelahnya.
* **Analogi:** Ini sangat mirip dengan **gerbong kereta api**. Kamu bisa dengan mudah menambah gerbong baru di ujung kereta, atau melepas kaitan di tengah-tengah kereta untuk menyisipkan gerbong restoran, tanpa harus membongkar seluruh kereta dari awal. Ukuran keretanya bisa panjang dan pendek kapan saja menyesuaikan kebutuhan.
* **Contoh Penggunaan Asli:** Membuat sistem antrian (*Queue*) di bank, *playlist* lagu di Spotify (bisa nambah/hapus lagu kapan saja), atau fitur *Back/Forward* di *browser* internetmu.

## 🧠 Studi Kasus & Problem Solving (Real-World Scenarios)

Di dunia industri perangkat lunak (*Software Engineering*), pemilihan struktur data yang tepat adalah kunci untuk membuat program yang cepat dan tidak membebani memori (RAM). 

Mari kita bedah kenapa kita menggunakan struktur data tersebut pada *dummy code* kita melalui skenario studi kasus berikut:

### 💼 Case 1: Sistem Profil Akademik (Float & String)
* **Skenario Masalah (Problem):** Sistem akademik kampus perlu menyimpan nama mahasiswa dan nilai Indeks Prestasi Kumulatif (IPK) mereka. Kita tidak bisa menggunakan tipe data angka biasa (`int`) untuk IPK karena nilainya pasti memiliki desimal (misalnya 3.85).
* **Problem Solving:**
  * Gunakan **`String`** untuk nama, karena `String` dirancang khusus untuk menampung rentetan karakter (huruf/teks).
  * Gunakan **`float`** untuk IPK. Kenapa tidak `double`? Karena untuk sekadar angka IPK dengan dua angka di belakang koma, `float` sudah sangat cukup dan jauh lebih hemat memori *server* dibandingkan `double`.

### 💼 Case 2: Sistem Rekap Nilai e-Learning (Array 1 Dimensi)
* **Skenario Masalah (Problem):** Seorang dosen perlu merekap 5 nilai kuis untuk satu mata kuliah. Sangat tidak efisien dan akan membuat kode menjadi kotor jika kita harus mendeklarasikan 5 variabel terpisah seperti `int nilai1 = 80;`, `int nilai2 = 85;`, dan seterusnya.
* **Problem Solving:**
  Gunakan **`Array 1 Dimensi`**. Cukup deklarasikan satu "loker memori" berderet: `int[] kumpulanNilai = {80, 85, 90, 75, 88};`. Jika dosen ingin melihat nilai kuis ke-3, cukup panggil loker indeks ke-2 (karena indeks dimulai dari 0). Kode menjadi sangat rapi dan mudah di-*looping*.

### 💼 Case 3: Pemetaan Denah Ujian CBT UT (Array 2 Dimensi)
* **Skenario Masalah (Problem):** Ruang ujian komputer (CBT) diatur dalam bentuk *grid* / petak. Ada baris dan kolom. Pengawas ujian perlu mendata mahasiswa mana yang duduk di "Baris 1, Kolom 2". Jika menggunakan Array 1D, visualisasi tata letak ruangannya akan sangat membingungkan.
* **Problem Solving:**
  Gunakan **`Array 2 Dimensi`**. Struktur ini secara logis langsung merepresentasikan tabel (Matriks). Dengan bentuk `String[][] denahLab`, kita memetakan posisi duduk fisik di dunia nyata ke dalam kode pemrograman secara akurat.

### 💼 Case 4: Sistem Antrian Server SIAKAD (LinkedList)
* **Skenario Masalah (Problem):** Saat masa registrasi mata kuliah, ribuan mahasiswa *login* ke *server* antrian SIAKAD secara bersamaan. Ada mahasiswa yang baru masuk (ditambahkan ke antrian) dan ada yang sudah selesai (dikeluarkan dari antrian). Jika kita menggunakan *Array* biasa, *server* akan sangat lambat karena setiap kali antrian depan selesai, *server* harus menggeser ribuan data di belakangnya maju satu langkah.
* **Problem Solving:**
  Gunakan **`LinkedList`**. Struktur data ini berwujud seperti gerbong kereta. Jika mahasiswa di antrian paling depan selesai diproses, sistem hanya perlu "memutus" kaitan gerbong pertama tersebut tanpa perlu menggeser data gerbong lain di belakangnya. Ini membuat proses penambahan (`add`) dan penghapusan (`remove`) antrian berjalan sangat cepat, tidak peduli seberapa panjang antriannya.

---
**💡 Tips Tugas Video:**
Saat kalian membuat video presentasi berdurasi 15 menit nanti, jangan ragu untuk menyelipkan sedikit analogi di atas saat menjelaskan kode kalian. Dosen tutor sangat menyukai mahasiswa yang paham konsep secara fundamental, bukan sekadar bisa mengetik kode!


---
*Mentoring ini didesain khusus untuk mendukung rekan-rekan mahasiswa Universitas Terbuka Surabaya dan UPBJJ lainnya. Terus semangat belajarnya!*
