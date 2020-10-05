package example.flyStrategy;

public class NoFlyBehaviour implements FlyBehaviour{

  @Override
  public String fly() {
    return "Can't fly!";
  }
}
