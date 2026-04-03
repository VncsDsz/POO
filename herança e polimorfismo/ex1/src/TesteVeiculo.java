public class TesteVeiculo {
    public static void main(String[] args) throws Exception {
        Aviao av = new Aviao(1000, "Airbus", "A320", 945);
        av.mover();
        System.out.println(av.toString());

        CarroEletrico ce = new CarroEletrico("BYD","Song Plus", 120, 68 );
        ce.mover();
        System.out.println(ce.toString());
    }
}
