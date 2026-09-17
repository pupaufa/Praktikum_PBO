package tugas5;

// Kelas Induk Kendaraan
class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas KendaraanDarat
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Kelas Turunan Mobil
class Mobil extends KendaraanDarat {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas Turunan Motor
class Motor extends KendaraanDarat {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Mazda";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.jumlahRoda = 4;
        mobil.tampilkanInfo();
        
        System.out.println("");
        
        Motor motor = new Motor();
        motor.nama = "XSR";
        motor.kecepatan = 155;
        motor.jenisMesin = "VVA";
        motor.jumlahRoda = 2;
        motor.tampilkanInfo();
    }
}
