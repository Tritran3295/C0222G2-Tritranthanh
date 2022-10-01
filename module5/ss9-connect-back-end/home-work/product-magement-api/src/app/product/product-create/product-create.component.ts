import { Component, OnInit } from '@angular/core';
import {Category} from '../../model/category';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  categoryList: Category[] = [];
  createForm: FormGroup;
  constructor(private productService: ProductService,
              private router: Router) {
    this.productService.getAllCategory().subscribe(data => {
      this.categoryList = data;
    });
  }

  ngOnInit(): void {
    this.getForm();
  }
  getForm() {
    this.createForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      price: new FormControl(),
      description: new FormControl(),
      category: new FormControl(),
    });
  }
  createProduct() {
    const product = this.createForm.value;
    this.productService.save(product).subscribe(() => {
      this.router.navigateByUrl('');
    });
  }

}
