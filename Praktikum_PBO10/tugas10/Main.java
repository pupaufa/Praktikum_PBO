package tugas10;

public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(250000));
    
        Pembayaran makanan = new Makanan();
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(15000));
    }
}
