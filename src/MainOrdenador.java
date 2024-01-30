public class MainOrdenador {
    public static void main(String[] args) {
        Ordenadores ordenador1 = new Ordenadores(628.99, "ASUS", "VivoBook 15 F1502ZA-EJ650W");
        System.out.println(ordenador1);
        Ordenadores ordenador2 = new Ordenadores(300, "HP");
        ordenador2.setModelo("ZBook");
        System.out.println(ordenador2);
        Ordenadores ordenador3 = new Ordenadores(1000);
        System.out.println(ordenador3);
    }
}
