package ReinoAnimal;

public class Pez extends Animal{
    public Pez(String nombre, String color) {
        super(nombre, color);
    }

    public void moverse() {
        System.out.println("Respiro por las branqueas");
    }
    public void respirar() {
        System.out.println("Nado con aletas");
    }
}
