import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Facility} from '../../../model/facility';
import {$} from 'protractor';

@Component({
  selector: 'app-room-input',
  templateUrl: './room-input.component.html',
  styleUrls: ['./room-input.component.css']
})
export class RoomInputComponent implements OnInit {
  @Input() facility: Facility;
  @Output() roomValue: EventEmitter<any> = new EventEmitter<any>()
  constructor() { }

  ngOnInit(): void {
  }
  getValue() {
    const facilityFreeValue = $('#facilityFreeEdit').val();
    this.roomValue.emit({
      facilityFree: facilityFreeValue
    });
  }
}
