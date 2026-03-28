import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main(String[] args) {
        Medico m1 = new Medico(1, "Dr. João", "Cardiologia");

        Paciente p1 = new Paciente(1, "Maria", "123.456.789-00");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 14, 00);

        Consulta c1 = new Consulta(data, 250.00, m1, p1);

        System.out.println(c1);
    }
}
