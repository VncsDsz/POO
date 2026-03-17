public class TestaDrone {
    public static void main(String[] args) throws Exception {
        Drone d1 = new Drone("DR01", 0, 80, false);
        d1.decolar();
        d1.subir(10);
        d1.descer(3);

        System.out.println(d1);
    }
}
