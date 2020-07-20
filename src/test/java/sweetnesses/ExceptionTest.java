package sweetnesses;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class ExceptionTest {

    @Test
    public void checkNoException() {
        assertThatCode(() -> throwRock())
                .withFailMessage("HIH")
                .doesNotThrowAnyException();
    }

    @Test
    public void codeWhichThrows() {

        assertThatCode(() -> throwRock())
                .isExactlyInstanceOf(RockException.class)
                .hasNoCause()
                .hasMessage("Nope");
    }


    private void throwRock() {
        throw new RockException();
    }

    private class RockException extends RuntimeException {
    }
}
