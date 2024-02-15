package trabajadores.ver2;

public class Operario extends Empleado implements Nombre{
    public Operario(String nombre) {
        super(nombre);
    }
    public void nombre() {
        System.out.println(this.getNombre());
    }
}
