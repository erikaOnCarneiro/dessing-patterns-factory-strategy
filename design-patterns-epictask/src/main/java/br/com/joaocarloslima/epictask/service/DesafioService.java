

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joaocarloslima.epictask.model.Desafio;
import br.com.joaocarloslima.epictask.model.Recompensa;
import br.com.joaocarloslima.epictask.repository.DesafioRepository;
import br.com.joaocarloslima.epictask.repository.RecompensaRepository;
import br.com.joaocarloslima.epictask.service.BonusCalculator;
import br.com.joaocarloslima.epictask.service.RecompensaFactory;
import br.com.joaocarloslima.epictask.service.RecompensaServiceFactory;

@Service
public class DesafioService {

    @Autowired
    private DesafioRepository desafioRepository;

    @Autowired
    private RecompensaRepository recompensaRepository;

    @Autowired
    private RecompensaFactory recompensaFactory;

    @Autowired
    private BonusCalculator bonusCalculator;

    public List<Desafio> todos() {
        return desafioRepository.findAll();
    }

    public Recompensa concluirDesafio(Long id) {
        Desafio desafio = desafioRepository.findById(id).orElseThrow();

        // 1. Criar recompensa base via factory
        RecompensaServiceFactory baseRecompensa = RecompensaFactory.criarRecompensa(desafio.getTipo());

        // 2. Calcular valor final com estratégias de bônus
        int valorFinal = bonusCalculator.calcular(desafio, baseRecompensa.getValor());

        // 3. Remover o desafio concluído
        desafioRepository.delete(desafio);

        // 4. Criar nova recompensa com valor final
        Recompensa recompensa = new Recompensa(null, baseRecompensa.getDescricao(), valorFinal);
        recompensaRepository.save(recompensa);
        return recompensa;
    }

    public void adicionarDesafio(Desafio desafio) {
        desafio.setId(null);
        desafioRepository.save(desafio);
    }

    public List<Recompensa> getInventario() {
        return recompensaRepository.findAll();
    }
}
