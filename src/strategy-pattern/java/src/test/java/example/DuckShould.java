package example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import example.flyStrategy.FlyBehaviour;
import example.flyStrategy.NormalFlyBehaviour;
import org.junit.jupiter.api.Test;

public class DuckShould {
  @Test
  void return_display_method() {
    FlyBehaviour normalFlyBehaviour = new NormalFlyBehaviour();
    Duck duck = new Duck(normalFlyBehaviour);
    assertThat(duck.display(), is("Show duck"));
  }

  @Test
  void fly_normally() {
    FlyBehaviour normalFlyBehaviour = new NormalFlyBehaviour();
    Duck duck = new Duck(normalFlyBehaviour);    assertThat(duck.fly(), is("Show duck flying"));
  }
}
