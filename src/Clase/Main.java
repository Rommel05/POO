package Clase;

public class Main {
    public static void main(String[] args) {
        AConocimiento area1 = new AConocimiento("Ciencias");
            Departmento dep1 = new Departmento(10,"matemáticas",area1);
                Facultad fac1 = new Facultad(13, "Facultad1");
                Catedra catedra1 = new Catedra("Catedra1",dep1, fac1);

        AConocimiento area2 = new AConocimiento("Letras");
            Departmento dep2 = new Departmento(12,"Latín",area2);
                Facultad fac2 = new Facultad(15, "Facultad2");
                Catedra catedra2 = new Catedra("catedra2", dep2, fac2);

    }
}
