/*
╔══════════════════════════════════════════════════╗
║       SOURCE CODE: STRUKTUR DATA & SORTING       ║
║                                                  ║
║ Author      : Fitra Ajax - Tutor Nexa Lab's      ║
║ Event       : Study Group Episode 2              ║
║ Description : Implementasi Stack, Queue, & Sort. ║
║ UI/UX Focus : Mobile Responsive ASCII Output.    ║
║ HX Focus    : JavaDoc, clean code structure.     ║
╚══════════════════════════════════════════════════╝
*/

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class Tugas2StrukturData {

    public static void main(String[] args) {
        // Mencetak Poster ASCII saat program pertama kali dijalankan
        printPoster();
        
        printHeader("PROGRAM STRUKTUR DATA & ALGORITMA");
        
        implementasiStack();
        implementasiQueue();
        implementasiQuickSort();
        
        System.out.println("╚══════════════════════════════════════════════════╝\n");
    }

    /**
     * Method untuk mencetak Poster Undangan/Identitas di terminal
     * Disesuaikan (stacked) agar responsif di layar Mobile/HP.
     */
    private static void printPoster() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                                                  ║");
        System.out.println("║   ███╗   ██╗███████╗██╗  ██╗ █████╗              ║");
        System.out.println("║   ████╗  ██║██╔════╝╚██╗██╔╝██╔══██╗             ║");
        System.out.println("║   ██╔██╗ ██║█████╗   ╚███╔╝ ███████║             ║");
        System.out.println("║   ██║╚██╗██║██╔══╝   ██╔██╗ ██╔══██║             ║");
        System.out.println("║   ██║ ╚████║███████╗██╔╝ ██╗██║  ██║             ║");
        System.out.println("║   ╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝             ║");
        System.out.println("║   ██╗      █████╗ ██████╗                        ║");
        System.out.println("║   ██║     ██╔══██╗██╔══██╗                       ║");
        System.out.println("║   ██║     ███████║██████╔╝                       ║");
        System.out.println("║   ██║     ██╔══██║██╔══██╗                       ║");
        System.out.println("║   ███████╗██║  ██║██████╔╝                       ║");
        System.out.println("║   ╚══════╝╚═╝  ╚═╝╚═════╝   S T U D I O          ║");
        System.out.println("║                                                  ║");
        System.out.println("╠══════════════════════════════════════════════════╣");
        System.out.println("║                                                  ║");
        System.out.println("║  [ STUDY GROUP - EPISODE 2 ]                     ║");
        System.out.println("║  Topic  : Struktur Data & Sorting                ║");
        System.out.println("║           (LIFO, FIFO, Quick Sort)               ║");
        System.out.println("║  Author : Fitra Ajax - Tutor Nexa Lab's Studio   ║");
        System.out.println("║                                                  ║");
        System.out.println("║  \"Membangun logika terstruktur untuk             ║");
        System.out.println("║   sistem yang tangguh.\"                          ║");
        System.out.println("║                                                  ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");
    }

    /**
     * Helper method untuk mencetak header bagian yang rapi (Mobile view).
     */
    private static void printHeader(String title) {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.printf("║ %-48s ║\n", title);
        System.out.println("╠══════════════════════════════════════════════════╣");
    }

    /**
     * --- SOAL 1: STACK (LIFO) ---
     */
    public static void implementasiStack() {
        printHeader("1. IMPLEMENTASI STACK (LIFO)");
        Stack<Integer> stack = new Stack<>();
        int[] data = {15, 25, 35, 45, 55, 65, 75, 85}; 

        System.out.println("║ [+] PROSES PUSH: ");
        for (int item : data) {
            stack.push(item);
            System.out.printf("║     -> Push: %d\n", item);
        }

        System.out.printf("║\n║ [*] Isi Stack  :\n║     %s\n", stack);

        System.out.println("║\n║ [-] PROSES POP:");
        System.out.printf("║     <- Pop : %d\n", stack.pop());
        System.out.printf("║     <- Pop : %d\n", stack.pop());

        System.out.printf("║\n║ [*] Pasca Pop  :\n║     %s\n", stack);
        System.out.println("║");
    }

    /**
     * --- SOAL 2: QUEUE (FIFO) ---
     */
    public static void implementasiQueue() {
        printHeader("2. IMPLEMENTASI QUEUE (FIFO)");
        Queue<Integer> queue = new LinkedList<>();
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80}; 

        System.out.println("║ [+] PROSES ENQUEUE:");
        for (int item : data) {
            queue.add(item);
            System.out.printf("║     -> Enqueue: %d\n", item);
        }

        System.out.printf("║\n║ [*] Isi Queue  :\n║     %s\n", queue);

        System.out.println("║\n║ [-] PROSES DEQUEUE:");
        System.out.printf("║     <- Dequeue: %d\n", queue.poll());
        System.out.printf("║     <- Dequeue: %d\n", queue.poll());

        System.out.printf("║\n║ [*] Pasca Dequeue:\n║     %s\n", queue);
        System.out.println("║");
    }

    /**
     * --- SOAL 3: QUICK SORT ---
     */
    public static void implementasiQuickSort() {
        printHeader("3. IMPLEMENTASI QUICK SORT");
        int[] arr = {88, 12, 56, 34, 90, 23, 67, 45}; 
        
        System.out.printf("║ [*] Data Awal  :\n║     %s\n", Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);

        System.out.printf("║\n║ [*] Data Terurut:\n║     %s\n", Arrays.toString(arr));
        System.out.println("║");
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
} 