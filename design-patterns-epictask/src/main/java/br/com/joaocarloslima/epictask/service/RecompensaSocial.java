package br.com.joaocarloslima.epictask.service;

public class RecompensaSocial implements RecompensaServiceFactory {

    @Override
    public String getDescricao() {
        return "Pontos de Amizade";
    }

    @Override
    public int getValor() {
       return 80;
    }
    
}
