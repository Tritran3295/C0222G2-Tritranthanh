import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Facility} from '../../model/facility';
import {RentType} from '../../model/rent-type';
import {FacilityType} from '../../model/facility-type';
import {RentTypeService} from '../../service/rent-type.service';
import {FacilityTypeService} from '../../service/facility-type.service';
import {FacilityService} from '../../service/facility.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-edit-facility',
  templateUrl: './edit-facility.component.html',
  styleUrls: ['./edit-facility.component.css']
})
export class EditFacilityComponent implements OnInit {
  facilityForm: FormGroup;
  facility: Facility;
  rentTypeList: RentType[] = [];
  facilityType: FacilityType[] = [];

  constructor(private rentTypeService: RentTypeService,
              private facilityTypeService:FacilityTypeService,
              private facilityService: FacilityService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.rentTypeList = this.rentTypeService.rentTypeList;
    // this.facilityType = this.facilityTypeService.facilityTypeList();
    this.facilityForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      area: new FormControl(),
      cost: new FormControl(),
      maxPeople: new FormControl(),
      image: new FormControl(),
      standardRoom: new FormControl(),
      descriptionOther: new FormControl(),
      poolArea: new FormControl(),
      numberFloor: new FormControl(),
      facilityFree: new FormControl(),
      rentType: new FormControl(1),
      facilityType: new FormControl(1),
    })
  }

  editFacility() {

  }

  selectFacility() {

  }
}
