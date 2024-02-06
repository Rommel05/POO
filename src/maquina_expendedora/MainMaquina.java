package maquina_expendedora;

public class MainMaquina {
    public static void main(String[] args) {
        Maquina m1 = new Maquina(100,30);
        m1.setDineroIntroducido(200);
    }
    public static String SacarTique(Maquina m1) {
        int resto = m1.getTique() - m1.getDineroIntroducido();
        if (resto > 0) {

        } else {
            System.out.println("No se ouede realizar esta oprecaión");
        }
    }
}
