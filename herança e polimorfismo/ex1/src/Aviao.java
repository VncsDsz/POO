public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(){
        super();//super de superclasse
    }

    public Aviao(float altitudeMax, String marca, String modelo, float velocidade) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    //gets e sets
    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover(){
        System.out.println("Avião voando a " + super.velocidade + "km/h e " + this.altitudeMax + " metros de altitude\'");
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }  

    @Override
    public String toString() {
        return "Avião " + super.toString() + "Altitude máxima" + altitudeMax + "m \'";
    }
}
