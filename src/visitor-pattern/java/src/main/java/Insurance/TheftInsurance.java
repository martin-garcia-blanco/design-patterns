package Insurance;

import Salesman.Salesman;

public class TheftInsurance implements Insurance {

  @Override
  public void sellInsurance(Salesman salesman) {
    salesman.sellTheftInsurance(this);
  }
}
