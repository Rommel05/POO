package Herencia;

public class Main {
    public static void main(String[] args) {
        Humano1 humano = new Humano1("Pepe");
        humano.comunicarse();
        humano.cuerpo();
        humano.colorPelo();
        System.out.println("");
        Humano humano1 = new Humano("Jose");
        humano1.comunicarse();
        humano1.cuerpo();
        humano1.colorPelo();

    }
}
