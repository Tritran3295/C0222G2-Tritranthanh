import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  productList: Product[] = [];
  delete = [];
  productDetail: Product;

  constructor(private productService: ProductService) {
    this.productList = this.productService.getAllProduct();
  }

  ngOnInit(): void {
  }

  elementDelete(id: number, name: string) {
    this.delete.push(id);
    this.delete.push(name);
    return this.delete;
  }

  deleteProduct(deleteElement: any) {
    this.productService.delete(deleteElement);
    this.delete = [];
  }

  detailService(id: number) {
    this.productDetail = this.productService.findById(id);
  }
}
