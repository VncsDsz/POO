public class Apartamento {
    private int numero, andar;

    public Apartamento(){
    }

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    // sets
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    // gets
    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    public String toString() {
        return "Apartamento " + numero + " | Andar: " + andar;
    }
}