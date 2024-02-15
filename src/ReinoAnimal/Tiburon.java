package ReinoAnimal;

public class Tiburon extends Pez{
    public Tiburon(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse() {
        System.out.println("Arqueo el cuerpo para comunicarme");
    }
}
