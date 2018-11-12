import { DadosDomicilioBancario } from "./dados-domicilio-bancario";

export interface LancamentoContaCorrenteCliente{
    numeroRemessaBanco: number;
    dadosAnaliticoLancamentoFinanceiroCliente: any[];
    nomeSituacaoRemessa: string;
    dadosDomicilioBancario: DadosDomicilioBancario;
    nomeTipoOperacao: string;
}