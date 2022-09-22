import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-changing-color',
  templateUrl: './changing-color.component.html',
  styleUrls: ['./changing-color.component.css']
})
export class ChangingColorComponent implements OnInit {
  colorChange = '';
  numberOne = 0;
  numberTwo = 0;
  result = 0;

  calculate(value: any) {
    switch (value) {
      case '+':
        return this.result = this.numberOne + this.numberTwo;
      case '-':
        return this.result = this.numberOne - this.numberTwo;
      case '*':
        return this.result = this.numberOne * this.numberTwo;
      case '/':
        if (this.numberTwo !== 0) {
          return this.result = this.numberOne / this.numberTwo;
        } else {
          alert('Not divide to 0');
        }
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}
