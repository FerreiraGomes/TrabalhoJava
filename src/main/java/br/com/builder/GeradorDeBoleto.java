package br.com.builder;

import java.util.Calendar;

public class GeradorDeBoleto {

    private final BoletoBuilder boletoBuilder;

    public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
        this.boletoBuilder = boletoBuilder;
    }

    public Boleto geraBoleto() {
        this.boletoBuilder.buildSacado("Marcelo Martins");

        this.boletoBuilder.buildCedente("k19 treinamentos");

        this.boletoBuilder.buildValor(2000);

        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE,30);
        this.boletoBuilder.buildVencimento(vencimento);

        this.boletoBuilder.buildNossoNumero(1234);

        Boleto boleto= boletoBuilder.getBoleto();

        return boleto;
    }
}
