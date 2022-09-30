import {Injectable} from '@angular/core';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[] = [{
    id: 1,
    name: 'IPhone 12',
    price: 2400000,
    description: 'New'
  }, {
    id: 2,
    name: 'IPhone 11',
    price: 1560000,
    description: 'Like new'
  }, {
    id: 3,
    name: 'IPhone X',
    price: 968000,
    description: '97%'
  }, {
    id: 4,
    name: 'IPhone 8',
    price: 7540000,
    description: '98%'
  }, {
    id: 5,
    name: 'IPhone 11 Pro',
    price: 1895000,
    description: 'Like new'
  }];

  constructor() {
  }

  getAllProduct() {
    return this.products;
  }

  saveProduct(product: any) {
    this.products.push(product);
  }

  findById(id: number) {
    return this.products.filter(std => std === id)[0];
    // for (const item of this.products) {
    //   if (item.id === id) {
    //     return item;
    //   }
    // }
  }

  editProduct(product: any) {
    for (let i = 0; i < this.products.length; i++) {
      if (this.products[i].id === product.id) {
        this.products[i] = product;
      }
    }
  }

  delete(deleteElement: number) {
    const index = this.products.findIndex(data => data.id === deleteElement);
    {
      this.products.splice(index);
    }
  }
}
