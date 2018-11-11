package arcls.com.br.desafiocielo.controller;

import arcls.com.br.desafiocielo.dto.LancamentoContaLegadoDTO;
import arcls.com.br.desafiocielo.exception.CieloException;
import arcls.com.br.desafiocielo.response.Response;
import arcls.com.br.desafiocielo.service.LancamentoContaService;
import arcls.com.br.desafiocielo.util.ConstantMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lancamento/conta")
@CrossOrigin(origins = "*")
public class LancamentoContaController {

    /**
     * Logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(LancamentoContaController.class);

    /**
     * Business of LancamentoContaController.
     */
    @Autowired
    private LancamentoContaService lancamentoContaService;

    /**
     * API to find all LancamentoConta.
     * @return ResponseEntity<Response<LancamentoContaLegadoDTO>>
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response<LancamentoContaLegadoDTO>> getLancamentoConta(){
        Response<LancamentoContaLegadoDTO> response = new Response<LancamentoContaLegadoDTO>();
        try {
            final LancamentoContaLegadoDTO lancamentoConta = this.lancamentoContaService.getLancamentoConta();
            response.setData(lancamentoConta);
            return ResponseEntity.ok(response);
        } catch (CieloException e) {
            logger.error(String.format(ConstantMessage.ERROR_EXECUTAR_SERVICO, "getLancamentoConta"));
            response.setMessage(e.getMessage());
            return ResponseEntity.status(e.getCieloException().getCode()).body(response);
        }
    }

}
