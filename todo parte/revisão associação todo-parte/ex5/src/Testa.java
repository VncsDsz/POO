public class Testa {
    public static void main(String[] args) {

        Computador pc = new Computador(1, "Dell", "Intel", "i5-12400", 3.0);

        System.out.println("ANTES:");
        System.out.println(pc);

        pc = null;

        System.out.println("\nDEPOIS:");
        System.out.println("Computador apagado!");
        System.out.println(pc);

    }
}
