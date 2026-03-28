public class Medico {
    private int id;
    private String nome, especialidade;

    public Medico(){
    }

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    //sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //gets
    public String getNome() {
        return nome;
    }

     public String getEspecialidade() {
        return especialidade;
    }

     public int getId() {
        return id;
    }

    public String toString() {
        return "Medico: " + nome + " | Especialidade: " + especialidade;
    }
}