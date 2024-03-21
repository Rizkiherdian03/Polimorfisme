// Program Java dengan Overriding

class Hewan {
    // Metode suara default untuk hewan
    public void suara() {
        System.out.println("Hewan mengeluarkan suara.");
    }
}

class Kucing extends Hewan {
    // Overriding metode suara untuk kucing
    @Override
    public void suara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    // Overriding metode suara untuk anjing
    @Override
    public void suara() {
        System.out.println("Guk guk!");
    }
}

public class TestPolimorfisme {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.suara();
        hewan2.suara(); 
    }
}
