public class MainOrdenador {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador(628.99, "ASUS", "VivoBook 15 F1502ZA-EJ650W");
        System.out.println(ordenador1);
        Ordenador ordenador2 = new Ordenador(300, "HP");
        ordenador2.setModelo("ZBook");
        System.out.println(ordenador2);
        Ordenador ordenador3 = new Ordenador(1000);
        System.out.println(ordenador3);
    }
}
