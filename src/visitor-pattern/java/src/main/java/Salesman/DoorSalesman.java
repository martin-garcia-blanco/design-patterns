package Salesman;

import Insurance.FireInsurance;
import Insurance.MedicalInsurance;
import Insurance.TheftInsurance;

public class DoorSalesman implements Salesman {

  @Override
  public void sellMedicalInsurance(MedicalInsurance insurance) {
    System.out.println("As a door salesman im selling a Medical Insurance");
  }

  @Override
  public void sellTheftInsurance(TheftInsurance insurance) {
    System.out.println("As a door salesman im selling a Theft Insurance");
  }

  @Override
  public void sellFireInsurance(FireInsurance insurance) {
    System.out.println("As a door salesman im selling a Fire Insurance");
  }
}
