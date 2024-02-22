package Proyecto2;

public class Main {
    public static void main(String[] args) {
        Presidente p = new Presidente("Antonio", "24480997D");
        System.out.println(p);
        p.puesto();
        p.funcion();
        p.salario();
        System.out.println();


        AssistentePresidencia a1 = new AssistentePresidencia("Maria", "25679338I", p);
        AssistentePresidencia a2 = new AssistentePresidencia("Juana", "25675438O", p);
        System.out.println(a1);
        System.out.println(a2);
        a1.funcion();
        a1.funcion();
        a1.salario();
        a1.contactoPresidente();
        System.out.println();


        p.addAsistentes(a1);
        p.addAsistentes(a2);
        System.out.println("Asistentes:");
        for(AssistentePresidencia asis : p.getAssistentesPresidencia()) {
            System.out.println(asis);
        }
        System.out.println();


        Administrativo admin1 = new Administrativo("Victor", "24550996O", p);
        Administrativo admin2 = new Administrativo("Samuel", "24658096R", p);
        System.out.println(admin1);
        System.out.println(admin2);
        admin1.puesto();
        admin1.salario();
        admin1.funcion();
        System.out.println();


        p.AddAdministrativos(admin1);
        p.AddAdministrativos(admin2);
        System.out.println("Administrativos:");
        for (Administrativo admins : p.getAdministrativos()) {
            System.out.println(admins);
        }
        System.out.println();


        AuxiliarAdministracion auxiliarAdmin1 = new AuxiliarAdministracion("Ramon", "22375878G", admin1);
        AuxiliarAdministracion auxiliarAdmin2 = new AuxiliarAdministracion("Pepe", "24785878F", admin2);
        AuxiliarAdministracion auxiliarAdmin3 = new AuxiliarAdministracion("Alex", "24985865L", admin2);
        System.out.println(auxiliarAdmin1);
        System.out.println(auxiliarAdmin2);
        System.out.println(auxiliarAdmin3);
        auxiliarAdmin1.puesto();
        auxiliarAdmin1.salario();
        auxiliarAdmin1.funcion();
        System.out.println();


        admin1.addAuxiliares(auxiliarAdmin1);
        System.out.println("Auxiliares administrativos:");
        for(AuxiliarAdministracion auxiliaradmin : admin1.getAuxiliaresAdministracion()) {
            System.out.println(admin1 + ": " + auxiliaradmin);
        }
        System.out.println();

        admin2.addAuxiliares(auxiliarAdmin2);
        admin2.addAuxiliares(auxiliarAdmin3);
        for (AuxiliarAdministracion auxiliaradmin : admin2.getAuxiliaresAdministracion()) {
            System.out.println(admin2 + ": " + auxiliaradmin);
        }
        System.out.println();


        GerenteVentas gerenteVentas1 = new GerenteVentas("Eduardo", "249568695T",p);
        GerenteVentas gerenteVentas2 = new GerenteVentas("Erik", "249567909U",p);
        System.out.println(gerenteVentas1);
        System.out.println(gerenteVentas2);
        gerenteVentas1.puesto();
        gerenteVentas1.salario();
        gerenteVentas1.funcion();
        gerenteVentas1.contactoPresidente();

        System.out.println();


        p.addGerentesVentas(gerenteVentas1);
        p.addGerentesVentas(gerenteVentas2);
        System.out.println("Gerentes:");
        for (GerenteVentas gerente : p.getGerentesVentas()) {
            System.out.println(gerente);
        }
        System.out.println();


        Vendedor v1 = new Vendedor("Carlos", "24985865L", gerenteVentas1);
        Vendedor v2 = new Vendedor("Jose", "249568695T", gerenteVentas2);
        Vendedor v3 = new Vendedor("Ignacio", "249567909U", gerenteVentas2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        v1.puesto();
        v1.salario();
        v1.funcion();
        System.out.println();


        gerenteVentas1.addVendedores(v1);
        gerenteVentas2.addVendedores(v2);
        gerenteVentas2.addVendedores(v3);
        System.out.println("Vendedores:");
        for(Vendedor ven: gerenteVentas1.getVendedores()) {
            System.out.println(gerenteVentas1 + ": " + ven);
        }

        for(Vendedor ven: gerenteVentas2.getVendedores()) {
            System.out.println(gerenteVentas2 + ": " + ven);
        }

    }
}
