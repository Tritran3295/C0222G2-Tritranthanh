import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Facility} from '../../../model/facility';
import {$} from 'protractor';

@Component({
  selector: 'app-villa-input',
  templateUrl: './villa-input.component.html',
  styleUrls: ['./villa-input.component.css']
})
export class VillaInputComponent implements OnInit {
  @Input() facility: Facility;
  @Output() villaValue: EventEmitter<any> = new EventEmitter<any>();
  constructor() { }

  ngOnInit(): void {
  }
  getValue() {
    //@ts-ignore
    const standardRoomValue = $('#standardRoomEdit').val();
    //@ts-ignore
    const numberFloorValue = $('#numberOfFloorEdit').val();
    //@ts-ignore
    const descriptionOtherValue = $('#descriptionConvenienceEdit').val();
    const facilityFreeValue = $('#facilityFreeEdit').val();
    const poolAreaValue = $('#poolAreaEdit').val();

    this.villaValue.emit({
      numberFloor: numberFloorValue,
      standardRoom: standardRoomValue,
      descriptionOther: descriptionOtherValue,
      facilityFree: facilityFreeValue,
      poolArea: poolAreaValue
    })
  }

}
