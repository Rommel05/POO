package banco;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco(100, "BBVA", new HashSet<Sucursal>());
            Sucursal sMayor = new Sucursal(11, "C/ mayor", bbva);
            bbva.addSucursal(sMayor);
            CuentaCorriente cuenta1 = new CuentaCorriente(10,sMayor);
                Cliente maria = new Cliente(1,"24489228S","Maria");
                cuenta1.addCli(maria);
                maria.addCuenta(cuenta1);
                Domicializacion dom = new Domicializacion(1110,"Iberdrola",100, cuenta1);
                cuenta1.addDom(dom);
                Prestamo p1 = new Prestamo(99, 1000, sMayor, maria);
                    sMayor.addPrestamo(p1);

        Sucursal sEnMedio = new Sucursal(12, "C/ enmedio", bbva);
            Cliente juan = new Cliente(2,"24484506J" ,"Juan");
            Prestamo p2 = new Prestamo(100, 5000, sEnMedio, juan);
            CuentaCorriente cuenta2 = new CuentaCorriente(1, sEnMedio);
            juan.addPres(p2);
            bbva.addSucursal(sEnMedio);
                sMayor.addPrestamo(p2);
                System.out.println(bbva);
        for(Sucursal s: bbva.getSucursales()) {
            System.out.println("\t" + s);
            for(Prestamo p:s.getPrestamos()) {
                System.out.println("\t\t" + p);
            }
            for (CuentaCorriente cc:s.getCuentas()) {
                System.out.println(cc);
                for(Domicializacion d:cc.getDomicializaciones()) {
                    System.out.println(cc);
                }
            }


        }
        System.out.println("Juan " + juan.getPrestamos());

    }
}
