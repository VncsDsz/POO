public class TestaConta {
    public static void main(String args[]){

        Conta c1 = new Conta("João Silva", 123, 001);
        System.out.println(c1.toString());
        c1.depositar(500);
        System.out.println(c1.toString());
        c1.sacar(200);
        System.out.println(c1.toString());
        c1.encerrarConta();
        System.out.println(c1.toString());
        c1.sacar(300);
        System.out.println(c1.toString());

        Conta c2 = new Conta("Maria Souza", 456, 002);
        System.out.println(c2.toString());
        c2.sacar(50);
        System.out.println(c2.toString());
    }
}
