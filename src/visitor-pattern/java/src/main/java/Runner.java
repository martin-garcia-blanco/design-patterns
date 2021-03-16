import Insurance.FireInsurance;
import Insurance.Insurance;
import Insurance.MedicalInsurance;
import Insurance.TheftInsurance;
import Salesman.DoorSalesman;
import Salesman.Salesman;
import java.util.ArrayList;
import java.util.List;

public class Runner {

  public static void main(String[] args) {
    List<Insurance> insuranceList = insuranceSold();

    // Pete is a salesman that sells a lot, and he needs to check his' today sells
    Salesman salesman = new DoorSalesman();

    //Pete can loop through a list checking the result of sell different type of insurances
    insuranceList.forEach(insurance -> insurance.sellInsurance(salesman));

  }

  private static List insuranceSold() {
    List insuranceList = new ArrayList();
    insuranceList.add(new MedicalInsurance());
    insuranceList.add(new MedicalInsurance());
    insuranceList.add(new TheftInsurance());
    insuranceList.add(new FireInsurance());
    insuranceList.add(new TheftInsurance());


    return insuranceList;
  }
}
