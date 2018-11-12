import { LancamentoContaCorrenteCliente } from "./lancamento-conta-corrente-cliente";

export interface ControleLancamento {
    lancamentoContaCorrenteCliente: LancamentoContaCorrenteCliente;
    dataEfetivaLancamento: string;
    dataLancamentoContaCorrenteCliente: string;
    numeroEvento: number;
    descricaoGrupoPagamento: string;
    codigoIdentificadorUnico: string;
    nomeBanco: string;
}