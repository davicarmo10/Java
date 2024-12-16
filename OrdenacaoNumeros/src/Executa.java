
import java.util.Random;

public class Executa {
    public static void main(String[] args) {
        Random rand = new Random();
        OrdenacaoNumeros OrdenacaoNumeros = new OrdenacaoNumeros();

        for (int i=0; i<= 100;i++)
        {
            OrdenacaoNumeros.adicionarNumeros(rand.nextInt(100));
        }
        
        System.out.println(OrdenacaoNumeros.ordenarOrdemDecrescente());
    }
}
