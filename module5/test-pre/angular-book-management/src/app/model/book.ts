import {Category} from './category';

export interface Book {
  id?: number;
  name?: string;
  category?: Category;
  dateBorrow?: string;
  dateBack?: string;
  amount?: number;
}
