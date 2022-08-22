import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {RentType} from '../../model/rent-type';
import {FacilityType} from '../../model/facility-type';
import {Router} from '@angular/router';
import {FacilityService} from '../../service/facility.service';
import {RentTypeService} from '../../service/rent-type.service';
import {FacilityTypeService} from '../../service/facility-type.service';

@Component({
  selector: 'app-create-facility',
  templateUrl: './create-facility.component.html',
  styleUrls: ['./create-facility.component.css']
})
export class CreateFacilityComponent implements OnInit {
  facilityForm: FormGroup;
  rentTypeList: RentType[] = [];
  facilityType: FacilityType[] = [];

  constructor(private router: Router,
              private facilityService: FacilityService,
              private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService) {
    this.rentTypeService.getAllRentType().subscribe(value => {
      this.rentTypeList = value;
    }, error => {
    }, () => {
      this.facilityTypeService.getAllFacilityType().subscribe(value => {
        this.facilityType = value;
      }, error => {
      }, () => {
        this.createForm();
      });
    });
  }

  createForm() {
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
    });
  }

  ngOnInit(): void {

  }

  createFacility() {
    const facility = this.facilityForm.value;
    this.facilityService.save(facility);
    this.router.navigateByUrl('/list/facility');
  }

  selectFacility() {
    //@ts-ignore
    const getValue = $('#choiceFacilityType').val();
    switch (getValue) {
      case '1':
        //@ts-ignore
        $('#standardRoom').show();
        //@ts-ignore
        $('#descriptionConvenience').show();
        //@ts-ignore
        $('#poolArea').show();
        //@ts-ignore
        $('#numberOfFloor').show();
        //@ts-ignore
        $('#facilityFree').hide();
        break;
      case '2':
        //@ts-ignore
        $('#standardRoom').show();
        //@ts-ignore
        $('#descriptionConvenience').show();
        //@ts-ignore
        $('#poolArea').hide();
        //@ts-ignore
        $('#numberOfFloor').show();
        //@ts-ignore
        $('#facilityFree').hide();
        break;
      case '3':
        //@ts-ignore
        $('#standardRoom').hide();
        //@ts-ignore
        $('#descriptionConvenience').hide();
        //@ts-ignore
        $('#poolArea').hide();
        //@ts-ignore
        $('#numberOfFloor').hide();
        //@ts-ignore
        $('#facilityFree').show();
        break;
    }
  }
}
