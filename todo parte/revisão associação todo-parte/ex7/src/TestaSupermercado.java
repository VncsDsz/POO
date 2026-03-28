public class TestaSupermercado {
    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Arroz", 25.0);
        Produto p2 = new Produto(2, "Feijão", 10.0);

        Cliente c = new Cliente(1, "João");

        Venda v = new Venda(c);

        v.adicionarItem(1, 2, p1);
        v.adicionarItem(2, 3, p2);

        System.out.println(v);
    }
}
