package trabajadores.ver2;

public class Main {
    public static void main(String[] args) {
        Empleado em = new Empleado("Juan");
        System.out.println(em);
        System.out.println();
        Operario op = new Operario("Raul");
        op.nombre();
        System.out.println();
        Directivo dir = new Directivo("Pepe");
        dir.nombre();
        System.out.println();
        Oficial of = new Oficial("Luis");
        of.nombre();
        System.out.println();
        Tecnico t = new Tecnico("Hector");
        t.nombre();
    }
}
