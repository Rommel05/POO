package ReinoAnimal;

public class Perro extends Mamifero{
    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    public void comunicarse() {
        System.out.println("Guau");
    }

    public void traerZapatilla() {
        System.out.println("Toma tus zapatillas, amo");
    }
}
