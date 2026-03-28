import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {

        // filmes (independentes)
        Filme f1 = new Filme(1, "Batman", "Ação", 120);
        Filme f2 = new Filme(2, "Duna", "Ficção", 150);

        // sessão
        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao s = new Sessao(1, data, 1);

        // agregação
        s.vincularFilme(f1);

        // COMPOSIÇÃO (venda de ingressos)
        s.venderIngresso(1, "A1", "Inteira", 30f);
        s.venderIngresso(2, "A2", "Meia", 15f);
        s.venderIngresso(3, "A3", "Inteira", 30f);

        // saída
        System.out.println(s);
    }
}