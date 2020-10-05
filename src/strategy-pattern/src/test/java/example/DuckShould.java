package example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class DuckShould {
  @Test
  void return_display_method() {
    Duck duck = new Duck();
    assertThat(duck.display(), is("Show duck"));
  }
}
