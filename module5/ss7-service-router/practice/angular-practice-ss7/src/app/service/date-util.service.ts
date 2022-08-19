import { Injectable } from '@angular/core';

function differenceInYears(now: Date, diff: Date) {

}

function differenceInMonths(now: Date, diff: string | number | Date) {

}

function addMonths(diff: string | number | Date, months: void) {
  return undefined;
}

function differenceInDays(now: Date, diff: string | number | Date) {

}

@Injectable({
  providedIn: 'root'
})
export class DateUtilService {

  constructor() { }

  getDiffToNow(diff: string | number | Date): string {
    const result: string[] = [];
    const now = new Date();
    diff = new Date(diff);
    const years = differenceInYears(now, diff);

    function addYears(diff: Date, years: void) {
      return undefined;
    }

    // @ts-ignore
    if (years > 0) {
      result.push(`${years} years`);
      diff = addYears(diff, years);
    }

    const months = differenceInMonths(now, diff);
    result.push(`${months} months`);
    // @ts-ignore
    if (months > 0) {
      diff = addMonths(diff, months);
    }

    const days = differenceInDays(now, diff);
    // @ts-ignore
    if (days > 0) {
      result.push(`${days} days`);
    }

    return result.join(' ');
  }
}
