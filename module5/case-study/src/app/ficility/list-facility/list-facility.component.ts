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
      area: 50.7,
      cost: 5000000,
      maxPeople: 20,
      standardRoom: 'Vip',
      descriptionOther: 'Chạy bộ buổi sáng',
      poolArea: 50,
      numberFloor: 3,
      facilityFree: 'Ăn sáng miễn phí',
      image: 'https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Suite-Feature-370x239.jpg',
      rentType: {id: 1, nameRentType: 'Vip'},
      facilityType: {id: 1, nameFacilityType: 'Villa'}
    });
    this.facilityList.push({
      id: 2,
      name: 'OCEAN STUDIO SUITE',
      area: 60.7,
      cost: 5000000,
      maxPeople: 20,
      standardRoom: 'Vip',
      descriptionOther: 'Chạy bộ buổi sáng',
      poolArea: 50,
      numberFloor: 3,
      facilityFree: 'Ăn sáng miễn phí',
      image: 'https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Deluxe-double-bed-F-370x239.jpg',
      rentType: {id: 1, nameRentType: 'Vip'},
      facilityType: {id: 1, nameFacilityType: 'Villa'}
    });
    this.facilityList.push({
      id: 3,
      name: 'OCEAN DELUXE',
      area: 60.7,
      cost: 5000000,
      maxPeople: 20,
      standardRoom: 'Vip',
      descriptionOther: 'Chạy bộ buổi sáng',
      poolArea: 49.8,
      numberFloor: 3,
      facilityFree: 'Ăn sáng miễn phí',
      image: 'https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Deluxe-double-bed-F-370x239.jpg',
      rentType: {id: 1, nameRentType: 'Vip'},
      facilityType: {id: 1, nameFacilityType: 'Villa'}
    });
  }

  ngOnInit(): void {
  }

}
