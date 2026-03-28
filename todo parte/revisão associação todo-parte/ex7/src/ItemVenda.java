public class ItemVenda {
    private int id;
    private int quantidade;
    private Produto produto;

    public ItemVenda(){
    }

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // sets
    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    // gets
    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public String toString() {
        return produto.getNome() +
               " | Qtd: " + quantidade +
               " | Subtotal: R$ " + (quantidade * produto.getPreco());
    }
}