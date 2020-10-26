import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

public class LowerCaseInputStreamShould {

  @Test
  void read_from_a_given_file_and_convert_chars_into_lower_case_chars()
      throws IOException {
    int c;
    StringBuilder stringBuilder = new StringBuilder();
    InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

    while((c = inputStream.read()) >= 0){
      stringBuilder.append((char)c);
    }

    inputStream.close();

    assertThat(stringBuilder.toString(), is("this is an example of decorator pattern"));
  }
}
