package Herencia;

public class Humano {
    private String nombre;

    public Humano(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cuerpo() {
        System.out.println("Tengo cuerpo");
    }

    public void comunicarse() {
        System.out.println("Me comunico hsblando");
    }

    public void colorPelo() {
        System.out.println("Mi color de pelo es negro");
    }
}
