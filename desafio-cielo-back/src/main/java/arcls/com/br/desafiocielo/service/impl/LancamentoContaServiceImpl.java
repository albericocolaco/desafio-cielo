package arcls.com.br.desafiocielo.service.impl;

import arcls.com.br.desafiocielo.dto.LancamentoContaLegadoDTO;
import arcls.com.br.desafiocielo.exception.CieloException;
import arcls.com.br.desafiocielo.external.service.LancamentoContaLegadoService;
import arcls.com.br.desafiocielo.service.LancamentoContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoContaServiceImpl implements LancamentoContaService {

    @Autowired
    private LancamentoContaLegadoService lancamentoContaLegadoService;

    @Override
    public LancamentoContaLegadoDTO getLancamentoConta() throws CieloException {
        return this.lancamentoContaLegadoService.getLancamentoConta();
    }
}
