import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {RentType} from '../../model/rent-type';
import {FacilityType} from '../../model/facility-type';
import {Router} from '@angular/router';
import {FacilityService} from '../../service/facility.service';
import {RentTypeService} from '../../service/rent-type.service';
import {FacilityTypeService} from '../../service/facility-type.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-create-facility',
  templateUrl: './create-facility.component.html',
  styleUrls: ['./create-facility.component.css']
})
export class CreateFacilityComponent implements OnInit {
  facilityForm: FormGroup =  new FormGroup({
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
  facilityType: FacilityType[] = [];

  constructor(private router: Router,
              private facilityService: FacilityService,
              private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService,
              private toastr: ToastrService) {
    this.rentTypeService.getAllRentType().subscribe(value => {
      this.rentTypeList = value;
    }, error => {
    }, () => {
      this.facilityTypeService.getAllFacilityType().subscribe(value => {
        this.facilityType = value;
        console.log(this.facilityType);
      }, error => {
      }, () => {
        this.createForm();
      });
    });
  }

  createForm() {
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
      facilityType: new FormControl(''),
    });
    this.rentTypeService.getAllRentType().subscribe(value => {
      this.rentTypeList = value;
      this.facilityForm.patchValue({rentType: value[0]})
    });
    this.facilityTypeService.getAllFacilityType().subscribe(value => {
      this.facilityType = value;
      this.facilityForm.patchValue({facilityType: value[0]})
    });
  }

  ngOnInit(): void {

  }

  createFacility() {
    const facility = this.facilityForm.value;
    this.facilityService.saveFacility(facility).subscribe(()=>{

      this.router.navigateByUrl('/list/facility');
    });

    this.toastr.success('Create Facility success', 'tittle', {
      timeOut: 1500, progressBar: false
    });
  }

  selectFacility() {
    //@ts-ignore
    const getValue = $('#choiceFacilityType').val();
    console.log(getValue);
    switch (getValue) {
      case '3: Object':
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
      case '4: Object':
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
      case '5: Object':
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
