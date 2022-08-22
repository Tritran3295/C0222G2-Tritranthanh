import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {Customer} from '../../model/customer';
import {ParamMap, Route, Router} from '@angular/router';
import {CustomerService} from '../../service/customer.service';
import {CustomerTypeService} from '../../service/customer-type.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  customer: Customer;
  customerForm: FormGroup;
  customerTypeList: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private customerTypeService: CustomerTypeService) {}
  ngOnInit(): void {
    this.customerTypeList = this.customerTypeService.customerTypeList;
    this.customerForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl('', [Validators.required, Validators.pattern('^([A-Z][^A-Z0-9\\\\s]+)(\\\\s[A-Z][^A-Z0-9\\\\s]+)*$')]),
      dateOfBirth: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required,Validators.pattern('[0-9]{9,11}')]),
      phoneNumber: new FormControl('', [Validators.required, Validators.pattern(/^([\+84]|[\+091]|[\+090])[0-9]{9,11}$/)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      address: new FormControl('', [Validators.required]),
      customerType: new FormControl(1)
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
    const id = +paramMap.get('id');
    this.customer = this.customerService.findById(id);
    this.customerForm.patchValue(this.customer);
    this.customerForm.patchValue({customerType: this.customer.customerType.id});
  });
  }
  editCustomer() {
    const customer = this.customerForm.value;
    this.customerService.update(customer);
    this.router.navigateByUrl('/list/customer');
  }
}
