public class Programador {
    private int id;
    private String nome, linguagemPrincipal;

    public Programador(){
    }

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public String toString() {
        return "Programador: " + nome + " | Linguagem: " + linguagemPrincipal;
    }
}