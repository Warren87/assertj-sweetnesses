package sweetnesses;

import domainobjects.Article;
import domainobjects.Content;
import domainobjects.DomainSoftAssertions;
import domainobjects.Tag;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.Set;

public class SoftAssertionTest {

    @Test
    public void shouldSoftlyAssertArticles() {

        Article firstArticle = new Article("Draft title");
        firstArticle.setTags(Set.of(new Tag("None")));
        firstArticle.setText(Content.html("Lorem ipsum"));

        Article secondArticle = new Article("Final title!");
        secondArticle.setTags(Set.of(new Tag("News"), new Tag("New York")));
        secondArticle.setText(Content.html("Tony Montana is still alive"));


        SoftAssertions.assertSoftly(assertions -> {
            assertions.assertThat(firstArticle.getTitle()).isEqualTo(secondArticle.getTitle());
            assertions.assertThat(firstArticle.getTags()).hasSameElementsAs(secondArticle.getTags());
            assertions.assertThat(firstArticle.getCreatedDateTime()).isEqualTo(secondArticle.getCreatedDateTime());
            assertions.assertThat(firstArticle.getText()).isEqualTo(secondArticle.getText());
        });
    }

    @Test
    public void shouldSoftlyAssertArticlesUsingCustomSoftAssertions() {

        Article firstArticle = new Article("Draft title");
        firstArticle.setTags(Set.of(new Tag("None")));
        firstArticle.setText(Content.html("Lorem ipsum"));

        Article secondArticle = new Article("Final title!");
        secondArticle.setTags(Set.of(new Tag("News"), new Tag("New York")));
        secondArticle.setText(Content.html("Tony Montana is still alive"));


        DomainSoftAssertions assertions = new DomainSoftAssertions();
        assertions.assertThat(firstArticle)
                .hasTitle(secondArticle.getTitle())
                .hasTags(secondArticle.getTags());

        assertions.assertThat(firstArticle.getText()).isEqualTo(secondArticle.getText());

        assertions.assertAll();
    }


}

