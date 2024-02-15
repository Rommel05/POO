package ReinoAnimal;

public class Gato extends Mamifero{
    public Gato(String nombre, String color) {
        super(nombre, color);
    }
    public void comunicarse() {
        System.out.println("Miau");
    }

    public void jugarConOvillos() {
        System.out.println("Me gusta jugar con ovillos");
    }
}
