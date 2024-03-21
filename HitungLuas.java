// Program Java dengan Overloading

public class HitungLuas {
    // Metode untuk menghitung luas persegi panjang
    public int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Metode overloading untuk menghitung luas lingkaran
    public double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        HitungLuas obj = new HitungLuas();

        // Memanggil metode hitungLuas untuk persegi panjang
        System.out.println("Luas persegi panjang: " + obj.hitungLuas(5, 10));

        // Memanggil metode hitungLuas untuk lingkaran
        System.out.println("Luas lingkaran: " + obj.hitungLuas(7.5));
    }
}
