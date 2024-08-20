import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private ArrayList<Numero> numerosInteiros = new ArrayList<>();

    public OrdenacaoNumeros() {
        this.numerosInteiros = new ArrayList();
    }

    public void adicionarNumeros (int numero)
    {
        numerosInteiros.add(new Numero(numero));
    }

    public List<Numero> ordenarOrdemCrescente ()
    {
        List<Numero> ordenarOrdemCrescente = new ArrayList<>(numerosInteiros);
        Collections.sort(ordenarOrdemCrescente);
        return ordenarOrdemCrescente;
    }

    public List<Numero> ordenarOrdemDecrescente ()
    {
        List<Numero> ordenarOrdemDecrescente = new ArrayList<>(numerosInteiros);
        Collections.sort(ordenarOrdemDecrescente.reversed());
        return ordenarOrdemDecrescente;
    }
}
