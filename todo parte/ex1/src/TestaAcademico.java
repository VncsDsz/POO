public class TestaAcademico {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Vinicius", "ADS", 1, 109);
        Aluno a2 = new Aluno("Barbara", "DSM", 2, 110);

        Disciplina d1 = new Disciplina(1, "Programação Orientada a Objetos", "Daniel");

        d1.matricularAluno(a1);

        d1.criarAvaliacao(101, "Prova Semestral");

        
    }
}
