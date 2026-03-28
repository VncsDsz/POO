public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(){
    }

    public Computador(int id, String marca, String marcaProc, String modeloProc, double frequencia) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, frequencia);
    }

    // sets
    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // gets
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    public String toString() {
        return "Computador: " + marca +
               "\n" + processador;
    }
}