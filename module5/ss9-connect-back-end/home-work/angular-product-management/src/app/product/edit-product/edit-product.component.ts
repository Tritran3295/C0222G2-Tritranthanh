import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from 'src/app/service/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';
import {Product} from '../../model/product';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {
  categores: Category[] = [];
  productForm: FormGroup;
  id: number;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private categoryService: CategoryService,
              private router: Router) {
  }

  ngOnInit() {
    this.categoryService.getAll().subscribe(next => {
      this.categores = next;
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getProduct(this.id);
    });
  }

  getProduct(id: number) {
    this.productService.findById(id).subscribe(product => {
      this.productForm = new FormGroup({
        id: new FormControl(product.id),
        name: new FormControl(product.name),
        price: new FormControl(product.price),
        description: new FormControl(product.description),
      });
    });
  }

  updateProduct(id: number) {
    const product = this.productForm.value;
    // tslint:disable-next-line:radix
    this.categoryService.findById(parseInt(this.productForm.value.name)).subscribe(next => {
      product.name = next;
      this.productService.updateProduct(id, product).subscribe(() => {
        this.productForm.reset();
        alert(' Create success');
        this.router.navigateByUrl('/product/list');
      });
    });
  }
}
