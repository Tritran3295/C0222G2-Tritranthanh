import {Component, OnInit} from '@angular/core';
import {Contract} from '../../model/contract';

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {
  contractList: Contract [] = [];

  constructor() {
    this.contractList.push({
      id: 1,
      startDate: '19/08/2022',
      endDate: '20/08/2022',
      deposit: 'dsadhsad',
      employee: {id: 1, nameEmloyee: 'Tuấn nhân viên quèn'},
      customer: {id: 1, nameCustomer: 'Tuấn Biên Hoà'},
      facility: {id: 1, nameFacility: 'Dọn rác'}
    });
  }

  ngOnInit(): void {
  }

  addContractDetail() {
  }

}
