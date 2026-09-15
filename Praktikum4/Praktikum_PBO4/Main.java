package praktikum4;

public class Main {

    public static void main(String[] args) {
        // Objek Kendaraan: (nama, kecepatanMaks, jenisMesin)
        Kendaraan kendaraan = new Kendaraan("Kendaraan Umum", 120, "Diesel");
        System.out.println("=== INFORMASI KENDARAAN ===");
        kendaraan.tampilkanInfoKendaraan();

        System.out.println();

        // Objek Mobil: (nama, kecepatanMaks, jenisMesin, jumlahPintu)
        Mobil mobil = new Mobil("Toyota Avanza", 180, "Bensin", 4);
        System.out.println("=== INFORMASI MOBIL ===");
        mobil.tampilkanInfoKendaraan();
        mobil.tampilkanInfoMobil();
    }
}