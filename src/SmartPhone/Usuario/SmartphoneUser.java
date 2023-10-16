package SmartPhone.Usuario;

import SmartPhone.Apps.*;

public class SmartphoneUser {

    public static void main(String[] args) {
        NavegadorDeInternet navegadorDeInternet = new NavegadorDeInternet();
        ReprodutorDeMusica reprodutorDeMusica = new ReprodutorDeMusica();
        Telefone telefone = new Telefone(77777);


        navegadorDeInternet.adicionarNovaAba("www.google.com");
        navegadorDeInternet.atualizarPagina();

        reprodutorDeMusica.selecionarMusica("Love Me Again - John Newman");
        reprodutorDeMusica.volumeUp();
        reprodutorDeMusica.volumeUp();
        reprodutorDeMusica.pausar();


        telefone.ligar(123456);
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

    }

}
