package trabajadores.ver2;

public class Tecnico extends Operario implements Nombre{
    public Tecnico(String nombre)  {
        super(nombre);
    }
    public void nombre() {
        System.out.println(this.getNombre());
    }
}
