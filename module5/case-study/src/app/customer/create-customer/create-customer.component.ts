import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {FormGroup} from '@angular/forms';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  createCustomer: FormGroup;

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
  }

  
}
