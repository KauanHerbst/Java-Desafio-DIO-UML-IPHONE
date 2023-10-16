package SmartPhone.Apps;

public class Telefone {
    private int meuNumero;

    


    public Telefone(int meuNumero) {
        this.meuNumero = meuNumero;
    }

    
    public int getMeuNumero() {
        return meuNumero;
    }

    public void mudarMeuNumero(int meuNumero) {
        this.meuNumero = meuNumero;
    }

    public void ligar(int numero){
        System.out.println("Ligando para... " + numero);
    }

    public void atender(){
        System.out.println("Atendendo ligação!!");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }




}
