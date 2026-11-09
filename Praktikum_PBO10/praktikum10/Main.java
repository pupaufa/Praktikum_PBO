package praktikum10;

// Kelas Main
public class Main {
    public static void main(String[] args) {
    // Objek Penjumlahan
    OperasiHitung penjumlahan = new Penjumlahan();
    System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5));

    // Objek Penjumlahan
    OperasiHitung pengurangan = new Pengurangan();
    System.out.println("Penguragan: " + pengurangan.hitung(10, 5));
    }
}