![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![VS Code](https://img.shields.io/badge/Editor-VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Roadmap](https://img.shields.io/badge/Alignment-roadmap.sh-black?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

> **From Zero to Hero:** Kurikulum pemrograman Java yang dirancang khusus untuk mahasiswa Non-IT dengan pendekatan pedagogi modern.

# 🚀 Bedah Pola Tugas 2: Struktur Data & Sorting (Java)

**Oleh: Fitra Ajax (CEH) - Tutor Nexa Lab's Studio**
**Study Group Episode 2**

Selamat datang di repositori *dummy case* untuk **Tugas 2 Struktur Data**. Kode di dalam repositori ini BUKAN kunci jawaban mentah, melainkan kode tiruan (*dummy*) yang memiliki logika 100% sama dengan soal tugas aslimu yang membahas LIFO, FIFO, dan Quick Sort.

Gunakan repositori ini untuk belajar pola logikanya, sehingga kamu bisa mengerjakan tugas aslinya dengan cepat, mandiri, dan aman dari plagiarisme kampus.

---

### 🛠️ Persiapan Awal (Requirements)

Sebelum mulai coding, pastikan komputermu sudah siap. Jika kamu menggunakan Visual Studio Code (VS Code), ikuti 3 langkah wajib ini:

1.  **Install Java Development Kit (JDK):** Pastikan JDK (minimal versi 11, disarankan versi 17 atau 21) sudah terpasang di laptopmu.
2.  **Install Visual Studio Code:** Unduh dan install VS Code jika belum punya.
3.  **Install Ekstensi Java:** Buka VS Code, masuk ke menu *Extensions* (atau tekan `Ctrl+Shift+X`), lalu cari dan install **"Extension Pack for Java"** buatan Microsoft.

*(Catatan: Kode ini juga didesain responsif untuk dijalankan di compiler mobile seperti Termux atau aplikasi IDE di HP jika laptopmu sedang tidak bisa digunakan).*

---

### 🏃‍♂️ Cara Menjalankan Kode (Step-by-Step)

Jika semua persiapan di atas sudah selesai, ikuti langkah berikut dari nol sampai kode berjalan:

1.  **Buat Folder:** Buat folder baru di laptop/HP-mu, misalnya beri nama `Tugas2-StrukturData`.
2.  **Buka di Editor:** Buka VS Code, klik `File > Open Folder`, dan pilih folder yang baru saja kamu buat.
3.  **Buat File Java:** Di dalam panel sebelah kiri VS Code, buat file baru **WAJIB** dengan nama `Tugas2StrukturData.java` (Perhatikan huruf besar/kecilnya, harus sama persis).
4.  **Copy-Paste Kode:** Copy seluruh kode program dummy dari study group Nexa Lab's dan paste ke dalam file `Tugas2StrukturData.java` tersebut.
5.  **Jalankan (Run):** Cukup klik tombol **"▶ Run"** yang biasanya muncul di pojok kanan atas editor VS Code. Atau, klik kanan di tengah layar kodemu, lalu pilih **"Run Java"**.
6.  **Lihat Hasilnya:** Buka panel Terminal di bagian bawah editor untuk melihat output mini poster ASCII yang rapi dan hasil eksekusi dari Stack, Queue, serta Quick Sort.

---

### ⚠️ Aturan Main (Do's and Don'ts)

Agar nilai tugasmu aman dan maksimal (terutama untuk poin video presentasi 15 menit), perhatikan hal-hal berikut:

#### ✅ Boleh Dilakukan (DO's)
* **Pelajari Polanya:** Amati bagaimana fungsi `stack.push()` dan `queue.add()` bekerja, serta bagaimana fungsi rekursif memanggil dirinya sendiri di Quick Sort.
* **Eksperimen Sendiri:** Ubah angka di dalam array `{15, 25, 35, ...}` menjadi angka lain dan *Run* ulang untuk melihat perubahan urutannya di terminal.
* **Gunakan Sebagai Skrip Video:** Gunakan logika penjelasan di modul ini sebagai contekan (*cheat sheet*) saat kamu merekam video tugas.
* **Terapkan ke Tugas Asli:** Buat file Java baru dan kerjakan tugas aslimu dengan meniru struktur dummy ini. Ubah nama variabel atau isi datanya sesuai permintaan soal kampus.

#### ❌ Tidak Boleh Dilakukan (DON'Ts)
* **JANGAN Kumpulkan Kode Ini:** Dilarang keras men-submit file `Tugas2StrukturData.java` ini langsung ke e-learning tanpa mengubah data integernya. Ini akan dianggap plagiarisme.
* **JANGAN Hapus Baris Import:** Jangan menghapus `import java.util.Stack;` atau `import java.util.LinkedList;` di baris paling atas. Jika dihapus, kodemu akan error merah.
* **JANGAN Ubah Nama Class Sembarangan:** Nama file (`Tugas2StrukturData.java`) harus sama persis dengan nama class di dalam kode (`public class Tugas2StrukturData`).

---

### 📚 Ensiklopedia Mini: Konsep & Logika Struktur Data

Buat kamu yang masih bingung dengan istilah-istilah di Tugas 2 ini, jangan khawatir. Di pemrograman, semuanya berakar dari logika dunia nyata:

#### 1. Stack (Metode LIFO - Last In First Out)
**Pemahaman Konsep:** Struktur data linier di mana penambahan dan penghapusan data hanya bisa dilakukan pada satu ujung (disebut *Top*). Data terakhir yang masuk akan menjadi data pertama yang keluar.
**Analogi:** Bayangkan tumpukan piring kotor di dapur. Piring yang terakhir kali kamu taruh di tumpukan paling atas (*Push*), pasti akan menjadi piring pertama yang kamu ambil untuk dicuci (*Pop*).

#### 2. Queue (Metode FIFO - First In First Out)
**Pemahaman Konsep:** Struktur data antrean di mana penambahan data dilakukan di belakang (*Rear*) dan pengambilan data dilakukan di depan (*Front*). Data pertama yang masuk akan menjadi data pertama yang keluar.
**Analogi:** Sama persis seperti antrean kasir di minimarket. Pelanggan yang datang dan antre lebih dulu (*Enqueue*), dialah yang akan dilayani dan keluar lebih dulu (*Dequeue*).

#### 3. Quick Sort (Divide & Conquer)
**Pemahaman Konsep:** Algoritma pengurutan yang sangat cepat. Ia bekerja dengan memilih satu titik acuan (*Pivot*), lalu memilah data: data yang lebih kecil dari pivot ditaruh di kiri, dan yang lebih besar ditaruh di kanan. Proses ini diulang terus-menerus secara rekursif.
**Analogi:** Bayangkan kamu mensortir tumpukan kartu ujian. Kamu ambil satu kartu acak sebagai patokan (*Pivot*). Kartu dengan NIM lebih kecil kamu lempar ke meja kiri, NIM lebih besar ke meja kanan. Lalu kamu ulangi hal yang sama untuk tumpukan kiri dan kanan sampai semuanya urut.

#### 4. LinkedList & Array 1 Dimensi (Struktur Pendukung)
* **Array 1D (`int[]`):** Seperti loker memori berderet untuk menyimpan data awal sebelum kita masukkan ke Stack atau Queue.
* **LinkedList:** Struktur data berbentuk seperti gerbong kereta. Di program kita, ia digunakan sebagai "mesin" di balik layar untuk menjalankan Queue agar proses antrean bisa lebih dinamis dan fleksibel.

---

### 🧠 Studi Kasus & Problem Solving (Real-World Scenarios)

Kenapa kita harus repot-repot belajar Stack, Queue, dan Quick Sort? Di dunia industri perangkat lunak (*Software Engineering*), ini adalah fondasi fitur-fitur aplikasi yang sering kamu pakai sehari-hari.

#### 💼 Case 1: Fitur Undo/Redo di Microsoft Word (Stack)
**Skenario Masalah:** Saat kamu mengetik di Word, lalu menekan `Ctrl + Z` (Undo), aplikasi harus tahu kata apa yang terakhir kali kamu ketik untuk dihapus.
**Problem Solving:** Gunakan **Stack**. Setiap ketikan baru akan di-*push* ke tumpukan. Saat kamu menekan Undo, aplikasi akan mem-*pop* (mengambil) data teratas, yaitu tindakan terakhirmu, sehingga tulisanmu kembali ke kondisi sebelumnya. Begitu juga cara kerja tombol *Back* di browser internetmu.

#### 💼 Case 2: Sistem Pemesanan Tiket Konser / Kereta Api (Queue)
**Skenario Masalah:** Jutaan orang menekan tombol "Beli" tiket konser secara bersamaan. Server tidak boleh memproses secara acak, harus adil siapa cepat dia dapat.
**Problem Solving:** Gunakan **Queue**. Siapapun yang *request* koneksinya masuk lebih dulu ke server, akan ditaruh di gerbong paling depan (*Enqueue*). Server kemudian akan memproses (*checkout*) tiket mulai dari antrean terdepan (*Dequeue*). Transparan, adil, dan logis.

#### 💼 Case 3: Filter "Harga Termurah" di Marketplace (Quick Sort)
**Skenario Masalah:** Kamu mencari barang di Tokopedia/Shopee dan muncul 100.000 hasil pencarian acak. Kamu menekan filter urutkan dari *Harga Termurah*. Bagaimana server bisa mengurutkan 100 ribu data dalam sepersekian detik?
**Problem Solving:** Gunakan algoritma **Quick Sort**. Algoritma ini mempartisi harga ke kelompok murah dan mahal secara eksponensial. Dibandingkan algoritma biasa (seperti *Bubble Sort*) yang memakan waktu lama, *Quick Sort* bisa menyajikan daftar barang dari yang paling murah ke HP-mu hampir tanpa *loading*.

---

> **💡 Tips Tugas Video:** Saat kalian membuat video presentasi berdurasi maksimal 15 menit nanti, jangan ragu untuk menyelipkan sedikit analogi di atas saat menjelaskan *source code* kalian. Dosen tutor Universitas Terbuka sangat menyukai mahasiswa yang paham konsep secara fundamental, bukan sekadar membaca baris kode!

*Mentoring ini didesain khusus untuk mendukung rekan-rekan mahasiswa Universitas Terbuka Surabaya dan UPBJJ lainnya. Terus semangat belajarnya!*