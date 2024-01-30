package banco;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco(100, "BBVA", new HashSet<>());
        Sucursal sMayor = new Sucursal(11, "C/ mayor", bbva);
        Sucursal sEnMedio = new Sucursal(12, "C/ enmedio", bbva);
        bbva.addSucursal(sMayor);
        bbva.addSucursal(sEnMedio);
        System.out.println(bbva);
        for(Sucursal s: bbva.getSucursales()) {
            System.out.println("\t" + s);
        }
    }
}
