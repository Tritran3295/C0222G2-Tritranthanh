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

  save(product: Product) {
    this.productList.push(product);
  }

  update(product: Product) {
    for (let i = 0; i < this.productList.length; i++) {
      if (this.productList[i].id === product.id) {
        this.productList[i] = product;
      }
    }
  }

  findById(id: number) {
    for (const item of this.productList) {
      if (item.id === id) {
        return item;
      }
    }
  }
  delete(id: number) {
    const index = this.productList.findIndex(product => product.id === id);
    this.productList.splice(index, 1);
  }
}
