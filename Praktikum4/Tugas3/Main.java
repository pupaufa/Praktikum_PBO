package Tugas3;

public class Main {
    public static void main(String[] args) {
      Pekerja asep = new Pekerja("Asep", 25, "Kasir", 25000000);
      System.out.println(asep);
      asep.setNama("Agus");
      System.out.println(asep);
//      System.out.println(asep.nama);
      System.out.println(asep.usia);
//      System.out.println(asep.gaji);
    }
}
