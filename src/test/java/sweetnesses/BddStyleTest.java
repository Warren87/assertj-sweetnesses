package sweetnesses;

import domainobjects.Article;
import org.junit.Test;

import static domainobjects.DomainBddAssertions.then;


public class BddStyleTest {

    @Test
    public void assertionGenerators_emptyArticle() {
        Article article = new Article("Some title");

        then(article)
                .hasNoTags()
                .hasTitle("Some title")
                .extracting(Article::getText)
                .isNull();

    }

    @Test
    public void assertionGenerators() {
        Article article = new Article("Some title");

        then(article)
                .titleIsBlank();

    }
}
