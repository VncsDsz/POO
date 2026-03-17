public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;
    
    public ArCondicionado(){
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado); 
    }

    public void ativarModoTurbo(){
        if(this.verificarCompressor()){
            System.out.println("Compressor ok, ajustando a temperatura");
            this.temperatura = 16;
        }
        else System.out.println("Falha no compressor");
        
    }

    private boolean verificarCompressor(){
        System.out.println("Verificando compressor");
        int randomico = (int) (Math.random() * 10);
        if (randomico > 2){
            System.out.println("Compressor ok");
            return true;
        }
        else{
            System.out.println("Falha no compressor");
            return false;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setMarca(String marca) {
        if(marca.length() >= 3){
            this.marca = marca;
        }
        else System.out.println("Marca inválida");
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTemperatura(int temperatura) {
        if(temperatura >= 16 && temperatura <=30){
            this.temperatura = temperatura;
        }
        else System.out.println("Temperatura fora da faixa");
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "Ar-Condicionado [marca=" + marca + 
            ", modelo=" + modelo + 
            ", temperatura=" + temperatura + 
            ", ligado=" + ligado + "]";
        }
}
