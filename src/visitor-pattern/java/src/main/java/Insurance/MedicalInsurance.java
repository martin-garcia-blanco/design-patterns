package Insurance;

import Salesman.Salesman;

public class MedicalInsurance implements Insurance {

  @Override
  public void sellInsurance(Salesman salesman) {
    salesman.sellMedicalInsurance(this);
  }
}
