package sweetnesses;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

public class AssumeTest {

    @Test
    public void shouldBeExecuted() throws IOException {
        Path textCaseFile = Path.of("./src/test/resources/test_case_1.txt");
        assumeThat(textCaseFile).exists();

        var content = readFileToString(textCaseFile.toFile(), UTF_8);

        assertThat(content).isEqualTo("Test should be executed");
    }


    @Test
    public void shouldNOTBeExecuted() throws IOException {
        Path textCaseFile = Path.of("./src/test/resources/test_case_2.txt");
        assumeThat(textCaseFile).exists();

        var content = readFileToString(textCaseFile.toFile(), UTF_8);

        assertThat(content).isEqualTo("THERE SHOULD BE AN ERROR! BUHAHAHAHA!");
    }
}
