public class Vizitator {
    public void vizualizareProduse() {
        System.out.println("vizualizare produse...");
    }

    public void cautareProduse() {
        System.out.println("cautare produse...");
    }

    public Client creareCont() {
        System.out.println("creare cont...");
        return new Client();
    }
}