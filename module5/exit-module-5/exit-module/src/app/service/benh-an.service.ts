import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {MaBenhAnService} from './ma-benh-an.service';
import {MaBenhNhanService} from './ma-benh-nhan.service';
import {Observable} from 'rxjs';
import {BenhAn} from '../model/benh-an';

@Injectable({
  providedIn: 'root'
})
export class BenhAnService {
  // private URL_BENH_AN = 'http://localhost:3000/benhAn';
  private URL_CONNECT = 'http://localhost:8080';

  constructor(private http: HttpClient,
              private codeMedicalRecord: MaBenhAnService,
              private codePatient: MaBenhNhanService) {
  }

  getAll(): Observable<BenhAn[]> {
    return this.http.get<BenhAn[]>(this.URL_CONNECT + '/benh-an');
  }

  findById(id: number): Observable<BenhAn> {
    return this.http.get<BenhAn>(this.URL_CONNECT +  '/findId/' + id);
  }

  editCustomer(id: number, benhAn): Observable<BenhAn> {
    return this.http.patch<BenhAn>(this.URL_CONNECT + '/update/' + benhAn.id , benhAn);
  }

  deleteBenhAn(id: number): Observable<BenhAn> {
    return this.http.delete<BenhAn>(this.URL_CONNECT + '/delete/' + id);
  }

  saveBenhAn(benhAn: BenhAn): Observable<BenhAn> {
    return this.http.post<BenhAn>(this.URL_CONNECT + '/create', benhAn);
  }

  searchByName(name): Observable<BenhAn[]> {
    return this.http.get<BenhAn[]>(this.URL_CONNECT + '?tenBenhNhan_like=' + name);
  }
}
