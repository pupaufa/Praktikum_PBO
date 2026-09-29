package responsi;

public class PegawaiTetap extends Pegawai{
    private int tunjangan;
    
    public int getTunjangan(){
        return tunjangan;
    }
    
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan){
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
