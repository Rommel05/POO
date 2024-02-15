package ReinoAnimal;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Perro", "Negro");
        perro.comunicarse();
        perro.moverse();
        perro.respirar();
        perro.mamar();
        perro.traerZapatilla();
        System.out.println(perro + " - color: " + perro.getColor());
        System.out.println();
        Gato gato = new Gato("Gato", "Gris");
        gato.comunicarse();
        gato.moverse();
        gato.respirar();
        gato.mamar();
        gato.jugarConOvillos();
        System.out.println(gato + " - color: " + gato.getColor());
        System.out.println();
        Tiburon tiburon = new Tiburon("Tiburon", "Blanco");
        tiburon.comunicarse();
        tiburon.moverse();
        tiburon.respirar();
        System.out.println(tiburon + " - color: " + tiburon.getColor());
        System.out.println();
        PezPayaso pezPayaso = new PezPayaso("Pez Payaso", "naranja");
        pezPayaso.comunicarse();
        pezPayaso.moverse();
        pezPayaso.respirar();
        System.out.println(pezPayaso + " - color: " + pezPayaso.getColor());
        System.out.println();
        Cocodrilo coc = new Cocodrilo("Cocodrilo", "verde");
        coc.comunicare();
        coc.moverse();
        coc.respirar();
        System.out.println(coc + " - color: " + coc.getColor());
        System.out.println();
        Serpiente serp = new Serpiente("Serpiente", "Verde oscuro");
        serp.comunicarse();
        serp.moverse();
        serp.respirar();
        System.out.println(serp + " - color: " + serp.getColor());
    }
}
