import { Component, OnInit } from '@angular/core';
import {Pet} from './pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name: 'puppie',
    image: 'https://www.purina-aoa.com/sites/default/files/2020-11/Working%20Dogs%20Everything%20You%20Need%20to%20KnowTEASER.jpeg'
  };
  constructor() { }

  ngOnInit(): void {
  }

}
