import java.util.LinkedList;
import java.util.Arrays;

public class Tugas1Dummy {
    public static void main(String[] args) {
        // 1. Dummy Float
        float suhuRuangan = 25.5f;
        
        // 2. Dummy String
        String namaMataKuliah = "Belajar Java Dasar";
        
        // 3. Dummy Array 1 Dimensi
        int[] kumpulanSuhu = {30, 31, 32, 33, 34};
        
        // 4. Dummy Array 2 Dimensi (2 baris, 2 kolom)
        String[][] dataMahasiswa = {
            {"Andi", "Budi"},
            {"Siti", "Dina"}
        };
        
        // 5. Dummy Linked List
        LinkedList<Integer> antrianTiket = new LinkedList<>();
        antrianTiket.add(100);
        antrianTiket.add(101);
        antrianTiket.add(102);

        // =================================================================
        // BAGIAN PRINT OUT - OPSI 3 DENGAN ASCII ART MINI POSTER
        // =================================================================
        
        System.out.println("\n=====================================================================");
        System.out.println("|   ____  _             _         ____                              |");
        System.out.println("|  / ___|| |_ _   _  __| |_   _  / ___| _ __ ___  _   _ _ __        |");
        System.out.println("|  \\___ \\| __| | | |/ _` | | | || |  _ | '__/ _ \\| | | | '_ \\       |");
        System.out.println("|   ___) | |_| |_| | (_| | |_| || |_| || | | (_) | |_| | |_) |      |");
        System.out.println("|  |____/ \\__|\\__,_|\\__,_|\\__, | \\____||_|  \\___/ \\__,_| .__/       |");
        System.out.println("|                         |___/                        |_|          |");
        System.out.println("=====================================================================");
        System.out.println("|          PUSING SAMA ARRAY & LINKEDLIST DI TUGAS 1 UT?            |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|       bersama Fitra Ajax - (CEH) - Nexa Lab's Studio Tutor        |");
        System.out.println("=====================================================================");
        System.out.println("|                    OUTPUT STRUKTUR DATA (DUMMY)                   |");
        System.out.println("=====================================================================");
        System.out.println("| 1. Tipe Float  : " + suhuRuangan);
        System.out.println("| 2. Tipe String : " + namaMataKuliah);
        System.out.println("| 3. Array 1D    : " + Arrays.toString(kumpulanSuhu));
        System.out.println("| 4. Array 2D    : " + Arrays.deepToString(dataMahasiswa));
        System.out.println("| 5. LinkedList  : " + antrianTiket);
        System.out.println("=====================================================================\n");
    }
}