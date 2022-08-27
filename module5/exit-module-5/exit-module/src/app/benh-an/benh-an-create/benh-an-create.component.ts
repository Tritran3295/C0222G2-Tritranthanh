import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MaBenhAn} from '../../model/ma-benh-an';
import {MaBenhNhan} from '../../model/ma-benh-nhan';
import {MaBenhAnService} from '../../service/ma-benh-an.service';
import {MaBenhNhanService} from '../../service/ma-benh-nhan.service';
import {Router} from '@angular/router';
import {BenhAnService} from '../../service/benh-an.service';

@Component({
  selector: 'app-benh-an-create',
  templateUrl: './benh-an-create.component.html',
  styleUrls: ['./benh-an-create.component.css']
})
export class BenhAnCreateComponent implements OnInit {
  benhAnForm: FormGroup;
  maBenhAnList: MaBenhAn[] = [];
  maBenhNhanList: MaBenhNhan[] = [];
  constructor(private maBenhAnService: MaBenhAnService,
              private maBenhNhanService: MaBenhNhanService,
              private router: Router,
              private benhAnService: BenhAnService) {
    this.maBenhAnService.getAll().subscribe(value => {
      console.log(value);
      this.maBenhAnList = value;
    });
    this.maBenhNhanService.getAll().subscribe(value => {
      console.log(value);
      this.maBenhNhanList = value;
    });
  }

  ngOnInit(): void {
    this.benhAnForm = new FormGroup({
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
  }

  createBenhAn() {
    const benhAn = this.benhAnForm.value;
    this.benhAnService.saveBenhAn(benhAn).subscribe();
    console.log(benhAn);
    this.router.navigateByUrl('/benh-an/list');
  }
}
