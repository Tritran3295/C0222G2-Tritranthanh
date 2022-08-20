import {Injectable} from '@angular/core';
import {Dictionary} from '../model/dictionary';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionaries: Dictionary[] = [];

  constructor() {
    this.dictionaries.push(
      {vietnamese: 'chó', english: 'dog'},
      {vietnamese: 'mèo', english: 'Cat'},
      {vietnamese: 'chuột', english: 'mouse'},
      {vietnamese: 'gà', english: 'chicken'},
      {vietnamese: 'horse', english: 'ngựa'},
      {vietnamese: 'Tài', english: 'Biên Hoà'}
    );
  }

  findAll() {
    return this.dictionaries;
  }
}
