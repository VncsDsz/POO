import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(){
        programadores = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    
    public void adicionarProgramador(Programador p){
        programadores.add(p);
    }

    public void listarProgramadores(){
        System.out.println("Projeto: " + nomeProjeto);
        System.out.println("Programadores:");

        for (int i = 0; i < programadores.size(); i++) {
            System.out.println(programadores.get(i));
        }
    }

    // sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    // gets
    public int getId() {
        return id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public String toString() {
        return "Projeto: " + nomeProjeto + " | Programadores: " + programadores;
    }
}