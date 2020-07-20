package domainobjects;

/**
 * Entry point for soft assertions of different data types.
 */
public class DomainSoftAssertions extends org.assertj.core.api.SoftAssertions {

  /**
   * Creates a new "soft" instance of <code>{@link domainobjects.ArticleAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public domainobjects.ArticleAssert assertThat(domainobjects.Article actual) {
    return proxy(domainobjects.ArticleAssert.class, domainobjects.Article.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link domainobjects.ContentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public domainobjects.ContentAssert assertThat(domainobjects.Content actual) {
    return proxy(domainobjects.ContentAssert.class, domainobjects.Content.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link domainobjects.TagAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public domainobjects.TagAssert assertThat(domainobjects.Tag actual) {
    return proxy(domainobjects.TagAssert.class, domainobjects.Tag.class, actual);
  }

}
