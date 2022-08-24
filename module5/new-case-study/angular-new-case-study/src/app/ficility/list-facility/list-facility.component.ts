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
    this.facilityList = facilityService.getAllFacility();
    console.log(this.facilityList);
  }

  ngOnInit(): void {
  }

  facilityDelete(id: number, name: string) {
    this.delete.push(id);
    this.delete.push(name);
    return this.delete;
  }

  deleteFacility(id) {
    this.facilityService.delete(id);
    this.toastr.success('Delete success', 'tittle', {
      timeOut: 1500, progressBar: false
    });
  }

  detailService(id: number) {
    this.facilityService.findById(id).subscribe(data => {
      this.facilityDetail = data;
    });
    for (let item of this.facilityTypeList) {
      if (item.id === this.facilityDetail.facilityType.id) {
        this.facilityType = item;
      }
    }
  }
}
