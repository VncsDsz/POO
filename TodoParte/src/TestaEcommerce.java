import java.util.Date;

public class TestaEcommerce{
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("123", "Fulano", "Rua Chile");
        CarrinhoCompra cc1 = new CarrinhoCompra(1, new Date(), cli1);

        Produto prod1 = new Produto(10, "Mémoria RAM", "16GB",900);
        cc1.adicionaItemCarrinho(10, 5, prod1);
        System.out.println(cc1.toString());

        cc1.calculaTotal();

        Produto prod2 = new Produto(10, "Cooler", "Air",300);
        
        
      
    }
}

