package br.com.joaocarloslima.epictask.service;

import java.time.DayOfWeek;
import java.time.LocalDate;

import br.com.joaocarloslima.epictask.model.Desafio;

public class FimDeSemana implements BonusStrategy {
    @Override
    public int calcularBonus(Desafio desafio, int valorBase) {
        DayOfWeek dia = LocalDate.now().getDayOfWeek();
        if (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY) {
            return valorBase * 2;
        }
        return valorBase;
    }
}
