export interface Contract {
  id?: number;
  startDate?: string;
  endDate?: string;
  deposit?: string;
  employee?: {
    id?: number,
    nameEmloyee?: string
  };
  customer?: {
    id?: number,
    nameCustomer?: string
  };
  facility?: {
    id?: number,
    nameFacility?: string
  };
}
