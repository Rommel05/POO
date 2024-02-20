package network1;

public class Main {
    public static void main(String[] args) {
        Usuario maria = new Usuario("Maria");
        Usuario pepe = new Usuario("Pepe");
        Usuario ana = new Usuario("Ana");
        Texto t = new Texto(maria,"Esto es un texto");
        maria.addPublicacion(t);
        Foto f = new Foto(pepe,"Flor.jpg","Flor");
        maria.addPublicacion(f);
        pepe.addPublicacion(f);
        Comentario c = new Comentario(t,pepe,"Muy bueno");
        t.addComent(c);
        System.out.println(t);
        System.out.println(f);
        for (Comentario com : t.getComentarios()) {
            System.out.println(com);
        }
        for (Publicacion p : maria.getPublicaciones()) {
            System.out.println(p);
        }
    }
}
