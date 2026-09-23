package praktikum6;

class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println ("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
      Hewan hewan = new Kucing();
      hewan.bersuara(); // Output: Meow
      
      Kucing kucing = new Kucing();
      kucing.makan("ikan"); // Memanggil metode makan() dari kelas hewan
      kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
      
      Anjing anjing = new Anjing();
      anjing.bersuara(); // Output: woof
      anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas hewan
    }
}
