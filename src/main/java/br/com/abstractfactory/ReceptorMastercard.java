package br.com.abstractfactory;

public class ReceptorMastercard implements Receptor{

    public String recebe() {
        System.out.println("Recebendo mensagem da Mastercard");
        String mensagem ="Mensagem da Mastercard";
        return mensagem;
    }
}
