import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
    public static void main(String[] args) {
        // Membuat HashSet untuk menyimpan nama
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Menambahkan elemen ke HashSet
        System.out.println("Masukkan nama (ketik 'exit' jika anda ingin melanjutkan):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; // Keluar dari loop jika pengguna mengetik 'exit'
            }
            names.add(input); // Menambahkan nama ke HashSet
            System.out.println("Nama telah berhasil dimasukkan, ingin menambah lagi? (ketik 'exit' jika anda ingin berhenti atau selesai)");
        }

        // Menampilkan elemen dalam HashSet
        System.out.println("Nama-nama dalam HashSet: " + names);

        // Menghapus elemen dari HashSet
        while (true) {
            System.out.print("Masukkan nama yang ingin dihapus (ketik 'lanjut' jika anda ingin melanjutkan): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("lanjut")) {
                break; // Keluar dari loop jika pengguna mengetik 'exit'
            }
            if (names.remove(input)) {
                System.out.println(input + " telah dihapus.");
            } else {
                System.out.println(input + " tidak ditemukan dalam HashSet.");
            }
            // Menampilkan elemen setelah penghapusan
            System.out.println("Setelah penghapusan: " + names);
        }

        // Menampilkan elemen dalam HashSet
        System.out.println("Nama-nama dalam HashSet: " + names);

        // Mengecek apakah elemen ada dalam HashSet
        while (true) {
            System.out.print("Masukkan nama untuk dicek keberadaannya (ketik 'Selesai' untuk mengakhiri program): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Selesai")) {
                break; // Keluar dari loop jika pengguna mengetik 'Done'
            }
            if (names.contains(input)) {
                System.out.println(input + " ada dalam HashSet.");
                // Menampilkan jumlah elemen dalam HashSet
                System.out.println("Jumlah elemen dalam HashSet: " + names.size());
            } else {
                System.out.println(input + " tidak ada dalam HashSet.");
            }
        }

        // Menampilkan jumlah elemen dalam HashSet
        System.out.println("Jumlah elemen dalam HashSet: " + names.size());

        // Mengosongkan HashSet
        names.clear();
        System.out.println("Setelah mengosongkan HashSet: " + names);

        // Menutup scanner
        scanner.close();
    }
}