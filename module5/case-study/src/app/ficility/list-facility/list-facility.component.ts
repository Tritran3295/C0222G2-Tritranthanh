import {Component, OnInit} from '@angular/core';
import {Facility} from '../../model/facility';

@Component({
  selector: 'app-list-facility',
  templateUrl: './list-facility.component.html',
  styleUrls: ['./list-facility.component.css']
})
export class ListFacilityComponent implements OnInit {
  facilityList: Facility [] = [];

  constructor() {
    this.facilityList.push({
      id: 1,
      name: 'PHÒNG SUITE HƯỚNG BIỂN',
      area: 43.7,
      cost: 5000000,
      maxPeople: 20,
      standardRoom: 'Vip',
      descriptionOther: 'Chạy bộ buổi sáng',
      poolArea: 50,
      numberFloor: 3,
      facilityFree: 'Ăn sáng miễn phí',
      rentType: {id: 1, nameRentType: 'Vip'},
      facilityType: {id: 1, nameFacilityType: 'Villa'}
    });
  }

  ngOnInit(): void {
  }

}
