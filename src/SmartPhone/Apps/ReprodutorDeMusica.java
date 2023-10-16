package SmartPhone.Apps;

public class ReprodutorDeMusica {
    private String musica;
    private int volume;

    
    public ReprodutorDeMusica() {
        this.volume = 25;
    }

    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada: " + musica);
    }

    public void tocarMusica(String musica){
        System.out.println("Tocando musica... " + musica);
    }

    public void pausar(){
        System.out.println("Pausando musica...");
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

}
