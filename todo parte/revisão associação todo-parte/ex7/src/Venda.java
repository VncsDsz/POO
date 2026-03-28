import java.util.ArrayList;

public class Venda {
    private Cliente cliente; // agregação
    private ArrayList<ItemVenda> itens; // composição

    public Venda(){
        itens = new ArrayList<>();
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // COMPOSIÇÃO: cria o item dentro da venda
    public void adicionarItem(int id, int quantidade, Produto produto){
        ItemVenda item = new ItemVenda(id, quantidade, produto);
        itens.add(item);
    }

    // opcional (muito bom pra prova)
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getQuantidade() * itens.get(i).getProduto().getPreco();
        }
        return total;
    }

    public String toString() {
        String dados = "Venda\n" + cliente + "\nItens:\n";

        for (int i = 0; i < itens.size(); i++) {
            dados += itens.get(i) + "\n";
        }

        dados += "Total: R$ " + calcularTotal();
        return dados;
    }
}