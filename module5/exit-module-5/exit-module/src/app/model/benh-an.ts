import {MaBenhAn} from './ma-benh-an';
import {MaBenhNhan} from './ma-benh-nhan';

export interface BenhAn {
  id?: number;
  codeMedicalRecord?: MaBenhAn;
  codePatient?: MaBenhNhan;
  name?: string;
  dateIn?: string;
  dateOut?: string;
  reason?: string;
  treatments?: string;
  doctorTreatments?: string;
}
