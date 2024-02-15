package ReinoAnimal;

public class Reptiles extends Animal{
    public Reptiles(String nombre, String color) {
        super(nombre, color);
    }

    public void moverse() {
        System.out.println("Me arrastro para desplazarme");
    }

    public void respirar() {
        System.out.println("Respiro por los pulmones");
    }
}
