public class aire {
    private String nombre;
    private int temp;
    private int tempMax;
    private int tempMin;
    public aire(String nombre, int temp, int tempMax, int tempMin) {
        this.nombre = nombre;
        this.temp = temp;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    public void augmentarTemp() {
        if (this.temp + 1 <= this.tempMax) {
            this.temp++;
        }
    }
    public void dismunuirTemp() {
        if (this.temp - 1 > this.tempMin) {
            this.temp--;
        }
    }
    @Override
    public String toString() {
        return getNombre() + " - " + getTemp();
    }
}
