package arcls.com.br.desafiocielo.dto;

import java.io.Serializable;
import java.util.List;

public class LancamentoContaCorrenteClienteDTO implements Serializable {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    private Long numeroRemessaBanco;
    private List<Object> dadosAnaliticoLancamentoFinanceiroCliente;
    private String nomeSituacaoRemessa;
    private DadosDomicilioBancarioDTO dadosDomicilioBancario;
    private String nomeTipoOperacao;

    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public DadosDomicilioBancarioDTO getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DadosDomicilioBancarioDTO dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
        return dadosAnaliticoLancamentoFinanceiroCliente;
    }

    public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
        this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
    }
}
