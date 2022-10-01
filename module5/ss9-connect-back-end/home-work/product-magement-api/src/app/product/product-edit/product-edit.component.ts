import {Component, OnInit} from '@angular/core';
import {Category} from '../../model/category';
import {ProductService} from '../../service/product.service';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  categoryList: Category[] = [];
  editForm: FormGroup;
  id: number;
  product: Product;

  constructor(private productService: ProductService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.productService.findById(this.id).subscribe(data => {
        this.editForm.patchValue(data);
        this.productService.getAllCategory().subscribe(category => {
          this.categoryList = category;
          for (const item of this.categoryList) {
            if (item.id === data.category.id) {
              this.editForm.patchValue({category: item});
            }
          }
        });
      });
    });
  }

  ngOnInit(): void {
    this.getFormEdit();
  }

  getFormEdit() {
    this.editForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      price: new FormControl(),
      description: new FormControl(),
      category: new FormControl(),
    });
  }

  editProduct() {
    const product = this.editForm.value;
    this.productService.update(this.id, product).subscribe(() => {
      this.router.navigateByUrl('');
    });
  }
}
