package tugas6;

import java.util.ArrayList;
import java.util.List;

abstract class Produk {
    String nama;
    int harga;
    
    public Produk (String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public abstract double Diskon();
    
    public double getHargaDiskon () {
        return harga - Diskon();
    }
}

class Buku extends Produk {
    public Buku (String nama, int harga){
        super(nama, harga);
    }
    
    @Override
    public double Diskon() {
        return harga * 0.5;
    }
}

class Elektronik extends Produk {
    public Elektronik (String nama, int harga) {
        super(nama, harga);
    }
    
    @Override
    public double Diskon() {
        return harga * 0.3;
    }
}

class Pakaian extends Produk {
    public Pakaian (String nama, int harga) {
        super(nama, harga);
    }
    
    @Override
    public double Diskon() {
        return harga * 0.1;
    }
}

class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    
    public double totalHarga() {
        double total = 0;
        for (Produk produk : daftarProduk){
            total += produk.getHargaDiskon();
        }
        return total;
    }
    
    public void hasilBelanja() {
        System.out.println("========== DAFTAR BELANJA ==========");
        for (Produk produk : daftarProduk){
            // PERBAIKAN: Menggunakan format printf yang benar
            System.out.printf("Nama: %-10s | Harga: Rp %-7d | Diskon: Rp %-7.0f | Setelah Diskon: Rp %.0f%n", 
                produk.getNama(), 
                produk.getHarga(), 
                produk.Diskon(), 
                produk.getHargaDiskon()
            );
        }
        System.out.println("------------------------------------");
        System.out.printf("Total Belanja Anda: Rp %.0f%n", totalHarga());
    }
}

public class Main {
    // PERBAIKAN: Mengubah 'Main' menjadi 'main' (huruf kecil)
    public static void main(String[] args) {
        // Membuat objek produk
        Produk buku = new Buku("Fiksi", 25000);
        Produk elektronik = new Elektronik("TV", 1500000);
        Produk pakaian = new Pakaian("Kemeja", 50000);    
        
        // PERBAIKAN: Memasukkan logika keranjang ke dalam method main
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        
        // Menampilkan struk belanja
        keranjang.hasilBelanja();
    }
}
