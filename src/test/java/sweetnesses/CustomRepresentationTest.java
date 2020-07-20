package sweetnesses;

import domainobjects.Article;
import domainobjects.Content;
import domainobjects.DomainSoftAssertions;
import domainobjects.Tag;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.IterableAssert;
import org.junit.Test;
import representation.JsonRepresentation;

import java.util.Set;

public class CustomRepresentationTest {

    @Test
    public void representation(){

        Article firstArticle = new Article("Draft title");
        firstArticle.setTags(Set.of(new Tag("None")));
        firstArticle.setText(Content.html("Lorem ipsum"));

        Article secondArticle = new Article("Final title!");
        secondArticle.setTags(Set.of(new Tag("News"), new Tag("New York")));
        secondArticle.setText(Content.html("Tony Montana is still alive"));


        DomainSoftAssertions assertions = new DomainSoftAssertions();
        assertions.assertThat(firstArticle)
                .withRepresentation(new JsonRepresentation())
                .hasTitle(secondArticle.getTitle())
                .hasTags(secondArticle.getTags());

        assertions.assertAll();
    }


}
