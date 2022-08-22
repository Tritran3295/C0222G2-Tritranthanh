import { Component, OnInit } from '@angular/core';
import {Dictionary} from '../../model/dictionary';
import {DictionaryService} from '../../service/dictionary.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  dictionaryList: Dictionary[] = [];

  constructor(private dictionaryService: DictionaryService, private router: Router) {
    this.dictionaryList = this.dictionaryService.findAll();
    console.log("home");
  }

  ngOnInit(): void {
  }
}
