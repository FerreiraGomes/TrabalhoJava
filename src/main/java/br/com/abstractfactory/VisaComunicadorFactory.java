package br.com.abstractfactory;

public class VisaComunicadorFactory implements ComunicadorFactory {

    private EmissorCreator emissorCreator = new EmissorCreator();
    private  ReceptorCreator receptorCreator = new ReceptorCreator();

    public Emissor createEmissor() {
        return emissorCreator.create(EmissorCreator.VISA);
    }

    @Override
    public Receptor createReceptor() {
        return null;
    }

    public Receptor CreateReceptor() {
        return receptorCreator.create(ReceptorCreator.VISA);
    }
}
