import {Injectable} from '@angular/core';
import {RentType} from '../model/rent-type';
import {Observable, of} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {CustomerType} from '../model/customer-type';

@Injectable({
  providedIn: 'root'
})
export class RentTypeService {
  private URL_RENT_TYPE = 'http://localhost:3000/rentType';

  constructor(private http: HttpClient) {
  }
  getAllRentType(): Observable<RentType[]> {
    return this.http.get<RentType[]>(this.URL_RENT_TYPE)
  }

}
