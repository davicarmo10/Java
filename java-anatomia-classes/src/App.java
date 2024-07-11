public class App {
    public App() {
    }
 
    public static void main(String[] var0) {
       System.out.println("Hello, World!");
       String var1 = "davi";
       System.out.println(var1);
       String var2 = "Davi";
       String var3 = "Alberto";
       System.out.println(nomeCompleto(var2, var3));
    }
 
    public static String nomeCompleto(String var0, String var1) {
       return "resultado do metodo: " + var0.concat(" ").concat(var1);
    }
 }
 