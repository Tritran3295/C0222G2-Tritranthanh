import {Injectable} from '@angular/core';
import {Facility} from '../model/facility';
import {RentTypeService} from './rent-type.service';
import {FacilityTypeService} from './facility-type.service';
import {Observable, of} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  facilityList: Facility[] = [
    {
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
      rentType: {
        id: 3,
        name: 'Days'
      },
      facilityType: {
        id: 1,
        name: 'Villa'
      }
    },
    {
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
      rentType: {
        id: 3,
        name: 'Days'
      },
      facilityType: {
        id: 1,
        name: 'Villa'
      }
    },
    {
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
      rentType: {
        id: 3,
        name: 'Days'
      },
      facilityType: {
        id: 1,
        name: 'Villa'
      }
    }
  ];

  constructor(private rentTypeService: RentTypeService,
              private facilityTypeService: FacilityTypeService) {
  }

  getAllFacility() {
    return this.facilityList;
  }

  findById(id: number): Observable<Facility> {
    for (let item of this.facilityList) {
      if (item.id == id) {
        return of(item);
      }
    }
  }

  save(facility: Facility) {
    for (const item of this.facilityTypeService.facilityTypeList) {
      // @ts-ignore
      if (item.id === parseInt(facility.facilityType)) {
        facility.facilityType = item;
      }
    }
    console.log(facility);
    this.facilityList.push(facility);
  }

  delete(id) {
    const index = this.facilityList.findIndex(facility => facility.id === id);
    this.facilityList.splice(index, 1);
  }

  update(facility) {
    for (let i = 0; i < this.facilityList.length; i++) {
      if (this.facilityList[i].id === facility.id) {
        this.facilityList[i] = facility;
      }
    }

  }
}
