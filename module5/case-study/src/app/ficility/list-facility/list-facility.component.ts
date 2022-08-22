import {Component, OnInit} from '@angular/core';
import {Facility} from '../../model/facility';
import {FacilityService} from '../../service/facility.service';
import {FacilityTypeService} from '../../service/facility-type.service';
import {FacilityType} from '../../model/facility-type';

@Component({selector: 'app-list-facility', templateUrl: './list-facility.component.html', styleUrls: ['./list-facility.component.css']})
export class ListFacilityComponent implements OnInit {
  facilityList: Facility [] = [];
  facilityDetail: Facility;
  facilityType: FacilityType;
  facilityTypeList: Facility [] = [];
  delete = [];

  constructor(private facility: FacilityService, private facilityTypeService: FacilityTypeService) {
    this.facilityList = facility.getAllFacility();
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
    this.facility.delete(id);
  }

  detailService(id: number) {
    this.facilityDetail = this.facility.findById(id);
    this.facilityTypeList = this.facilityTypeService.facilityTypeList;
    for (let item of this.facilityTypeList) {
      if (item.id === this.facilityDetail.facilityType.id) {
        this.facilityType = item;
      }
    }
  }
}
