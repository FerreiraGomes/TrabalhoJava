package br.com.abstractfactory;

public class MastercardComunicadorFactory implements ComunicadorFactory {

    private EmissorCreator emissorCreator = new EmissorCreator();
    private  ReceptorCreator receptorCreator = new ReceptorCreator();

    public Emissor createEmissor() {
        return emissorCreator.create(EmissorCreator.MASTERCARD);
    }

    @Override
    public Receptor createReceptor() {
        return null;
    }

    public Receptor CreateReceptor() {
        return receptorCreator.create(ReceptorCreator.MASTERCARD);
    }
}
