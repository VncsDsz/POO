import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private double valorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(){
    }

    public Consulta(LocalDateTime data, double valorConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    // sets
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // gets
    public LocalDateTime getData() {
        return data;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");
        return "Consulta em: " + data.format(formatoBR) +
               "\nValor: R$ " + valorConsulta +
               "\n" + medico +
               "\n" + paciente;
    }
}