import java.util.ArrayList;
import java.util.Date;
 
public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente; //cliente dentro do carrinho
    private ArrayList<ItemCarrinho> itensCarrinhos;
 
    public CarrinhoCompra() {
        this.itensCarrinhos = new ArrayList<>();
    }

    //esse construtor caracteriza uma agregação
    //motivo: cliente já veio criado, é independente
    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensCarrinhos = new ArrayList<>();
    }
    
    //adicionar itens do carrinho no carrinho - composição
    //item de carrinho depende do carrinho para ser criado 
    public void adicionaItemCarrinho(int id, float qtde, Produto produto){
        ItemCarrinho aux = new ItemCarrinho(id, qtde, produto);
        this.itensCarrinhos.add(aux);
    }

    public void calculaTotal(){
        float valorTotal = 0;

        for(ItemCarrinho aux: this.itensCarrinhos ){
            valorTotal += aux.getQtde() * aux.getProduto().getPreco();
        }
        System.out.println("Valor total da compra R$ " + valorTotal);
    }


    //id
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    //data
    public Date getData() {
        return data;
    }
 
    public void setData(Date data) {
        this.data = data;
    }
    
    //é agregação
    public Cliente getCliente() {
        return cliente;
    }
 
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
     @Override
    public String toString() {
        return "\n===== CARRINHO DE COMPRA =====\n" +
               "ID: " + id + "\n" +
               "Data: " + data + "\n" +
               "\n--- Cliente ---\n" +
               cliente + "\n" +
               itensCarrinhos;
    }

}