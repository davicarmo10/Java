
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras = new ArrayList<>();

    public CarrinhoDeCompras(List<Item> carrinhoDeCompras) {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void addItem(Item item) {
        carrinhoDeCompras.add(item);
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

    

}


