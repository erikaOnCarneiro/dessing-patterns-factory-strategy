package br.com.joaocarloslima.epictask.service;

import java.util.List;

import br.com.joaocarloslima.epictask.model.Desafio;

public class BonusCalculator {

    private List<BonusStrategy> estrategiaList;

    public BonusCalculator(List<BonusStrategy> estrategiaList) {
        this.estrategiaList = estrategiaList;
    }
 
    public int calcular(Desafio desafio, int valorBase){
        int valorFinal = valorBase;
        for (BonusStrategy estrategia : estrategiaList) {
            valorFinal = estrategia.calcularBonus(desafio, valorFinal);
            
        }
        return valorFinal;
    }
}