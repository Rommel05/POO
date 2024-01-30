import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        Autor a = new Autor("J. K. Rowling", "1965");
        Tema t = new Tema("Fantasia");
        List<Tema> l = new ArrayList<>();
        l.add(t);
        LIbro j = new LIbro("Harry Potter y la Piedra Filosofal","J. K. Rowling",l);
        System.out.println(j);
    }
}
