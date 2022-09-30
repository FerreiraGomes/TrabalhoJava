package br.com.factorymethod;

public class EmissorEmail implements Emissor{

    @Override
    public void envia(String mensagem) {
        System.out.println("enviando por Email a mensagem: ");
        System.out.println(mensagem);
    }
}
