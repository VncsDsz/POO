import java.util.ArrayList;

public class TestaVetorPolimorfico {
    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + "Bônus " + camaleao.calculaBonus() + "\'");
    }

    public static void main(String[] args){
        Junior jr = new Junior("Fulano", "Beltrano", "Java", 1800);
        exibeDados(jr);

        Pleno pl = new Pleno(8, "Fulano", "Java", 6000);
        exibeDados(pl);

        Senior sr = new Senior(30000, "Ciclano", "Java", 9000);
        exibeDados(sr);

        Desenvolvedor dev = new Desenvolvedor("Vinicius", "Python", 5000);


        //vetor de desenvolvedores
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        //adiciona os desenvolvedores no vetor
        desenvolvedores.add(jr);
        desenvolvedores.add(pl);
        desenvolvedores.add(sr);
        desenvolvedores.add(dev);

        for (Desenvolvedor d : desenvolvedores) {
            d.codar();

            System.out.println("Bônus: " + d.calculaBonus());

            System.out.println(d.toString());

            System.out.println("---------------------------");
        }
    }
}
