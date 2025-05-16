package br.com.joaocarloslima.epictask.service;

public class RecompensaMeditacao implements RecompensaServiceFactory{

    @Override
    public String getDescricao() {
        return "Cristal da vitalidade";
    }

    @Override
    public int getValor() {
       return 120;
    }
    
}
 