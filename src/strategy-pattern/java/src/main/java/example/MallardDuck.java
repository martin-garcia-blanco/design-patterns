package example;

import example.flyStrategy.NormalFlyBehaviour;

public class MallardDuck extends Duck{

  public MallardDuck() {
    super(new NormalFlyBehaviour());
  }


  @Override
  public String display() {
    return "Show Mallard duck";
  }
}
