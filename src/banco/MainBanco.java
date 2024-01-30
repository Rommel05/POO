package banco;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco(100, "BBVA", new HashSet<>());
            Sucursal sMayor = new Sucursal(11, "C/ mayor", bbva);
                Prestamo p1 = new Prestamo(99, 1000, sMayor);
                    sMayor.addPrestamo(p1);

        Sucursal sEnMedio = new Sucursal(12, "C/ enmedio", bbva);
            Prestamo p2 = new Prestamo(100, 5000, sEnMedio);
                sMayor.addPrestamo(p2);
        bbva.addSucursal(sMayor);
        bbva.addSucursal(sEnMedio);
        System.out.println(bbva);
        for(Sucursal s: bbva.getSucursales()) {
            System.out.println("\t" + s);
            for(Prestamo p:s.getPrestamos()) {
                System.out.println("\t\t" + p);
            }
        }
    }
}
