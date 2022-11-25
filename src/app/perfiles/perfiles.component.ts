import { Component, OnInit } from '@angular/core';
import { Perfil } from '../perfil';
import { PerfilService } from '../perfil.service';

@Component({
  selector: 'app-perfiles',
  templateUrl: './perfiles.component.html',
  styleUrls: ['./perfiles.component.css']
})
export class PerfilesComponent implements OnInit {

  perfiles:Perfil[];

  constructor(private PerfilServices:PerfilService) { }

  ngOnInit(): void {
    this.obtenerListaPerfil();
  }

  private obtenerListaPerfil(){
    this.PerfilServices.obtenerListaPerfiles().subscribe(dato => {
      this.perfiles=dato;
    })
  }

}
