package proyecto;

public class Main {
    public static void main(String[] args) {
        Dueño d = new Dueño("Anthony", "24480116D");
        System.out.println(d);
        d.puesto();
        d.salario();
        System.out.println();


        AssistentePresidencia as = new AssistentePresidencia("Maria", "24480554X", d);
        AssistentePresidencia as1 = new AssistentePresidencia("Flor", "24480774S", d);
        System.out.println(as);
        as.puesto();
        as.salario();
        as.funcion();
        System.out.println();
        System.out.println(as1);
        System.out.println();

        d.addAsistentes(as);
        d.addAsistentes(as1);
        for (AssistentePresidencia asis: d.getAsistentes()) {
            System.out.println(asis);
        }
    }
}
