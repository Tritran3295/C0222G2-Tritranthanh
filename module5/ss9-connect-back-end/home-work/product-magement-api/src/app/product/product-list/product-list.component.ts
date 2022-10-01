import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {Category} from '../../model/category';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  productList: Product[] = [];
  idModal: number;
  nameModal: string;

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.productService.getAllProduct().subscribe(data => {
      this.productList = data;
    });
  }

  elementDelete(id: number, name: string) {
    this.idModal = id;
    this.nameModal = name;
  }

  deleteProduct(idModal: number) {
    this.productService.removeProduct(this.idModal).subscribe(() => {
      this.ngOnInit();
    }, error => {
      console.log(error);
    });
  }
}
