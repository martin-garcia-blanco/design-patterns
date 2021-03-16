package Insurance;

import Salesman.Salesman;

public class FireInsurance implements  Insurance{

  @Override
  public void sellInsurance(Salesman salesman) {
    salesman.sellFireInsurance(this);
  }
}
