import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> Questao;

    public Avaliacao(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.Questao = new ArrayList<>();
    }

    //Composição:
    public void adicionarQuestao(int num, String texto, float peso){
        this.Questao.add(new Questao(num, texto, peso));
    }

    //sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Avaliacao [id=" + id + ", nome=" + nome + ", Questao=" + Questao + "]";
    }
}
