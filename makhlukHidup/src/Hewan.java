public class Hewan extends MakhlukHidup{
    public Hewan(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan paru-paru atau insang");
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan serangga");
    }

    public void berburu() {
        System.out.println(nama + " sedang berburu");
    }
}
