package br.com.joaocarloslima.epictask.service;

public class RecompensaEstudo implements RecompensaServiceFactory {

    @Override
    public String getDescricao() {
        return "XP de conhecimento";
    }

    @Override
    public int getValor() {
        return 100;
    }


}
