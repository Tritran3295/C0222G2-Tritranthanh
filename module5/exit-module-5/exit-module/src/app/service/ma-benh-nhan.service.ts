import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {MaBenhNhan} from '../model/ma-benh-nhan';

@Injectable({
  providedIn: 'root'
})
export class MaBenhNhanService {
  private URL_CODE_PA = 'http://localhost:8080/code_patient';
  constructor(private http: HttpClient) { }
  getAll(): Observable<MaBenhNhan[]> {
    return this.http.get<MaBenhNhan[]>(this.URL_MA_BENH_NHAN);
  }
}
