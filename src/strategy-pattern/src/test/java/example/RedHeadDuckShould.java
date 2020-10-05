package example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class RedHeadDuckShould {

  @Test
  void return_his_own_display_method() {
    RedHeadDuck redHeadDuck = new RedHeadDuck();
    assertThat(redHeadDuck.display(), is("Show Red Head duck"));
  }
}
