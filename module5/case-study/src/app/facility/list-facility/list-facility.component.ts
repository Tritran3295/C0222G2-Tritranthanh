import {Component, OnInit} from '@angular/core';
import {Facility} from '../../model/facility';
import {FacilityService} from '../../service/facility.service';
import {FacilityTypeService} from '../../service/facility-type.service';
import {FacilityType} from '../../model/facility-type';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-list-facility',
  templateUrl: './list-facility.component.html',
  styleUrls: ['./list-facility.component.css'
  ]
})
export class ListFacilityComponent implements OnInit {
  facilityList: Facility [] = [];
  facilityDetail: Facility;
  facilityType: FacilityType;
  facilityTypeList: Facility [] = [];
  delete = [];
  p: number = 1;

  constructor(private facilityService: FacilityService,
              private facilityTypeService: FacilityTypeService,
              private toastr: ToastrService) {

  }

  ngOnInit(): void {
    this.facilityService.getAll().subscribe(data =>{
      this.facilityList = data
    })
  }

  facilityDelete(id: number, name: string) {
    this.delete.push(id);
    this.delete.push(name);
    return this.delete;
  }

  deleteFacility(id) {
    this.facilityService.deleteFacility(id).subscribe(() => {
      this.toastr.success('Delete success', 'tittle', {
        timeOut: 1500, progressBar: false
      },);
    },error => {
      console.log(error);
    },() => {
      this.ngOnInit();
    });

  }

  detailService(id: number) {
    this.facilityService.findById(id).subscribe(data => {
      this.facilityDetail = data;
      console.log(data);
    });
  }
}
