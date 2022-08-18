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
      nameCustomerType: 'Nhân viên quèn',
    }, {
      id: 2,
      nameCustomerType: 'Kế Toán tính nhầm'
    }, {
      id: 2,
      nameCustomerType: 'Trưởng phòng hay quên'
    });
  }
}
