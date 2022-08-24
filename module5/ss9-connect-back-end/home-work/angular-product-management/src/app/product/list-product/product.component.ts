import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {Router} from '@angular/router';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productList: Product[] = [];
  valueDelete = [];
  category: Category[] = [];

  constructor(private productService: ProductService,
              private categoryService: CategoryService,
              private router: Router) {
    this.categoryService.getAll().subscribe(date => {
      this.category = date;
    });
  }

  ngOnInit(): void {
    this.getALl();
  }

  deleteProduct(id) {
    this.productService.deleteProduct(id).subscribe(() => {
      this.router.navigateByUrl('list/product');
      this.getALl();
    });
  }

  selDelete(id: number, name: string) {
    this.valueDelete.push(id);
    this.valueDelete.push(name);
  }

  getALl() {
    this.productService.getAll().subscribe(data => {
      console.log(data);
      this.productList = data;
    });
  }
}
