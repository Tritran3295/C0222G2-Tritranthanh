import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
    delete = [] ;
    customerList: Customer[] = [];
  constructor() {
    this.customerList.push({
      id: 1,
      name: 'Tai Smile',
      dateOfBirth: '19/09/1998',
      gender: 1,
      idCard: '197327790',
      phoneNumber: '0903047548',
      email: 'taismile9x@gmail.com',
      address: 'Biên Hoà',
      customerType: {id: 1, nameCustomerType: 'Nhân viên quèn'}
    });
  }
  ngOnInit(): void {
  }

  elementDelete(id: number, name: string) {
    this.delete.push(id);
    this.delete.push(name);
    return this.delete;
  }

  deleteC(id) {
    console.log(id);
  }
}
