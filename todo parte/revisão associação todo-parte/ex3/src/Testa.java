public class Testa {
    public static void main(String[] args) {

        Atleta a1 = new Atleta(1, "Michael", "Ala");

        Time t = new Time(1, "Franca Basquete", "Helinho");

        t.contratarAtleta(a1);

        System.out.println("Antes de apagar o time:");
        System.out.println(t);

        t = null;

        System.out.println("\nDepois de apagar o time:");

        System.out.println(a1);
    }
}
