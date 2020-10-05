package example;

import example.flyStrategy.FlyBehaviour;

public class Duck implements FlyBehaviour {

  private FlyBehaviour flyBehaviour;

  public Duck(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public String display() {
    return "Show duck";
  }

  public String fly() {
    return flyBehaviour.fly();
  }
}
