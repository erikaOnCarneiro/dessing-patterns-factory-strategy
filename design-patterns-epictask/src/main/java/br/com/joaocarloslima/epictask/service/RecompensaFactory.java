package br.com.joaocarloslima.epictask.service;

import br.com.joaocarloslima.epictask.model.TipoDesafio;

public class RecompensaFactory {

    public static RecompensaServiceFactory criarRecompensa(TipoDesafio tipo) {
        return switch (tipo) {
            case ESTUDO -> new RecompensaEstudo();
            case EXERCICIO -> new RecompensaExercicio();
            case MEDITACAO -> new RecompensaMeditacao();
            case SOCIAL -> new RecompensaSocial();
            case ARTES -> new RecompensaArtes();
            case FINANCEIRO -> new RecompensaFinanceiro();
        };
    }
}




