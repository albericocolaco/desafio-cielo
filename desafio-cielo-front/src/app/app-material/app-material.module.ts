import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatMenuModule } from '@angular/material/menu';
import { MatSelectModule } from '@angular/material/select';
import { MatTabsModule } from '@angular/material/tabs';
import { MatInputModule } from '@angular/material/input';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatChipsModule } from '@angular/material/chips';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatCardModule } from '@angular/material/card';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatDividerModule } from '@angular/material/divider';
import { MatSliderModule } from '@angular/material/';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatRippleModule } from '@angular/material';
import { MatGridListModule } from "@angular/material/grid-list";
import { MatTreeModule } from "@angular/material/tree";
import { MatTableModule } from "@angular/material/table";

import { MatIconRegistry } from "@angular/material/icon";

import { DomSanitizer } from "@angular/platform-browser";



@NgModule({
  imports: [
    CommonModule,
    FormsModule,

    MatButtonModule,
    MatToolbarModule,
    MatSelectModule,
    MatTabsModule,
    MatInputModule,
    MatProgressSpinnerModule,
    MatChipsModule,
    MatCardModule,
    MatSidenavModule,
    MatCheckboxModule,
    MatListModule,
    MatMenuModule,
    MatIconModule,
    MatTooltipModule,
    MatSnackBarModule,
    MatSlideToggleModule,
    MatDividerModule,
    MatGridListModule,
    MatTreeModule,
    MatFormFieldModule,
    MatRippleModule,
    MatTableModule
  ],
  declarations: [],
  exports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,

    MatButtonModule,
    MatMenuModule,
    MatTabsModule,
    MatChipsModule,
    MatInputModule,
    MatProgressSpinnerModule,
    MatCheckboxModule,
    MatCardModule,
    MatSidenavModule,
    MatListModule,
    MatSelectModule,
    MatToolbarModule,
    MatIconModule,
    MatTooltipModule,
    MatSnackBarModule,
    MatSlideToggleModule,
    MatDividerModule,
    MatSliderModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatGridListModule,
    MatTreeModule,
    MatFormFieldModule,
    MatRippleModule,
    MatTableModule
  ]
})
export class AppMaterialModule { 

  private icon: string = 'icon-';
  private path_icon: string = '../assets/icons/icon-';
  private type_icon: string = '.svg';

  constructor(private matIconRegistry: MatIconRegistry,
              private domSanitizer: DomSanitizer){
    this.createIcons();
  }

  private createIcons(){
    
    this.matIconRegistry.addSvgIcon(
      this.icon+"adm", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"adm"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"alterarsenha", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"alterarsenha"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"automacao", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"automacao"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"confirme", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"confirme"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"dispositivos", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"dispositivos"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"editarperfil", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"editarperfil"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"EN", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"EN"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"ES", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"ES"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"home", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"home"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"indicadores", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"indicadores"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"login", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"login"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"lupa", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"lupa"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"menu-close", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"menu-close"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"menu-open", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"menu-open"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"negocios", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"negocios"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"novasenha", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"novasenha"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"perfil", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"perfil"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"redefenirsenha", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"redefenirsenha"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"sair", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"sair"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seguranca", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seguranca"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"senha", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"senha"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"suporte", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"suporte"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"usuario", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"usuario"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"token", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"token"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seta1", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seta1"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seta2", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seta2"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seta3", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seta3"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seta4", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seta4"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"setamenu-down", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"setamenu-down"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"setamenu-up", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"setamenu-up"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"plus-a", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"plus-a"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"sub-a", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"sub-a"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seta-color-close", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seta-color-close"+this.type_icon));
    this.matIconRegistry.addSvgIcon(
      this.icon+"seta-color-open", this.domSanitizer.bypassSecurityTrustResourceUrl(this.path_icon+"seta-color-open"+this.type_icon));
  }

}
