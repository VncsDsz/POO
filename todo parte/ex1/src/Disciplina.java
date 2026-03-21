import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> Aluno;
    private ArrayList<Avaliacao> Avaliacao;

    public Disciplina(){
    }

    public Disciplina(int id, String nome, String professor){
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.Aluno = new ArrayList<>();
        this.Avaliacao = new ArrayList<>();
    }

    //Agregação: 
    public void matricularAluno(Aluno a){
        this.Aluno.add(a);
    }

    //Composição:
    public void criarAvaliacao(int id, String nome){
        this.Avaliacao.add(new Avaliacao(id, nome));
    }

    //sets
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    //gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Disciplina [id=" + id + ", nome=" + nome + ", professor=" + professor + ", Aluno=" + Aluno
                + ", Avaliacao=" + Avaliacao + "]";
    } 

}
