import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productList: Product[] = [];
  valueDelete = [];

  constructor(private productService: ProductService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getALl();
  }

  deleteProduct(id) {
    this.productService.deleteProduct(id).subscribe(() => {
      this.router.navigateByUrl('list/category');
    });
  }

  selDelete(id: number, name: string) {
    this.valueDelete.push(id);
    this.valueDelete.push(name);
  }

  private getALl() {
    this.productService.getAll().subscribe(products => {
      this.productList = products;
    });
  }
}
