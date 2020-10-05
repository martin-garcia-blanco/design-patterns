package example;

public class RubberDuck extends Duck{

  @Override
  public String display() {
    return "Show Rubber duck";
  }

  @Override
  public String fly() {
    return "Can't fly!";
  }
}
