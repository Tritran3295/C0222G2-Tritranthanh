import { Component, OnInit } from '@angular/core';
import {RentType} from "../../model/rent-type";

@Component({
  selector: 'app-facility-edit-new',
  templateUrl: './facility-edit-new.component.html',
  styleUrls: ['./facility-edit-new.component.css']
})
export class FacilityEditNewComponent implements OnInit {
  rentTypeList: RentType[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
