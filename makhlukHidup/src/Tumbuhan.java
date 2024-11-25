public class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan stomata");
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan dengan fotosintesis");
    }

    public void berbunga() {
        System.out.println(nama + " sedang berbunga");
    }
}
