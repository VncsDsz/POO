import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> atletas;

    public Time(){
        atletas = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    // método pedido
    public void contratarAtleta(Atleta a){
        atletas.add(a);
    }

    // sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    // gets
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public String toString() {
        return "Time: " + nome +
               " | Técnico: " + tecnico +
               "\nAtletas: " + atletas;
    }
}