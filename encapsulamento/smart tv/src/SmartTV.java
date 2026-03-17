public class SmartTV {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTV(){

    }

    public SmartTV(String marca, String modelo, int volume, boolean internet){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);  
        this.internet = internet;
    }

    // método set para acessar variavel privada - atribuir valor 
    public void setVolume(int volume){
        if(volume >= 0 && volume <=100){
            this.volume = volume;
        }
        else System.out.println("volume inválido");
    }

    // método get para recuperar valor, não é void - retornar valor
    public int getVolume(){
        return this.volume;
    }

    // set marca
    public void setMarca(String marca){
        //método length é de instância 
        if(marca.length() <= 30){
            this.marca = marca;
        }
        else System.out.println("Marca inválido");
    }

    // get marca
    public String getMarca(){
        return this.marca;
    }

    // set modelo
    public void setModelo(String modelo){
        //método charAt é de instância
        char letraInicial = modelo.charAt(8);
        // método isUpperCase é classe
        boolean resp = Character.isUpperCase(letraInicial);
        if(resp){
            this.modelo = modelo;
        }
        else System.out.println("Modelo inválido");
    }

    // set modelo
    public String setModelo(){
        return this.modelo;
    }

    public void aumentaVolume(int x){
        this.setVolume(this.volume + x);
    }

    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }

    public void abrirYoutube(){
        //conectar na internet
        if (this.conectaInternet()) {
            System.out.println("Youtube abrindo ");
        }
        else{
            System.out.println("Sem internet");
        }
    }
    //não vamos expor esse método, não quero torná-lo vísivel em outra classe
    private boolean conectaInternet(){
        System.out.println("Verificando conexões diponíveis");
        System.out.println("Consultando as credenciais");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 5){
            System.out.println("IP gerado com sucesso");
            return true;
        }
        else{
            System.out.println("Falha na conexão");
            return false;
        }
    }
}
