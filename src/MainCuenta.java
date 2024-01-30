public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Alberto", 600);
        cuenta1.ingrear(1000);
        System.out.println(cuenta1);
        Cuenta cuenta2 = new Cuenta("Juan", 800);
        cuenta2.retirar(700);
        System.out.println(cuenta2);
    }
}
