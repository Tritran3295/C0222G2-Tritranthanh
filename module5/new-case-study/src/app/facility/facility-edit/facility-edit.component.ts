import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {RentType} from "../../model/rent-type";
import {FacilityType} from "../../model/facility-type";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FacilityService} from "../../service/facility.service";
import {FacilityTypeService} from "../../service/facility-type.service";
import {RentTypeService} from "../../service/rent-type.service";
import * as $ from "jquery";
import {CustomerType} from "../../model/customer-type";
import {Facility} from "../../model/facility";

@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  facilityForm: FormGroup = new FormGroup({
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
    rentType: new FormControl(),
    facilityType: new FormControl(),
  });
  rentTypeList: RentType[] = [];
  facilityTypeList: FacilityType[] = [];
  id: number;
  facility: Facility;

  constructor(private router: Router,
              private facilityService: FacilityService,
              private facilityTypeService: FacilityTypeService,
              private rentTypeService: RentTypeService,
              private activatedRoute: ActivatedRoute) {
    this.getFacility()
  }

  ngOnInit(): void {
    this.compareFacilityType(this.facility.facilityType, this.facility.facilityType)
  }

  getFacility() {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.facilityService.findById(this.id).subscribe(facility => {
        this.facilityForm.patchValue(facility);
        this.facilityTypeService.getAllFacilityType().subscribe(data => {
          console.log(data)
          this.facilityTypeList = data;
          for (const item of this.facilityTypeList) {
            if (item.id === facility.facilityType.id) {
              console.log(item)
              this.facilityForm.patchValue({facilityType: item})
            }
          }
        });
        this.rentTypeService.getAllRentType().subscribe(data => {
          console.log(data)
          this.rentTypeList = data;
          for (const item of this.rentTypeList) {
            if (item.id === facility.rentType.id) {
              this.facilityForm.patchValue({rentType: item})
            }
          }
        })
      })
    })
  }

  editFacility(id) {
  this.facilityService.editFacility(id,this.facilityForm.value).subscribe(() => {
    this.router.navigateByUrl('/facility/list')
  })
  }

  selectFacility() {
    const getValue = $('#choiceFacilityType').val();
    console.log(getValue)
    switch (getValue) {
      case '0: Object':
        $('#standardRoom').show();
        $('#descriptionConvenience').show();
        $('#poolArea').show();
        $('#numberOfFloor').show();
        $('#facilityFree').hide();
        break;
      case '1: Object':
        $('#standardRoom').show();
        $('#descriptionConvenience').show();
        $('#poolArea').hide();
        $('#numberOfFloor').show();
        $('#facilityFree').hide();
        break;
      case '2: Object':
        $('#standardRoom').hide();
        $('#descriptionConvenience').hide();
        $('#poolArea').hide();
        $('#numberOfFloor').hide();
        $('#facilityFree').show();
        break;
    }
  }
  compareFacilityType(type1: FacilityType, type2: FacilityType): boolean {
    return type1.id === type2.id;
  }
}
