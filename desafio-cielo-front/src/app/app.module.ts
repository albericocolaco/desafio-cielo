import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppMaterialModule } from './app-material/app-material.module';
import { HttpClientModule } from "@angular/common/http";

import { LancamentoComponent } from './component/lancamento/lancamento.component';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';

import { Configuration } from './service/configuration';
import { LancamentoContaService } from './service/lancamento-conta';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LancamentoComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    AppMaterialModule,
    HttpClientModule

  ],
  providers: [
    LancamentoContaService, 
    Configuration
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
