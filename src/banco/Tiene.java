package banco;

public class Tiene {
    private CuentaCorriente cuenta;
    private Cliente cliente;
    private String priv;

    public Tiene(CuentaCorriente cuenta, Cliente cliente, String priv) {
        this.cuenta = cuenta;
        this.cliente = cliente;
        this.priv = priv;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }
}
