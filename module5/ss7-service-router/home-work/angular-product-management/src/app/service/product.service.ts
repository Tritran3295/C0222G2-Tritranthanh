import {Injectable} from '@angular/core';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  productList: Product [] = [];

  constructor() {
    this.productList.push({
        id: 1,
        name: 'Iphone',
        price: 13000,
        description: 'New'
      }, {
        id: 2,
        name: 'SamSung',
        price: 11000,
        description: 'New'
      }, {
        id: 3,
        name: 'Huawei',
        price: 9000,
        description: 'Like New'
      }
    );
  }

  getAll() {
    return this.productList;
  }
}
