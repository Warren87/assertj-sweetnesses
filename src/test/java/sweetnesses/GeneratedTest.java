package sweetnesses;

import com.google.gson.JsonPrimitive;
import domainobjects.Article;
import gson.JsonElementAssert;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static domainobjects.DomainAssertions.assertThat;

public class GeneratedTest {

    @Test
    public void assertionGenerators_emptyArticle(){
        Article article = new Article("Some title");

        assertThat(article)
                .hasNoTags()
                .hasTitle("Some title")
                .extracting(Article::getText)
                .isNull();
    }

    @Test
    public void assertionGenerators(){
        Article article = new Article("Some title");

        //assertThat(article)
          //      .titleIsBlank();

        Assertions.assertThat(article.getTitle()).isBlank();
    }

    @Test
    public void testThirdPartyLib(){
        JsonPrimitive jsonNumberValue = new JsonPrimitive(1);

        JsonElementAssert.assertThat(jsonNumberValue)
                .isJsonPrimitive()
                .isNotJsonArray()
                .isNotJsonNull()
                .hasAsInt(1);
    }

}
