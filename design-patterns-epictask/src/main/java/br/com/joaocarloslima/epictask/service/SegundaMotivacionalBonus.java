package br.com.joaocarloslima.epictask.service;

import java.time.DayOfWeek;
import java.time.LocalDate;

import br.com.joaocarloslima.epictask.model.Desafio;

public class SegundaMotivacionalBonus implements BonusStrategy {

    @Override
    public int calcularBonus(Desafio desafio, int valorBase) {
       if (LocalDate.now().getDayOfWeek() == DayOfWeek.MONDAY) {
            return (int) (valorBase * 1.5);
        }
        return valorBase;
    }
    
}
