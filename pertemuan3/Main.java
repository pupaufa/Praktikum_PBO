package Tugas3;

public class Main {
    public static void main(String[] args) {
        Mobil sedan = new Mobil("Mazda", "Mazda 3", "Hitam", 2023);
        sedan.info();
        sedan.startEngine();
        
        Mobil suv = new Mobil("Toyota", "Fortuner", "Putih", 2015);
        suv.info();
        suv.startEngine();
    }
}
