package example;

import example.flyStrategy.NormalFlyBehaviour;

public class RedHeadDuck extends Duck{

  public RedHeadDuck() {
    super( new NormalFlyBehaviour());
  }

  @Override
  public String display() {
    return "Show Red Head duck";
  }
}
