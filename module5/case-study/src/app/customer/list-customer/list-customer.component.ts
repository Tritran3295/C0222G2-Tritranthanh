import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  delete = [] ;
  customerList: Customer[] = [];
  constructor(private customer: CustomerService) {
   this.customerList = customer.getAll();
  }
  ngOnInit(): void {
  }

  elementDelete(id: number, name: string) {
    this.delete.push(id);
    this.delete.push(name);
    return this.delete;
  }

  deleteC(id) {
    this.customer.delete(id);
  }
}
