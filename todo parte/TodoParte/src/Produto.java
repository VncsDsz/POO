public class Produto {
    private int id;
    private String nome, descricao;
    private float preco;

    public Produto() {
           
    }

    public Produto(int id, String nome, String descricao, float preco) {
           this.id = id;
           this.nome = nome;
           this.descricao = descricao;
           this.preco = preco;
    }

    //id  
    public int getId() {
        return id;
    }

     public void setId(int id) {
        this.id = id;
    }

    //nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //preço
    public float getPreco() {
        return preco;
    }
   
    public void setPreco(float preco) {
        this.preco = preco;
    }

     @Override
    public String toString() {
        return "Produto:\n" +
               "   ID: " + id + "\n" +
               "   Nome: " + nome + "\n" +
               "   Descrição: " + descricao + "\n" +
               "   Preço: R$ " + preco + "\n";
    }
    
}
