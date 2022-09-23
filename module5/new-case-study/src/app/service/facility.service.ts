import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Facility} from "../model/facility";

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  private URL_FACILITY = 'http://localhost:3000/facility';

  constructor(private http: HttpClient) {
  }

  getAllFacility(): Observable<Facility[]> {
    return this.http.get<Facility[]>(this.URL_FACILITY)
  }

  findById(id: number): Observable<Facility> {
    return this.http.get<Facility>(this.URL_FACILITY + '/' + id)
  }

  deleteFacility(id: any): Observable<Facility> {
    return this.http.delete<Facility>(this.URL_FACILITY + '/' + id)
  }
}
