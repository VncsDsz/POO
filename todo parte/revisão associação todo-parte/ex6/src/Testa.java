public class Testa {
    public static void main(String[] args) {
        Edificio e = new Edificio("Residencial Solaris", "Rua Óctavio Santiago, 123");

        e.construirApartamento(101, 1);
        e.construirApartamento(102, 1);
        e.construirApartamento(201, 2);

        System.out.println(e);
    }
}
