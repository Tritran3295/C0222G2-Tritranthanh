import {Injectable} from '@angular/core';
import {FacilityType} from '../model/facility-type';
import {Observable, of} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FacilityTypeService {
  private URL_FACILITY_TYPE = 'http://localhost:3000/facilityType';

  constructor(private http: HttpClient) {
  }
  getAllFacilityType(): Observable<FacilityType[]> {
    return this.http.get<FacilityType[]>(this.URL_FACILITY_TYPE)
  }
}
