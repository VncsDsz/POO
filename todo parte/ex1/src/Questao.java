public class Questao {
    private int numero;
    private String enunciado;
    private float valor;

    public Questao(){
    }

    public Questao(int numero, String enunciado, float valor){
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    //sets
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //gets
    public int getNumero() {
        return numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Questao [numero=" + numero + ", enunciado=" + enunciado + ", valor=" + valor + "]";
    }
    
}
