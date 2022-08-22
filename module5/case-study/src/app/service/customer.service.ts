import { Injectable } from '@angular/core';
import {Customer} from '../model/customer';
import {CustomerTypeService} from './customer-type.service';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customerList: Customer[] = [];
  constructor(private customerType: CustomerTypeService) {
    this.customerList.push({
      id: 1,
      name: 'Tai Smile',
      dateOfBirth: '19/09/1998',
      gender: 'Nam',
      idCard: '197327790',
      phoneNumber: '0903047548',
      email: 'taismile9x@gmail.com',
      address: 'Biên Hoà',
      customerType: customerType.customerTypeList[0]
    });
    this.customerList.push({
      id: 2,
      name: 'Phúc XO',
      dateOfBirth: '19/09/1995',
      gender: 'Other',
      idCard: '196727790',
      phoneNumber: '0989047548',
      email: 'taismile9x@gmail.com',
      address: 'Nguyễn Lương Bằng',
      customerType: customerType.customerTypeList[1]
    });
  }
  getAll() {
    return this.customerList;
  }
  save(customer) {
    customer.id = this.customerList.length + 1;
    if (customer.customerType === 1) {
      customer.customerType = this.customerType.customerTypeList[0];
    } else if (customer.customerType === 2) {
      customer.customerType = this.customerType.customerTypeList[1];
    }
    this.customerList.push(customer);
  }
   findById(id) {
    for (const item of this.customerList) {
      if (item.id === id) {
        return item;
      }
    }
  }
  update(customer) {
    for (let i = 0; i < this.customerList.length; i++) {
      if (this.customerList[i].id === customer.id) {
        this.customerList[i] = customer;
      }
    }
    console.log(this.customerList);
  }
  delete(id) {
    const index = this.customerList.findIndex(customer => customer.id === id);
    this.customerList.splice(index, 1);
  }
}
