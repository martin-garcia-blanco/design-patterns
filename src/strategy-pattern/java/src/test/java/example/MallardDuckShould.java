package example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MallardDuckShould {

    @Test
    void return_his_own_display_method() {
        MallardDuck mallardDuck = new MallardDuck();
        assertThat(mallardDuck.display(), is("Show Mallard duck"));
    }

    @Test
    void fly_normally() {
        MallardDuck mallardDuck = new MallardDuck();
        assertThat(mallardDuck.fly(), is("Show duck flying"));
    }
}