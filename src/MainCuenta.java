public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Alberto", 600);
        cuenta1.ingrear(1000);
        System.out.println(cuenta1);
        Cuenta cuenta2 = new Cuenta("Samuel", 200);
        cuenta2.ingrear(-1);
        System.out.println(cuenta2);
        Cuenta cuenta3 = new Cuenta("Juan", 800);
        cuenta3.retirar(1000);
        System.out.println(cuenta3);
        Cuenta cuenta4 = new Cuenta("Ignacio", 400);
        cuenta4.retirar(300);
        System.out.println(cuenta4);
    }
}
