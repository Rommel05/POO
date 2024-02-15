package ReinoAnimal;

public class Serpiente extends Reptiles{
    public Serpiente(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse() {
        System.out.println("Nos comunicamos mediante la lengua");
    }
}
