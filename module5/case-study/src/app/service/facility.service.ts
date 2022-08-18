import {Injectable} from '@angular/core';
import {Facility} from '../model/facility';
import {RentTypeService} from './rent-type.service';
import {FacilityTypeService} from './facility-type.service';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  facilityList: Facility[] = [];

  constructor(private rentType: RentTypeService,
              private facilityType: FacilityTypeService) {
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
      rentType: rentType.rentTypeList[0],
      facilityType: facilityType.facilityTypeList[1]
    }, {
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
      rentType: rentType.rentTypeList[1],
      facilityType: facilityType.facilityTypeList[0]
    }, {
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
      rentType: rentType.rentTypeList[3],
      facilityType: facilityType.facilityTypeList[2]
    });
  }
  getAllFacility() {
    return this.facilityList;
  }
}
