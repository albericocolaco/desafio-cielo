package arcls.com.br.desafiocielo.dto;

import java.io.Serializable;
import java.util.List;

public class LancamentoContaLegadoDTO implements Serializable {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    private TotalControleLancamentoDTO totalControleLancamento;
    private List<ControleLancamentoDTO> listaControleLancamento;
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;

    public TotalControleLancamentoDTO getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamentoDTO totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ControleLancamentoDTO> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ControleLancamentoDTO> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }
}
