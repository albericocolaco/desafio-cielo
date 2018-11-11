package arcls.com.br.desafiocielo.external.service.impl;

import arcls.com.br.desafiocielo.dto.LancamentoContaLegadoDTO;
import arcls.com.br.desafiocielo.exception.CieloException;
import arcls.com.br.desafiocielo.enums.CieloExceptionEnum;
import arcls.com.br.desafiocielo.external.service.LancamentoContaLegadoService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;

@Service
public class LancamentoContaLegadoServiceImpl implements LancamentoContaLegadoService {

    /**
     * Logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(LancamentoContaLegadoServiceImpl.class);

    /**
     * Template.
     */
    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * URL file Json.
     */
    @Value("${service.lancamento.conta.legado}")
    private String URL_EMPLOYEES_JSON;

    @Override
    public LancamentoContaLegadoDTO getLancamentoConta() throws CieloException{
        try {
            final TypeReference<LancamentoContaLegadoDTO> mapType = new TypeReference<LancamentoContaLegadoDTO>(){};
            final ObjectMapper mapper = new ObjectMapper();
            final InputStream inputStream = TypeReference.class.getResourceAsStream(URL_EMPLOYEES_JSON);
            return mapper.readValue(inputStream, mapType);
        }catch (IOException ex) {
            logger.error(CieloExceptionEnum.ERROR_EXTERNAL_SERVICE.getMessage(), ex);
            throw new CieloException(CieloExceptionEnum.ERROR_EXTERNAL_SERVICE, ex);
        }
    }

}
