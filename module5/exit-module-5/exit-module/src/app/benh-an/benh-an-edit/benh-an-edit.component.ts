import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MaBenhAn} from '../../model/ma-benh-an';
import {MaBenhNhan} from '../../model/ma-benh-nhan';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {MaBenhAnService} from '../../service/ma-benh-an.service';
import {MaBenhNhanService} from '../../service/ma-benh-nhan.service';
import {BenhAnService} from '../../service/benh-an.service';
import {BenhAn} from '../../model/benh-an';

@Component({
  selector: 'app-benh-an-edit',
  templateUrl: './benh-an-edit.component.html',
  styleUrls: ['./benh-an-edit.component.css']
})
export class BenhAnEditComponent implements OnInit {
  benhAnForm: FormGroup = new FormGroup({
    id: new FormControl(),
    codeMedicalRecord: new FormControl(),
    codePatient: new FormControl(),
    name: new FormControl('', [Validators.required]),
    dateIn: new FormControl('', [Validators.required]),
    dateOut: new FormControl('', [Validators.required]),
    reason: new FormControl('', [Validators.required]),
    treatments: new FormControl('', [Validators.required]),
    doctorTreatments: new FormControl('', [Validators.required]),
  });
  maBenhAnList: MaBenhAn[] = [];
  maBenhNhanList: MaBenhNhan[] = [];
  id;

  constructor(private router: Router,
              private maBenhAnService: MaBenhAnService,
              private maBenhNhanService: MaBenhNhanService,
              private benhAnService: BenhAnService,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paraMap: ParamMap) => {
      this.id = +paraMap.get('id');
      this.benhAnService.findById(this.id).subscribe(value => {
        this.benhAnForm.patchValue(value);
        this.maBenhAnService.getAll().subscribe(data => {
          this.maBenhAnList = data;
          for (const item of data) {
            if (item.id === value.codeMedicalRecord.id) {
              this.benhAnForm.patchValue({maBenhAn: item});
            }
          }
        });
        this.maBenhNhanService.getAll().subscribe(data => {
          this.maBenhNhanList = data;
          for (const item of data) {
            if (item.id === value.codePatient.id) {
              this.benhAnForm.patchValue({maBenhNhan: item});
              console.log(item);
            }
          }
        });
      });
    });
  }

  editBenhAn() {
    const benhAn = this.benhAnForm.value;
    this.benhAnService.editCustomer(this.id, benhAn).subscribe();
    this.router.navigateByUrl('/benh-an/list');
  }
}
