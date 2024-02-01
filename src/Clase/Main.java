package Clase;

public class Main {
    public static void main(String[] args) {
        AConocimiento area1 = new AConocimiento("Ciencias");
            Departmento dep1 = new Departmento(10,"matemáticas",area1);

        AConocimiento area2 = new AConocimiento("Letras");
            Departmento dep2 = new Departmento(12,"Latín",area2);

    }
}
