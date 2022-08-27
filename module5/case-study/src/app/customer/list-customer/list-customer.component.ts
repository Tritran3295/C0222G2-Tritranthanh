import {Component, OnInit} from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import {ToastrService} from 'ngx-toastr';
import {CustomerTypeService} from '../../service/customer-type.service';
import {CustomerType} from '../../model/customer-type';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  idModal: number;
  nameModal: string;
  p: number = 1;
  customerList: Customer[] = [];
  searchForm: FormGroup;
  constructor(private customer: CustomerService,
              private toastr: ToastrService,
              private customerTypeService: CustomerTypeService) {

  }

  ngOnInit(): void {
    this.customer.getAll().subscribe(date => {
      this.customerList = date;
    });
    this.searchForm = new FormGroup({
      nameSearch: new FormControl()
    })
  }

  elementDelete(id: number, name: string) {
    this.idModal = id;
    this.nameModal = name;
  }

  deleteCustomer() {
    this.customer.deleteC(this.idModal).subscribe(() => {
      this.toastr.success('Delete success.', 'Delete');
    }, e => {
      console.log(e);
    }, () => {
      this.ngOnInit();
    });
  }

  nameSearch() {
    const name = this.searchForm.value.nameSearch;
    console.log(name);
    this.customer.searchCustomer(name).subscribe(value => {
      console.log(value);
      this.customerList = value;
    });
  }
}

