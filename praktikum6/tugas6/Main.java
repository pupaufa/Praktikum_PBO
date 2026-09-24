package tugas6;

import java.util.ArrayList;
import java.util.List;

abstract class Produk {
    private String nama;
    private int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public abstract double hitungDiskon();

    public double getHargaDiskon() {
        return harga - hitungDiskon();
    }
}

class Buku extends Produk {
    public Buku(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.5;
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.3;
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.1;
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
        for (Produk produk : daftarProduk) {
            total += produk.getHargaDiskon();
        }
        return total;
    }

    public void hasilBelanja() {
        System.out.println("========== DAFTAR BELANJA ==========");
        for (Produk produk : daftarProduk) {
            System.out.printf("Nama: %-10s | Harga: Rp %-7d | Diskon: Rp %-7.0f | Setelah Diskon: Rp %.0f%n",
                    produk.getNama(),
                    produk.getHarga(),
                    produk.hitungDiskon(),
                    produk.getHargaDiskon()
            );
        }
        System.out.println("------------------------------------");
        System.out.printf("Total Belanja Anda: Rp %.0f%n", totalHarga());
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek produk
        Produk buku = new Buku("Fiksi", 25000);
        Produk elektronik = new Elektronik("TV", 1500000);
        Produk pakaian = new Pakaian("Kemeja", 50000);

        // Memasukkan produk ke dalam keranjang
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Menampilkan daftar belanja dan total
        keranjang.hasilBelanja();
    }
}