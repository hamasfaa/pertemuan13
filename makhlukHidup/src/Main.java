public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Andi");
        Hewan hewan = new Hewan("Katak");
        Tumbuhan tumbuhan = new Tumbuhan("Mangga");

        manusia.makan();
        manusia.bernafas();
        manusia.berbicara();
        System.out.println("===================");
        hewan.makan();
        hewan.bernafas();
        hewan.berburu();
        System.out.println("===================");
        tumbuhan.makan();
        tumbuhan.bernafas();
        tumbuhan.berbunga();
    }
}