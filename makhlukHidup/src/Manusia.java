public class Manusia extends MakhlukHidup {
    public Manusia(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan paru-paru");
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan nasi");
    }

    public void berbicara() {
        System.out.println(nama + " sedang berbicara");
    }
}
