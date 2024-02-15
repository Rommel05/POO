package trabajadores;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Pepe");
        System.out.println(e);
        System.out.println();
        Operario o = new Operario("Juan");
        System.out.println(o);
        System.out.println();
        Directivo dir = new Directivo("Ignacio");
        System.out.println(dir);
        System.out.println();
        Oficial of = new Oficial("Luis");
        System.out.println(of);
        System.out.println();
        Tecnico t = new Tecnico("Adrian");
        System.out.println(t);
    }
}
