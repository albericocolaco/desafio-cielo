package arcls.com.br.desafiocielo.service;

import arcls.com.br.desafiocielo.dto.LancamentoContaLegadoDTO;
import arcls.com.br.desafiocielo.exception.CieloException;

public interface LancamentoContaService {

    /**
     * Business to find all LancamentoConta.
     * @return LancamentoContaLegadoDTO
     * @throws CieloException
     */
    public LancamentoContaLegadoDTO getLancamentoConta() throws CieloException;

}
