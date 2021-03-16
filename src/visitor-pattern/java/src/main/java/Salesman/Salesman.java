package Salesman;

import Insurance.FireInsurance;
import Insurance.MedicalInsurance;
import Insurance.TheftInsurance;

public interface Salesman {
  void sellMedicalInsurance(MedicalInsurance insurance);
  void sellTheftInsurance(TheftInsurance insurance);
  void sellFireInsurance(FireInsurance insurance);
}
