
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

    public double calcularValorTotal ()
    {
        List<Item> valorTotal = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty())
        {
            for (Item i: carrinhoDeCompras)
            {
                double valorItem = i.getPreco() * i;
                .getQuantidade();
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }
}


