public class Leitor {
    private int id;
    private String nome;

    public Leitor(){
    }

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Leitor: " + nome;
    }
}