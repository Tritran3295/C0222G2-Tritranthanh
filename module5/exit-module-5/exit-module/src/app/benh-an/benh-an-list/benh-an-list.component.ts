import {Component, OnInit} from '@angular/core';
import {BenhAn} from '../../model/benh-an';
import {BenhAnService} from '../../service/benh-an.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-benh-an-list',
  templateUrl: './benh-an-list.component.html',
  styleUrls: ['./benh-an-list.component.css']
})
export class BenhAnListComponent implements OnInit {
  benhAnList: BenhAn[] = [];
  p = 1;
  idModal: number;
  nameModal: string;
  searchForm: FormGroup;

  constructor(private benhAnService: BenhAnService) {
  }

  ngOnInit(): void {
    this.benhAnService.getAll().subscribe(value => {
      this.benhAnList = value.content;
    });
    this.searchForm = new FormGroup({
      nameSearch: new FormControl()
    });
  }

  elementDelete(id: number, name: any) {
    this.idModal = id;
    this.nameModal = name;
  }

  deleteCustomer() {
    this.benhAnService.deleteBenhAn(this.idModal).subscribe(value => {
    }, error => {
      console.log(error);
    }, () => {
      this.ngOnInit();
    });
  }

  nameSearch() {
    const name = this.searchForm.value.nameSearch;
    console.log(name);
    this.benhAnService.searchByName(name).subscribe(value => {
      console.log(value);
      this.benhAnList = value;
    });
  }
}
