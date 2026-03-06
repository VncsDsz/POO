public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido; 
    public float mensalidade; 
    public boolean ativo;

    public Streaming(){

    }

    public Streaming(String usuario, String plano) {
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
    //assistir o filme
    public assistirFilme(String nomeFilme){
         if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta inativa. É necessário pagar a fatura.");
        }   
    }
    //consultar conta
    public cancelarAssinatura(){
            this.plano = false;

    }   
    //
    public String toString(){
        return " Usuário: " + this.usuario +
                " Plano: " + this.plano +
                " Mensalidade: " + this.mensalidade +
                " Ultimo filme assistido: " + this.ultimoFilmeAssistido +
                " Status da Conta : " + (this.ativo ? "ativo": "suspenso");
    }

}
