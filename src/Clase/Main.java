package Clase;

public class Main {
    public static void main(String[] args) {
        AConocimiento area1 = new AConocimiento("Ciencias");
        Departmento dep1 = new Departmento(10,"matemáticas",area1);
                Facultad fac1 = new Facultad(13, "Facultad1");
                Catedra catedra1 = new Catedra("Catedra1",dep1, fac1);
                    Professor profe1 = new Professor(12, dep1);
                    catedra1.addProfe(profe1);
                    profe1.addCatedras(catedra1);
        for (Departmento departamento: area1.getDepartmentos()) {
            for (Professor profe:departamento.getProfessores()) {
                System.out.println(profe);
            }
        }
    }
}
