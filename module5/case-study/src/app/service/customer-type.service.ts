import { Injectable } from '@angular/core';
import {CustomerType} from '../model/customer-type';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  private URL_CUSTOMER_TYPE = 'http://localhost:3000/customerType'

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<CustomerType[]> {
    return this.http.get<CustomerType[]>(this.URL_CUSTOMER_TYPE)
  }


}
