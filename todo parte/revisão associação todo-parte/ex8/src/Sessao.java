import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    private Filme filme; // AGREGAÇÃO
    private ArrayList<Ingresso> ingressos; // COMPOSIÇÃO

    public Sessao(){
        ingressos = new ArrayList<>();
    }

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // AGREGAÇÃO
    public void vincularFilme(Filme f){
        this.filme = f;
    }

    // COMPOSIÇÃO
    public void venderIngresso(int id, String assento, String tipo, float preco){
        Ingresso i = new Ingresso(id, assento, tipo, preco);
        ingressos.add(i);
    }

    public String toString() {
        String dados = "Sessão\n";
        dados += "Sala: " + sala + "\n";
        dados += "Horário: " + horario + "\n";
        dados += filme + "\n";

        dados += "Ingressos:\n";
        for (int i = 0; i < ingressos.size(); i++) {
            dados += ingressos.get(i) + "\n";
        }

        return dados;
    }
}