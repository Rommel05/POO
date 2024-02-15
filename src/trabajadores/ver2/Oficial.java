package trabajadores.ver2;

public class Oficial extends Operario implements Nombre{
    public Oficial(String nombre) {
        super(nombre);
    }
    public void nombre() {
        System.out.println(this.getNombre());
    }
}
