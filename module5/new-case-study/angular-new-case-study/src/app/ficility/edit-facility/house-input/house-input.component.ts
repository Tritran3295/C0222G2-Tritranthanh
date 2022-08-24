import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Facility} from '../../../model/facility';

@Component({
  selector: 'app-house-input',
  templateUrl: './house-input.component.html',
  styleUrls: ['./house-input.component.css']
})
export class HouseInputComponent implements OnInit {

  @Input() facility: Facility;

  @Output() houseValue: EventEmitter<any> = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit(): void {
  }

  getValue() {
    //@ts-ignore
    const standardRoomValue = $('#standardRoomEdit').val();
    //@ts-ignore
    const numberFloorValue = $('#numberOfFloorEdit').val();
    //@ts-ignore
    const descriptionOtherValue = $('#descriptionConvenienceEdit').val();

    this.houseValue.emit({
      numberFloor: numberFloorValue,
      standardRoom: standardRoomValue,
      descriptionOther: descriptionOtherValue
    })
  }
}
