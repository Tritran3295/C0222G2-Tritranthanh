import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  numberOne = 0;
  numberTwo = 0;
  result;

  calculator(even: String){
    switch (even) {
      case "+":
        return this.result = this.numberOne + this.numberTwo;
      case "-":
        return this.result = this.numberOne - this.numberTwo;
      case "*":
        return this.result = this.numberOne * this.numberTwo;
      case "/":
        if (this.numberTwo !== 0){
          return this.result = this.numberOne / this.numberTwo;
        }else {
          alert(`Not divide to 0`)
        }

    }
  }
  constructor() {}

  ngOnInit(): void {
  }

}
