import java.util.LinkedList;
import java.util.Arrays;

public class StudiKasusImplementasi {
    public static void main(String[] args) {
        
        // =================================================================
        // BAGIAN PRINT OUT - HEADER ASCII ART MINI POSTER
        // =================================================================
        System.out.println("\n=====================================================================");
        System.out.println("|   ____  _             _ _   _  __                                 |");
        System.out.println("|  / ___|| |_ _   _  __| (_) | |/ /__ _ ___ _   _ ___               |");
        System.out.println("|  \\___ \\| __| | | |/ _` | | | ' // _` / __| | | / __|              |");
        System.out.println("|   ___) | |_| |_| | (_| | | | . \\ (_| \\__ \\ |_| \\__ \\              |");
        System.out.println("|  |____/ \\__|\\__,_|\\__,_|_| |_|\\_\\__,_|___/\\__,_|___/              |");
        System.out.println("|                                                                   |");
        System.out.println("=====================================================================");
        System.out.println("|             PROBLEM SOLVING: IMPLEMENTASI DUNIA NYATA             |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|       bersama Fitra Ajax - (CEH) - Nexa Lab's Studio Tutor        |");
        System.out.println("=====================================================================\n");


        // ---------------------------------------------------------
        // 1. KASUS: PROFIL MAHASISWA (String & Float)
        // ---------------------------------------------------------
        String namaMhs = "Budi Santoso";
        float ipkMahasiswa = 3.85f;
        
        System.out.println("[Data Profil]");
        System.out.println("Nama : " + namaMhs);
        System.out.println("IPK  : " + ipkMahasiswa + "\n");

        // ---------------------------------------------------------
        // 2. KASUS: NILAI KUIS (Array 1D)
        // ---------------------------------------------------------
        // Menyimpan nilai kuis 1 sampai 5 dalam satu variabel
        int[] nilaiKuis = {85, 90, 78, 88, 92};
        
        System.out.println("[Data Nilai Kuis]");
        System.out.println("Semua Nilai   : " + Arrays.toString(nilaiKuis));
        // Mengambil nilai kuis ke-3 (ingat, indeks dimulai dari 0)
        System.out.println("Kuis ke-3     : " + nilaiKuis[2] + "\n");

        // ---------------------------------------------------------
        // 3. KASUS: DENAH LAB KOMPUTER (Array 2D)
        // ---------------------------------------------------------
        // Matriks 2x2 (2 Baris, 2 Kolom)
        String[][] denahLab = {
            {"Kursi A1 (Andi)", "Kursi A2 (Siti)"}, // Baris 1
            {"Kursi B1 (Budi)", "Kursi B2 (Dina)"}  // Baris 2
        };
        
        System.out.println("[Data Denah Lab Ujian]");
        System.out.println("Denah Lengkap : " + Arrays.deepToString(denahLab));
        // Siapa yang duduk di baris ke-2, kolom ke-1?
        System.out.println("Cek Baris 2, Kolom 1 : " + denahLab[1][0] + "\n");

        // ---------------------------------------------------------
        // 4. KASUS: ANTRIAN SISTEM (LinkedList)
        // ---------------------------------------------------------
        LinkedList<String> antrianServer = new LinkedList<>();
        
        // Mahasiswa masuk antrian (masuk dari belakang)
        antrianServer.add("User_Andi");
        antrianServer.add("User_Siti");
        antrianServer.add("User_Budi");
        
        System.out.println("[Data Antrian Server]");
        System.out.println("Kondisi Antrian Awal : " + antrianServer);
        
        // Simulasi: Andi selesai dan keluar dari antrian paling depan
        String diproses = antrianServer.removeFirst();
        System.out.println("Sedang diproses      : " + diproses);
        System.out.println("Sisa Antrian         : " + antrianServer);
        
        System.out.println("\n=====================================================================\n");
    }
}