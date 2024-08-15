
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void addItem(String nome, int quantidade, double preco) {    
        Item novoItem = new Item(nome, quantidade, preco);
        carrinhoDeCompras.add(novoItem);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty()) {
            for (Item i : carrinhoDeCompras) {
                if (i.getNome().equalsIgnoreCase(nome))
                    itemParaRemover.add(i);
            }
        }
    }

    public double calcularValorTotal1 ()
    {
        double valorTotal = 0d;
        if (!carrinhoDeCompras.isEmpty())
        {
            for (Item item: carrinhoDeCompras)
            {
                double valorItem = item.getPreco() * item
                .getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibirItens ()
        {
            if (!carrinhoDeCompras.isEmpty()){
                System.out.println(carrinhoDeCompras);
            }else {
                System.out.println("lista vazia");
            }
        }



        
        @Override
        public String toString() {
          return "CarrinhoDeCompras{" +
              "itens=" + carrinhoDeCompras +
              '}';
        }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.addItem("arroz", 2, 5.80);

        carrinhoDeCompras.exibirItens();
    }

}


