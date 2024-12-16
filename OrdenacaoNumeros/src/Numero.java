public class Numero implements Comparable<Numero> {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo (Numero n)
    {
        return Integer.compare(numero, n.getNumero());
    }

    @Override
    public String toString() {
        return "numero=" + numero + "\n";
    }

    
}
