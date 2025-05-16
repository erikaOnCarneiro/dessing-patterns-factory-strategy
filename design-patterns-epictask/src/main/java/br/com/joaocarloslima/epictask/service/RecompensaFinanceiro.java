package br.com.joaocarloslima.epictask.service;

public class RecompensaFinanceiro implements RecompensaServiceFactory {
    @Override
    public String getDescricao() {
       return "Moedas de Ouro";
    }

    @Override
    public int getValor() {
       return 300;
    }
}
