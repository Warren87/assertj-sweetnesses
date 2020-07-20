package sweetnesses;

import org.assertj.core.api.Assertions;

import java.io.File;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

public class Setup {

    public void config() {
        Assertions.setAllowComparingPrivateFields(true);
        Assertions.setAllowExtractingPrivateFields(true);
        Assertions.setExtractBareNamePropertyMethods(true);
        Assertions.setLenientDateParsing(true);
        Assertions.setMaxElementsForPrinting(10);
        Assertions.setMaxLengthForSingleLineDescription(80);
        Assertions.setRemoveAssertJRelatedElementsFromStackTrace(true);
    }

    public void helpers() {
        Assertions.contentOf(new File("abc"));
        Assertions.linesOf(new File("abc"));
        entry("key", "value");
    }
}
