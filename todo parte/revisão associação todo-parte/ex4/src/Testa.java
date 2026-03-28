public class Testa {
        public static void main(String[] args) {

        Programador p1 = new Programador(1, "Ana", "Java");
        Programador p2 = new Programador(2, "Carlos", "Python");
        Programador p3 = new Programador(3, "Lucas", "JavaScript");

        Projeto proj = new Projeto(1, "Sistema Web");

        proj.adicionarProgramador(p1);
        proj.adicionarProgramador(p2);
        proj.adicionarProgramador(p3);

        // método pedido
        proj.listarProgramadores();
    }
}
