package br.com.factorymethod;

public class EmissorJMS implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println("enviando por JMS a mensagem: ");
        System.out.println(mensagem);
    }
}