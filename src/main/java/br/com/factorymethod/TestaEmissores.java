package br.com.factorymethod;

public class TestaEmissores {

    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();

        Emissor emissor1 = new EmissorSMS();
        emissor1.envia("K19 Treinamentos");

        Emissor emissor2 = new EmissorEmail();
        emissor2.envia("K19 Treinamentos");

        Emissor emissor3 = new EmissorJMS();
        emissor3.envia("K19 Treinamentos");
    }
}
