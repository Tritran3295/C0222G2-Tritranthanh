import {Injectable} from '@angular/core';
import {RentType} from '../model/rent-type';

@Injectable({
  providedIn: 'root'
})
export class RentTypeService {
  rentTypeList: RentType[] = [];

  constructor() {
    this.rentTypeList.push({
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
    });
  }
}
