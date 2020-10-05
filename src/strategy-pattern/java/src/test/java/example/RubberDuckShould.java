package example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class RubberDuckShould {

  @Test
  void return_his_own_display_method() {
    RubberDuck rubberDuck = new RubberDuck();
    assertThat(rubberDuck.display(), is("Show Rubber duck"));
  }

  @Test
  void not_fly() {
    RubberDuck rubberDuck = new RubberDuck();
    assertThat(rubberDuck.fly(), is("Can't fly!"));
  }
}
