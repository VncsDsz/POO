public class Streaming {

    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    public Streaming() {

    }

    public Streaming(String usuario, String plano, String ultimoFilmeAssistido) {
        this.usuario = usuario;
        this.plano = plano;

        // Define mensalidade conforme o plano
        if (plano.equalsIgnoreCase("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    // Assistir filme
    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta inativa. É necessário pagar a fatura.");
        }
    }

    // Cancelar assinatura
    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    // Mostrar dados
    public String toString() {
        return "Usuário: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade: " + this.mensalidade +
                "\nÚltimo filme assistido: " + this.ultimoFilmeAssistido +
                "\nStatus da conta: " + (this.ativo ? "Ativo" : "Suspenso");
    }
}