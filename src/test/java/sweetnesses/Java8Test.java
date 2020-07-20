package sweetnesses;

import domainobjects.Article;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class Java8Test {

    @Test
    public void optional() {
        Optional<String> opt = Optional.empty();

        assertThat(opt)
                .isNotPresent()
                .hasValue("");
    }


    @Test
    public void predicate() {
        Predicate<String> isNullable = a -> StringUtils.isBlank(a);

        assertThat(isNullable)
                .rejects("A", "HEllo", " 1 ", "   &&%#$&%")
                .accepts(null, "", "   ", "\t");

    }

    @Test
    public void supplier() {
        Supplier<Article>  articleCreation = () -> new Article("DEFAULT");

        assertThat(articleCreation)
                .extracting(Supplier::get)
                .isNotNull()
                .isEqualTo(new Article("DEFAULT"));

    }

    @Test
    public void localDateTime() {
        LocalDate today = LocalDate.now();

        assertThat(today)
                .isAfter("2020-07-10")
                .isBefore("2020-08-01")
                .isBetween("2020-07-10","2020-08-01");

    }

    @Test
    public void path() {
        assertThat(Path.of("./src/test/resources/test_case_1.txt"))
                .exists();
    }

}
