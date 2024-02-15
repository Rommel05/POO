package ReinoAnimal;

public class Cocodrilo extends Reptiles{
    public Cocodrilo(String nombre, String color) {
        super(nombre,color);
    }
    public void comunicare() {
        System.out.println("Nos comunicamos mediante mordiscos");
    }
}
