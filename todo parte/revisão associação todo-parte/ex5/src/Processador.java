public class Processador {
    private String marca, modelo;
    private double frequencia;

    public Processador(){
    }

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    // sets
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    // gets
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public String toString() {
        return "Processador: " + marca + " " + modelo +
               " | " + frequencia + "GHz";
    }
}