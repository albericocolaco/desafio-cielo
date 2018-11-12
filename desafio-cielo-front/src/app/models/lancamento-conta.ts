import { TotalControleLancamento } from "./total-controle-lancamento";

export interface LancamentoConta {
    totalControleLancamento: TotalControleLancamento;
    listaControleLancamento: number[];
    indice: number;
    tamanhoPagina: number;
    totalElements: number;
  }