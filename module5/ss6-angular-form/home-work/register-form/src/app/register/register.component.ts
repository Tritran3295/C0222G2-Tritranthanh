import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerFormReactive: FormGroup;

  constructor() {
    this.registerFormReactive = new FormGroup({
      email: new FormControl('', [Validators.email,Validators.required, Validators.minLength(6)]),
      pass: new FormGroup({
        password: new FormControl('', [Validators.required, Validators.minLength(6)]),
        confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
      }),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.min(18)]),
      gender: new FormControl(),
      phone: new FormControl('', [Validators.pattern('^\\+84\\d{9,10}$')])
    });
  }

  get email() {
    return this.registerFormReactive.get('email');
  }

  get password() {
    return this.registerFormReactive.get('pass').get('password');
  }

  get confirmPassword() {
    return this.registerFormReactive.get('pass').get('confirmPassword');
  }

  get age() {
    return this.registerFormReactive.get('age');
  }

  get gender() {
    return this.registerFormReactive.get('gender');

  }

  get phone() {
    return this.registerFormReactive.get('phone');

  }

  get country() {
    return this.registerFormReactive.get('country');

  }

  countryList: country[] = [
    new country('1', 'Việt Nam'),
    new country('2', 'Singapore'),
    new country('3', 'Malaysia'),
  ];


  ngOnInit(): void {
  }

  message: string = '';

  registerWithReactive() {
    if (this.registerFormReactive.valid) {
      this.message = 'Success';
    } else {
      this.message = 'Fail';
    }
  }
}

export class country {
  id: string;
  name: string;

  constructor(id: string, name: string) {
    this.id = id;
    this.name = name;
  }
}
