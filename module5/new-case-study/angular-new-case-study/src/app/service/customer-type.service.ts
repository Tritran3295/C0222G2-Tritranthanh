import { Injectable } from '@angular/core';
import {CustomerType} from '../model/customer-type';

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  customerTypeList: CustomerType[] = [];
  constructor() {
    this.customerTypeList.push({
      id: 1,
      nameCustomerType: 'Diamond',
    }, {
      id: 2,
      nameCustomerType: 'Gold'
    }, {
      id: 3,
      nameCustomerType: 'Silver'
    });
  }
}
