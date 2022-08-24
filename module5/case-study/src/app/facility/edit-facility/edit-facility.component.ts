import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {RentType} from '../../model/rent-type';
import {FacilityType} from '../../model/facility-type';
import {Facility} from '../../model/facility';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {RentTypeService} from '../../service/rent-type.service';
import {FacilityTypeService} from '../../service/facility-type.service';
import {FacilityService} from '../../service/facility.service';
import {ToastrService} from 'ngx-toastr';
import {Observable, of} from 'rxjs';

@Component({
  selector: 'app-edit-facility',
  templateUrl: './edit-facility.component.html',
  styleUrls: ['./edit-facility.component.css']
})
export class EditFacilityComponent implements OnInit {
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

  constructor(private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService,
              private facilityService: FacilityService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private toast: ToastrService) {
  }

  ngOnInit() {
    this.getFacility();
  }

  getFacility() {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.facilityService.findById(this.id).subscribe(facility => {
        this.facilityForm.patchValue(facility);
        this.facilityTypeService.getAllFacilityType().subscribe(facilityType => {
          this.facilityTypeList = facilityType;
          for (const item of this.facilityTypeList) {
            if (item.id === facility.facilityType.id ) {
              this.facilityForm.patchValue({facilityType: item});
            }
          }
        });
        this.rentTypeService.getAllRentType().subscribe(rentType => {
          this.rentTypeList = rentType;
          for (const item of this.rentTypeList) {
            if (item.id === facility.rentType.id ) {
              this.facilityForm.patchValue({rentType: item});
            }
          }
        });
      });
    });
  }

  selectFacility() {
    //@ts-ignore
    const getValue = $('#choiceFacilityType').val();
    console.log(getValue);
    switch (getValue) {
      case '0: Object':
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
      case '1: Object ':
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
      case '2: Object':
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

  edit(id) {
    this.facilityService.editFacility(id, this.facilityForm.value).subscribe(() => {
      this.router.navigateByUrl('list/facility');
    })
  }
}
