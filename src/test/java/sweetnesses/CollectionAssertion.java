package sweetnesses;

import domainobjects.Article;
import domainobjects.Tag;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.IterableAssert;
import org.junit.Test;

import java.util.Set;

public class CollectionAssertion {

    @Test
    public void extractElementsPropertiesList(){

        Article firstArticle = new Article("Draft title");
        firstArticle.setTags(Set.of(new Tag("None"),new Tag("OK")));

        IterableAssert<Tag> tagIterableAssert = Assertions.assertThat(firstArticle.getTags());

        tagIterableAssert
                .extracting(Tag::getText)
                .containsOnlyOnce("None","OK");

        tagIterableAssert
                .extracting(Tag::getGroup)
                .containsOnlyOnce("default");
    }
}
