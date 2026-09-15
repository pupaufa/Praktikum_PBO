package praktikum4;

public class Praktikum_PBO4 {

    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);

        // Menampilkan data awal
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());

        // Mengubah data
        mobil.setModel("Innova");
        mobil.setTahun(2021);

        // Menampilkan data setelah perubahan
        System.out.println("Model baru: " + mobil.getModel());
        System.out.println("Tahun baru: " + mobil.getTahun());
    }
}