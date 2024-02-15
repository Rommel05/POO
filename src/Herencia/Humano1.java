package Herencia;

public class Humano1 extends Humano{
    public Humano1(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Me comunico mediante signos");
    }
    public void colorPelo() {
        System.out.println("Mi color de pelo es rubio");
    }
}
