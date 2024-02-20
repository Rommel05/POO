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

        d.addAsistentes(as);
        d.addAsistentes(as1);
        System.out.println("Assistentes:");
        for (AssistentePresidencia asis: d.getAsistentes()) {
            System.out.println(asis);
        }
        System.out.println();

        Administrativos admin1 = new Administrativos("Eduardo", "24480554J", d);
        System.out.println(admin1);
        admin1.puesto();
        admin1.salario();
        admin1.funcion();
        System.out.println();

        Administrativos admin2 = new Administrativos("Mariela", "23380994K", d);
        d.addAdministrativos(admin1);
        d.addAdministrativos(admin2);
        System.out.println("Administrativos:");
        for (Administrativos a: d.getAdministrativos()) {
            System.out.println(a);
        }
    }
}
