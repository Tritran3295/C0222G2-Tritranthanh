export interface Customer {
  id?: number;
  name?: string;
  dateOfBirth?: string;
  gender?: number;
  idCard?: string;
  phoneNumber?: string;
  email?: string;
  address?: string;
  customerType?: {
    id?: number;
    nameCustomerType?: string;
  };
}
