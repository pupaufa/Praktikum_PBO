package Tugas5;

// Kelas Induk
class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}


// Kelas Turunan Kucing
class Kucing extends Hewan {
    
    public void bersuara() {
        System.out.println("Miaw");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    
    public void bersuara() {
        System.out.println("GukGuk");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Asep";
        kucing.jenis = "Kampung";
        kucing.tampilkanInfo();
        
        System.out.println("");
        
        Anjing anjing = new Anjing();
        anjing.nama = "Alex";
        anjing.jenis = "Pitbull";
        anjing.tampilkanInfo();
    }
    
}
