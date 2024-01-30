package banco;

public class Sucursal {
    private int numSucursal;
    private String direccion;
    private Banco banco;

    public Sucursal(int numSucursal, String direccion, Banco banco) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.banco = banco;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return this.numSucursal + " " + this.banco;
    }
}
