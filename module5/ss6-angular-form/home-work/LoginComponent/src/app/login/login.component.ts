import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, NgForm, Validators} from "@angular/forms";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;

  constructor() {
    this.loginForm = new FormGroup({
      email: new FormControl('',[Validators.email,Validators.required, Validators.minLength(6)]),
      password: new FormControl('',[Validators.minLength(6)]),
    });
  }

  ngOnInit(): void {
  }

  message: string = '';

  checkLogin() {
    if(this.loginForm.valid) {
      this.message = "Login Success";
    }else {
      this.message = "Login Fail";
    }
  }


}
