public class Cliente {
    private int id;
    private String nome;

    public Cliente(){
    }

    public Cliente(int id, String nome) {
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
        return "Cliente: " + nome;
    }
}