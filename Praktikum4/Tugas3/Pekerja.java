package Tugas3;

public class Pekerja extends Manusia {
    private int gaji;
    
    // Constructor
    public Pekerja (String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter Setter Gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    @Override
    public String toString(){
        return "Nama: " + getNama() + ", Usia: " + usia + ", Pekerjaan: " + pekerjaan +", Gaji: " + gaji;
    }
}
