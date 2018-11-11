package arcls.com.br.desafiocielo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ControleLancamentoDTO implements Serializable {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    private LancamentoContaCorrenteClienteDTO lancamentoContaCorrenteCliente;
    private String dataEfetivaLancamento;
    private String dataLancamentoContaCorrenteCliente;
    private Integer numeroEvento;
    private String descricaoGrupoPagamento;
    private String codigoIdentificadorUnico;
    private String nomeBanco;

    public LancamentoContaCorrenteClienteDTO getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteClienteDTO lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public Integer getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Integer numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public String getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public String getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public String getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public BigDecimal getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public Long getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public Long getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    private Integer quantidadeLancamentoRemessa;
    private String numeroRaizCNPJ;
    private String numeroSufixoCNPJ;
    private BigDecimal valorLancamentoRemessa;
    private Long dateLancamentoContaCorrenteCliente;
    private Long dateEfetivaLancamento;



}
