public class mainPerson {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person javier = new Person("Javier García","Calle Mayor 15 12002 Castellón");
        System.out.println(ada);
        System.out.println(javier);
        Person javer1 = new Person("Javeir Garcia");
        javer1.setDireccion("Calle Mayor 15 12002 Castellón");
        System.out.println(javer1);
    }
}
