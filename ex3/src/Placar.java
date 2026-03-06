public class Placar {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa = 0; 
    public int pontosVisitante = 0;
    public int periodoQuarto = 1; 

    public Placar(){

    }
    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;    
    }
 
    public void registraPonto(String time, int tipo){
        if (tipo != 1 && tipo != 2 && tipo != 3) {
            System.out.println("Tipo de ponto inválido!");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        } 
        else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        } 
        else {
            System.out.println("Time inválido! Use 'casa' ou 'visitante'.");
        }
    }
 
    public void proximoQuarto(){
         if (periodoQuarto < 4) {
            periodoQuarto++;
            System.out.println("Início do " + periodoQuarto + "º quarto.");
        } else {
            System.out.println("O jogo já terminou!");
        }
    }
    
    public String toString(){ 
        return "Time A: " + this.nomeTimeCasa +
                " Placar: " + this.pontosCasa +
                " Time B: " + this.nomeTimeVisitante +
                "Placar: " + this.pontosVisitante +
                this.periodoQuarto + ("° quarto");
    }
}