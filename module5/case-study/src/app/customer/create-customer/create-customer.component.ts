import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {Router} from '@angular/router';
import {CustomerTypeService} from '../../service/customer-type.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  customerForm: FormGroup;
  customerTypeList: CustomerType[] = [];
  constructor(private customer: CustomerService,
              private router: Router,
              private customerType: CustomerTypeService) {
  }

  ngOnInit(): void {
    this.customerTypeList = this.customerType.customerTypeList;
    this.customerForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      dateOfBirth: new FormControl(),
      gender: new FormControl(),
      idCard: new FormControl(),
      phoneNumber: new FormControl(),
      email: new FormControl(),
      address: new FormControl(),
      customerType: new FormControl(1)
    });
  }

  createCustomer() {
    const customer = this.customerForm.value;
    console.log(customer);
    this.customer.save(customer);
    this.router.navigateByUrl('/list/customer');
  }
}
