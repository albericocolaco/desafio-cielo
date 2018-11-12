import { Component, OnInit } from '@angular/core';
import { LancamentoContaService } from 'src/app/service/lancamento-conta';
import { LancamentoConta } from 'src/app/models/lancamento-conta';

@Component({
  selector: 'app-lancamento',
  templateUrl: './lancamento.component.html',
  styleUrls: ['./lancamento.component.scss']
})
export class LancamentoComponent implements OnInit {
  
  public displayedColumns: string[] = ['data_lancamento', 'descricao', 'numero', 'situacao', 'data_confirmacao', 'dados_bancarios', 'valor_final'];
  public dataSource: LancamentoConta[];

  constructor(private lancamentoContaService: LancamentoContaService) { 
    this.dataSource = [];
  }

  private getLancamento(){
    this.lancamentoContaService.getLancamentoConta().subscribe((result) => {
      this.dataSource = result.data.listaControleLancamento;
    }, (err) => {
      console.log(err);
    });
  }

  ngOnInit() {
    this.getLancamento();
  }

}
