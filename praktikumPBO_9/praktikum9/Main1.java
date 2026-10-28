package praktikum9;

// Definisi kelas abstrak
abstract class Kendaraan {
//    Metode abstrak
    abstract void berjalan();
    
//    Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}

// Kode utama untuk pengujian
public class Main1 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        Kendaraan kendaraan = new Knedaraan();
    }
}