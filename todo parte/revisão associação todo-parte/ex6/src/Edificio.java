import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(){
        apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar){
        Apartamento a = new Apartamento(num, andar);
        apartamentos.add(a);
    }

    // sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // gets
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public String toString() {
        return "Edifício: " + nome +
               " | Endereço: " + endereco +
               "\nApartamentos: " + apartamentos;
    }
}