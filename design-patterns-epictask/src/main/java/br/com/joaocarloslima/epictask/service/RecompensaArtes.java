package br.com.joaocarloslima.epictask.service;

public class RecompensaArtes implements  RecompensaServiceFactory {

    @Override
    public String getDescricao() {
       return "Pontos de Criatividade";
    }

    @Override
    public int getValor() {
       return 90;
    }
    
}
