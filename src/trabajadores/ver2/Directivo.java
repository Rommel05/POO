package trabajadores.ver2;

public class Directivo extends Empleado implements Nombre{
    public Directivo(String nombre) {
        super(nombre);
    }
    public void nombre() {
        System.out.println(this.getNombre());
    }
}
