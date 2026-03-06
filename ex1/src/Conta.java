public class Conta {
    public int numeroConta, agencia;
    public String nomeCliente;
    public boolean status = true; 
    public float saldo = 0;
    public Conta(){

    }
    public Conta(String nomeCliente, int numeroConta, int agencia){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
      
    }
    // depositar
    public void depositar(float x){
        if (this.status){
            this.saldo += x;
            System.out.println("Depositou R$ " + this.saldo);
        } else {
            System.out.println("Não é possivel realizar deposito");
        }
    }
    // sacar
    public void sacar(float x){
         if (this.status && this.saldo - x >=0){
            this.saldo -= x;
            System.out.println("Valor sacado é R$ " + x);
         }else{
            System.out.println("Não há valor para sacar");
         }
    }
    // encerra a conta
    public void encerrarConta(){
         if (this.saldo <= 0){
            this.status = false;
            System.out.println("A conta foi desativada");
         }else{
            System.out.println("Não é possivel encerrar pois há saldo na conta");
         }
    }
    // operações (métodos)
    public String toString(){ 
        return "Nome do Clinete: " + this.nomeCliente +
                " Agência: " + this.agencia +
                " Conta: " + this.numeroConta +
                " Saldo: " + this.saldo +
                " Status: " + (this.status ? "Ativada": "Encerrada");
    }
}