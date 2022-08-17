import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-angular-progress-bar',
  templateUrl: './angular-progress-bar.component.html',
  styleUrls: ['./angular-progress-bar.component.css']
})
export class AngularProgressBarComponent implements OnInit {
  @Input() backgroundColor = '#D9D9D9';
  @Input() progressColor = '#4CAF50';
  @Input() progress = 0;
  constructor() { }

  ngOnInit(): void {
  }
  loading() {
    const interval1 = setInterval(() => {
      this.progress = this.progress + 5;
      if (this.progress === 100) {
        clearInterval(interval1);
      }
    }, 1000);
  }
}
