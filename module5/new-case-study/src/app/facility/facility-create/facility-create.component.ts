import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {RentType} from "../../model/rent-type";
import {FacilityType} from "../../model/facility-type";
import {Router} from "@angular/router";
import {RentTypeService} from "../../service/rent-type.service";
import {FacilityTypeService} from "../../service/facility-type.service";
import {FacilityService} from "../../service/facility.service";
import * as $ from "jquery";
@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
  facilityForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl('', [Validators.required]),
    area: new FormControl('', [Validators.required, Validators.min(15)]),
    cost: new FormControl('', [Validators.required]),
    maxPeople: new FormControl('', [Validators.required]),
    image: new FormControl('',[Validators.required]),
    standardRoom: new FormControl('', [Validators.required]),
    descriptionOther: new FormControl('', [Validators.required]),
    poolArea: new FormControl('', [Validators.required, Validators.min(1)]),
    numberFloor: new FormControl('', [Validators.required, Validators.min(1)]),
    facilityFree: new FormControl('', [Validators.required]),
    rentType: new FormControl(''),
    facilityType: new FormControl(''),
  });
  rentTypeList: RentType[] = [];
  facilityTypeList: FacilityType[] = [];

  constructor(private router: Router,
              private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService,
              private facilityService: FacilityService) {
    this.rentTypeService.getAllRentType().subscribe(data => {
      this.rentTypeList = data;
    },error => {
    },() => {
      this.facilityTypeService.getAllFacilityType().subscribe(data =>{
        this.facilityTypeList = data;
      },error => {
      },() => {
        this.createForm();
      })
    })
  }

  ngOnInit(): void {
  }

  private createForm() {
    this.facilityForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl('', [Validators.required]),
      area: new FormControl('', [Validators.required, Validators.min(15)]),
      cost: new FormControl('', [Validators.required]),
      maxPeople: new FormControl('', [Validators.required]),
      image: new FormControl('',[Validators.required]),
      standardRoom: new FormControl('', [Validators.required]),
      descriptionOther: new FormControl('', [Validators.required]),
      poolArea: new FormControl('', [Validators.required, Validators.min(1)]),
      numberFloor: new FormControl('', [Validators.required, Validators.min(1)]),
      facilityFree: new FormControl('', [Validators.required]),
      rentType: new FormControl(''),
      facilityType: new FormControl('')
    });
    this.rentTypeService.getAllRentType().subscribe(value => {
      this.rentTypeList = value;
      this.facilityForm.patchValue({rentType: value[0]})
    });
    this.facilityTypeService.getAllFacilityType().subscribe(value => {
      this.facilityTypeList = value;
      this.facilityForm.patchValue({facilityType: value[0]})
    })
  }

  createFacility() {
    const facility = this.facilityForm.value;
    this.facilityService.saveFacility(facility).subscribe(() =>{
      this.router.navigateByUrl('/facility/list')
    })
  }

  selectFacility() {
    const getValue = $('#choiceFacilityType').val();
    switch (getValue) {
      case '3: Object':
        $('#standardRoom').show();
        $('#descriptionConvenience').show();
        $('#poolArea').show();
        $('#numberOfFloor').show();
        $('#facilityFree').hide();
        break;
      case '4: Object':
        $('#standardRoom').show();
        $('#descriptionConvenience').show();
        $('#poolArea').hide();
        $('#numberOfFloor').show();
        $('#facilityFree').hide();
        break;
      case '5: Object':
        $('#standardRoom').hide();
        $('#descriptionConvenience').hide();
        $('#poolArea').hide();
        $('#numberOfFloor').hide();
        $('#facilityFree').show();
        break;
    }
  }

}
