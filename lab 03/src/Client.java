public class Client extends Vizitator {
    public void gestionareCos() {
        System.out.println("gestionare cos...");
    }

    public void plasareComanda() {
        System.out.println("plasare comanda...");
    }

    public void efectuarePlata(SistemPlata sistemPlata) {
        System.out.println("initiata plata...");
        sistemPlata.procesarePlata();
    }

    public void urmarireComanda() {
        System.out.println("urmarire comanda...");
    }

    public void gestionareCont() {
        System.out.println("gestionare cont...");
    }
}