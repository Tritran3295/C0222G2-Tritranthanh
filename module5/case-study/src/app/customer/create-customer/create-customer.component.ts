import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {Router} from '@angular/router';
import {CustomerTypeService} from '../../service/customer-type.service';
import {ToastrModule, ToastrService} from 'ngx-toastr';

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
              private customerType: CustomerTypeService,
              private toastr: ToastrService
  ) {
    this.customerType.getAll().subscribe(data => {
      this.customerTypeList = data;
    });
  }

  ngOnInit(): void {
    this.customerForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl('', [Validators.required, Validators.pattern('^([A-Z][^A-Z0-9\\\\s]+)(\\\\s[A-Z][^A-Z0-9\\\\s]+)*$')]),
      dateOfBirth: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required, Validators.pattern('[0-9]{9,11}')]),
      phoneNumber: new FormControl('', [Validators.required, Validators.pattern(/^([\+84]|[\+091]|[\+090])[0-9]{9,11}$/)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      address: new FormControl('', [Validators.required]),
      customerType: new FormControl(1)
    });
  }

  createCustomer() {
    const customer = this.customerForm.value;
    console.log(customer);
    this.customer.saveCustomer(customer).subscribe();
    this.router.navigateByUrl('/list/customer');
    this.toastr.success('Create success', 'tittle', {
      timeOut: 1500, progressBar: false
    });

  }
}

