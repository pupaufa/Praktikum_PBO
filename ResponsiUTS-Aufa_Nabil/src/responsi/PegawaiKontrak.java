package responsi;

public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public int getLamaKontrak(){
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak){
        this.lamaKontrak = lamaKontrak;
    }
    
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}
