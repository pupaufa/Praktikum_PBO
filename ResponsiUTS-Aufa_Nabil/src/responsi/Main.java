package responsi;

public class Main {
    public static void main(String[] args){
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println();
        
        Pegawai aufa = new PegawaiTetap("Aufa", 5000000,1000000);
        aufa.tampilkanInfo();
        System.out.println();
        
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        snack.tampilkanInfo();
        System.out.println();
        
        Pegawai andi = new PegawaiKontrak("Andi", 3000000, 12);
        andi.tampilkanInfo();
        System.out.println();
    }
}
