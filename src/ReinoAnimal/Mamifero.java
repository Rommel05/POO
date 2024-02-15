package ReinoAnimal;

public class Mamifero extends Animal{
    public Mamifero(String nombre, String color) {
        super(nombre, color);
    }

    public void mamar() {
        System.out.println("Cuando soy pequeño mamo");
    }

    public void moverse() {
        System.out.println("Me muevo a cutro patas");
    }

    public void respirar() {
        System.out.println("Respiro por los pulmones");
    }
}
