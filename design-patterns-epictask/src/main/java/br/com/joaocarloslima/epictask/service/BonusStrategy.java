package br.com.joaocarloslima.epictask.service;

import br.com.joaocarloslima.epictask.model.Desafio;

public interface BonusStrategy {
    int calcularBonus(Desafio desafio, int valorBase);
}
