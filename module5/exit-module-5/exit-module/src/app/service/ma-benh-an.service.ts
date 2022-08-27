import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {MaBenhAn} from '../model/ma-benh-an';

@Injectable({
  providedIn: 'root'
})
export class MaBenhAnService {
  private URL_CODE_PATIENT = 'http://localhost:8080/code_patient';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<MaBenhAn[]> {
    return this.http.get<MaBenhAn[]>(this.URL_CODE_PATIENT + '/list');
  }
}
