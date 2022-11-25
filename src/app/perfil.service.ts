import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Perfil } from './perfil';
import {Observable} from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class PerfilService {
  private Baseurl="http://localhost:8090/api/v1/Perfiles";
  constructor(private httpClient:HttpClient ) { }

  obtenerListaPerfiles():Observable<Perfil[]>{
    return this.httpClient.get<Perfil[]>(`${this.Baseurl}`)
  }

}
