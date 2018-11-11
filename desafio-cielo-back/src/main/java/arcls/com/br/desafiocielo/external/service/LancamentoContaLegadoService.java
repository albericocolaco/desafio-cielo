package arcls.com.br.desafiocielo.external.service;

import arcls.com.br.desafiocielo.dto.LancamentoContaLegadoDTO;
import arcls.com.br.desafiocielo.exception.CieloException;

public interface LancamentoContaLegadoService {

    /**
     * Call service LancamentoContaLegado.
     * @return LancamentoContaLegadoDTO
     * @throws CieloException
     */
    public LancamentoContaLegadoDTO getLancamentoConta() throws CieloException;
}
