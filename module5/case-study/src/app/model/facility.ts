export interface Facility {
  id?: number;
  name?: string;
  area?: number;
  cost?: number;
  maxPeople?: number;
  standardRoom?: string;
  descriptionOther?: string;
  poolArea?: number;
  numberFloor?: number;
  facilityFree?: string;
  rentType?: {
    id?: number,
    nameRentType?: string
  };
  facilityType?: {
    id?: number,
    nameFacilityType?: string
  };
}
