public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.emVoo = emVoo;
    }

    //sets
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAltura(float altura) {
        if(altura >= 0 && altura <=120){
            this.altura = altura;
        }
        else System.out.println("Seleko, dá não");
    }

    public void setBateria(int bateria) {
        if(bateria >= 0 && altura <=100){
            this.bateria = bateria;
        }
        else System.out.println("Valor de bateria inválido");
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }


    //gets
    public String getCodigo() {
        return codigo;
    }

    public float getAltura() {
        return altura;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 8){
            System.out.println("Motores prontos");
            return true;
        }
        else{
            System.out.println("Falha mecânica");
            return false;
        }
    }

    public void decolar(){
        if (bateria > 20) {
            if(testarMotores()){
                emVoo = true;
                altura = 2;
                System.out.println("Drone decolou com sucesso!");
            } else {
                System.out.println("Decolagem cancelada.");
            }
        }
        else{
            System.out.println("Bateria insuficiente para decolagem.");
        }
    }

    public void subir(float x){
        if (emVoo) {
            setAltura(getAltura() + x);
        } else {
            System.out.println("O drone precisa estar em voo para subir");
        }

    }

    public void descer(float x){
        if (emVoo) {
            setAltura(getAltura() - x);
        } else {
            System.out.println("O drone precisa estar em voo para descer");
        }
    }
    @Override
    public String toString() {
        return "Drone [codigo=" + codigo + ", altura=" + altura + ", bateria=" + bateria + ", emVoo=" + emVoo + "]";
    }
 
}

