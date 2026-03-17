public class TestePlacar {
    public static void main(String args[]){
        Placar obj1 = new Placar("Bulls", "Celtics");
        System.out.println(obj1.toString());
        obj1.registraPonto("casa", 1);
        System.out.println(obj1.toString());

    }
}
