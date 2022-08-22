import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  delete = [];
  productList: Product[] = [];

  constructor(private productService: ProductService) {
    this.productList = this.productService.getAll();
  }

  ngOnInit(): void {
  }

  elementDelete(id: number, name: string) {
    this.delete.push(id);
    this.delete.push(name);
    return this.delete;
  }

  deleteProduct(id) {
    this.productService.delete(id);
  }

}
