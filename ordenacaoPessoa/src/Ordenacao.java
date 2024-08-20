
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    List<Pessoa> listaPessoa = new ArrayList<>();

    public Ordenacao() {
        this.listaPessoa = listaPessoa;
    }

    public void adicionarPessoa(String nome, int idade, double altura)
    {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade ()
    {
        List<Pessoa> ordenarPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(ordenarPorIdade);
        return ordenarPorIdade;
    }

    public List<Pessoa> ordenarPorAltura ()
    {
        List<Pessoa> ordenarPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(ordenarPorAltura, new compararPorAltura());
        return ordenarPorAltura;
    }

}

