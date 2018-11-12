import { Injectable } from '@angular/core';
import { ResponseModel } from './../models/response';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Configuration } from './configuration';
import { map, catchError } from 'rxjs/operators';

@Injectable()
export class LancamentoContaService{

    private actionUrl: string;

    constructor(private http: HttpClient, private configuration: Configuration) {
        this.actionUrl = this.configuration.serverWithApiUrl + 'lancamento/conta';
    }

    public getLancamentoConta(): Observable<any> {
        return this.http.get<ResponseModel>(this.actionUrl).pipe(
            map(res => {
                return res as ResponseModel;
            }, catchError(this.handleError<any>('getLancamentoConta'))
        ));
    }

    private handleError<T> (operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
          console.error(error); // log to console instead
          console.log(`${operation} failed: ${error.message}`);
          return of(result as T);
        };
      }

}