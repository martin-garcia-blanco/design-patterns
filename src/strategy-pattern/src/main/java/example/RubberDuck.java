package example;

import example.flyStrategy.NoFlyBehaviour;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new NoFlyBehaviour());
  }

  @Override
  public String display() {
    return "Show Rubber duck";
  }
}
