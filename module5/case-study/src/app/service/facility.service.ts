import {Injectable} from '@angular/core';
import {Facility} from '../model/facility';
import {RentTypeService} from './rent-type.service';
import {FacilityTypeService} from './facility-type.service';
import {Observable, of} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Customer} from '../model/customer';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  private URL_FACILITY = 'http://localhost:3000/facility';
  constructor(private http: HttpClient,
              private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService) {
  }
  getAll(): Observable<Facility[]> {
    return this.http.get<Facility[]>(this.URL_FACILITY)
  }
  saveFacility(facility: Facility): Observable<Customer> {
    return this.http.post<Facility>(this.URL_FACILITY, facility);
  }

  findById(id: number): Observable<Facility> {
    return this.http.get<Facility>(this.URL_FACILITY + '/' + id);
  }

  editFacility(id: number, facility): Observable<Facility> {
    return this.http.patch<Facility>(this.URL_FACILITY + '/' + id, facility);
  }

  deleteFacility(id: number): Observable<Facility> {
    return this.http.delete<Facility>(this.URL_FACILITY + '/' + id);
  }
}
