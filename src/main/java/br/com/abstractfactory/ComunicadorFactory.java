package br.com.abstractfactory;

public interface ComunicadorFactory {

    Emissor createEmissor();
    Receptor createReceptor();
}
