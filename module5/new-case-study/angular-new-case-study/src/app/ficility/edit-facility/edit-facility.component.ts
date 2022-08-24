import {Component, Input, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Facility} from '../../model/facility';
import {RentType} from '../../model/rent-type';
import {FacilityType} from '../../model/facility-type';
import {RentTypeService} from '../../service/rent-type.service';
import {FacilityTypeService} from '../../service/facility-type.service';
import {FacilityService} from '../../service/facility.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {Observable, of} from 'rxjs';

@Component({
  selector: 'app-edit-facility',
  templateUrl: './edit-facility.component.html',
  styleUrls: ['./edit-facility.component.css']
})
export class EditFacilityComponent implements OnInit {
  facilityForm: FormGroup;
  facility: Facility = {};
  rentTypeList: RentType[] = [];
  facilityType: FacilityType[] = [];

  constructor(private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService,
              private facilityService: FacilityService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private toast: ToastrService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = +paramMap.get('id');
      this.facilityTypeService.getAllFacilityType().subscribe(value => {
        this.facilityType = value;
      }, error => {
      }, () => {
        this.rentTypeService.getAllRentType().subscribe(rentTypeList => {
          this.rentTypeList = rentTypeList;
        }, error => {
        }, () => {
          this.facilityService.findById(id).subscribe(value => {
            this.facility = value;
          }, error => {
          }, () => {
            this.createFacilityForm(this.facility).subscribe(value => {

            }, error => {
            }, () => {
              this.selectFacility(this.facility.facilityType.name);
            });
          });
        });
      });
    });
  }

  private createFacilityForm(fac: Facility): Observable<any> {
    this.facilityForm = new FormGroup({
      id: new FormControl(fac.id),
      name: new FormControl(fac.name),
      area: new FormControl(fac.area),
      cost: new FormControl(fac.cost),
      maxPeople: new FormControl(fac.maxPeople),
      image: new FormControl(fac.image),
      standardRoom: new FormControl(fac.standardRoom),
      descriptionOther: new FormControl(fac.descriptionOther),
      poolArea: new FormControl(fac.poolArea),
      numberFloor: new FormControl(fac.numberFloor),
      facilityFree: new FormControl(fac.facilityFree),
      rentType: new FormControl(fac.rentType),
      facilityType: new FormControl(fac.facilityType),
    });
    return of('tri ga');
  }

  ngOnInit(): void {

  }

  editFacility() {
    const facility = this.facilityForm.value;
    this.facilityService.update(facility);
    this.router.navigateByUrl('/list/facility');
    this.toast.success('Edit success', 'tittle', {
      timeOut: 1500, progressBar: false
    });
  }

  compareRentType(c1: RentType, c2: RentType): boolean {
    if ((c1 && c2) !== undefined) {
      return c1.id === c2.id;
    }
  }

  compareFacilityType(c1: FacilityType, c2: FacilityType): boolean {
    if ((c1 && c2) !== undefined) {
      return c1.id === c2.id;
    }
  }

  selectFacility(facType: string) {
    @
    const getValue = $('#choiceFacilityType').val();
    switch (facType) {
      case 'Villa':
        $('#standardRoomEdit').show();
        $('#descriptionConvenienceEdit').show();
        $('#poolAreaEdit').show();
        $('#numberOfFloorEdit').show();
        $('#facilityFreeEdit').hide();
        break;
      case 'House':
        $('#standardRoomEdit').show();
        $('#descriptionConvenienceEdit').show();
        $('#poolAreaEdit').hide();
        $('#numberOfFloorEdit').show();
        $('#facilityFreeEdit').hide();
        break;
      case 'Room':
        $('#standardRoomEdit').hide();
        $('#descriptionConvenienceEdit').hide();
        $('#poolAreaEdit').hide();
        $('#numberOfFloorEdit').hide();
        $('#facilityFreeEdit').show();
        break;
    }
  }

  getHouseValue(event: any) {
    this.facilityForm.value.numberFloor = event.numberFloor;
    this.facilityForm.value.standardRoom = event.standardRoom;
    this.facilityForm.value.descriptionOther = event.descriptionOther;
  }

  getRoomValue(event: any) {
    this.facilityForm.value.facilityFree = event.facilityFree;
  }
  getVillaValue(event: any) {
    this.facilityForm.value.numberFloor = event.numberFloor;
    this.facilityForm.value.standardRoom = event.standardRoom;
    this.facilityForm.value.descriptionOther = event.descriptionOther;
    this.facilityForm.value.facilityFree = event.facilityFree;
    this.facilityForm.value.poolArea = event.poolArea;
  }
}
