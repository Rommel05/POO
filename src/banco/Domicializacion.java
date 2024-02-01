package banco;

public class Domicializacion {
    private int nDom;
    private String companyia;
    private int cuantia;

    private CuentaCorriente cuenta;

    public Domicializacion(int nDom, String companyia, int cuantia, CuentaCorriente cuenta) {
        this.nDom = nDom;
        this.companyia = companyia;
        this.cuantia = cuantia;
        this.cuenta  = cuenta;
    }
    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public int getnDom() {
        return nDom;
    }

    public void setnDom(int nDom) {
        this.nDom = nDom;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public int getCuantia() {
        return cuantia;
    }

    public void setCuantia(int cuantia) {
        this.cuantia = cuantia;
    }

    @Override
    public String toString() {
        return this.companyia + " - " + this.cuantia;
    }
}
