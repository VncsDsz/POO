import java.time.LocalDateTime;

public class Testa {
    public static void main(String[] args) {

        Leitor l = new Leitor(1, "Carlos");

        Livro livro = new Livro(1, "Java Básico", "Deitel");

        LocalDateTime dataEmp = LocalDateTime.now();
        LocalDateTime dataDev = dataEmp.plusDays(7);

        Emprestimo e = new Emprestimo(dataEmp, dataDev, l, livro);

        System.out.println(e);
    }
}
