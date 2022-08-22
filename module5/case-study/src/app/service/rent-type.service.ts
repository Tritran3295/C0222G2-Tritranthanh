import {Injectable} from '@angular/core';
import {RentType} from '../model/rent-type';
import {Observable, of} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RentTypeService {
  rentTypeList: RentType[] = [
    {
      id: 1,
      name: 'Year'
    }, {
      id: 2,
      name: 'Month'
    }, {
      id: 2,
      name: 'Days'
    }, {
      id: 2,
      name: 'Hour'
    }
  ];

  constructor() {
  }

  getAllRentType(): Observable<RentType[]> {
    return of(this.rentTypeList);
  }
}
