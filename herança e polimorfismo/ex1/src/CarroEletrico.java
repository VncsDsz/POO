public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico(){
        super();
    }

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    //gets e sets
    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover(){
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    @Override
    public void abastecer(){
        System.out.println("Recarregando bateria em posto de carga rápida");
    }

    @Override
    public String toString() {
        return "Carro " + super.toString() + "Autonomia da bateria" + autonomiaBateria + "\'";
    }
}
