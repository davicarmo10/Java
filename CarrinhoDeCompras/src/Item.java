public class Item <Item> {
    private String nome;
    private int quantidade;
    private Double preco;

    public Item(String nome, int quantidade, Double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

    
}
