package Proyecto2;

public class AssistentePresidencia extends FuncionesPresidenciales implements ContactoPresidente{
    private Presidente presidente;
    public AssistentePresidencia(String nombre, String dni, Presidente presidente) {
        super(nombre, dni);
        this.presidente = presidente;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    @Override
    public void puesto() {
        System.out.println("Soy assistente de presidencia");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 2000 euros al mes");
    }

    @Override
    public void funcion() {
        System.out.println("Mi funcion es ayudar en todo lo que necesite el presidente");
    }

    @Override
    public void contactoPresidente() {
        System.out.println("Tengo contacto con el presidente");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
