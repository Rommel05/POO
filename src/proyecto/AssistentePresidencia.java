package proyecto;

public class AssistentePresidencia extends Trabajadores{
    private Dueño dueño;
    public AssistentePresidencia(String nombre, String dni, Dueño dueño) {
        super(nombre,dni);
        this.dueño = dueño;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 3.500 euros al mes");
    }

    @Override
    public void puesto() {
        System.out.println("Soy assistente de presidencia");
    }

    public void funcion() {
        System.out.println("Mi funcion es ayudar en todo lo que necesite el presidente");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
