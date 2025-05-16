package br.com.joaocarloslima.epictask.service;

import br.com.joaocarloslima.epictask.model.Desafio;
import br.com.joaocarloslima.epictask.model.TipoDesafio;


public class SaudeBonus implements BonusStrategy {
    @Override
    public int calcularBonus(Desafio desafio, int valorBase) {
        if (desafio.getTipo() == TipoDesafio.EXERCICIO || desafio.getTipo() == TipoDesafio.MEDITACAO) {
            return valorBase + 10;
        }
        return valorBase;
    }
}
