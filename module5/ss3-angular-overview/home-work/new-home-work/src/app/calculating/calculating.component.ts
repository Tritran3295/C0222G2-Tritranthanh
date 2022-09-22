import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculating',
  templateUrl: './calculating.component.html',
  styleUrls: ['./calculating.component.css']
})
export class CalculatingComponent implements OnInit {
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
  constructor() {
  }

  ngOnInit(): void {
  }
}
