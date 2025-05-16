package br.com.joaocarloslima.epictask.service;

public class RecompensaExercicio implements RecompensaServiceFactory {

    @Override
    public String getDescricao() {
        return "Moedas Fitness";
    }

    @Override
    public int getValor() {
        return 150;
    }

}
