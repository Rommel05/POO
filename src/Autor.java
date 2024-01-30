public class Autor {
    private String autor;
    private String FechaNacimiento;

    public Autor(String autor, String fechaNacimiento) {
        this.autor = autor;
        FechaNacimiento = fechaNacimiento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return getAutor() + " - " + getFechaNacimiento();
    }
}
