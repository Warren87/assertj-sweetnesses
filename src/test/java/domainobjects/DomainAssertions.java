package domainobjects;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */

public class DomainAssertions {

  /**
   * Creates a new instance of <code>{@link domainobjects.ArticleAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static domainobjects.ArticleAssert assertThat(domainobjects.Article actual) {
    return new domainobjects.ArticleAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link domainobjects.ContentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static domainobjects.ContentAssert assertThat(domainobjects.Content actual) {
    return new domainobjects.ContentAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link domainobjects.TagAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static domainobjects.TagAssert assertThat(domainobjects.Tag actual) {
    return new domainobjects.TagAssert(actual);
  }

  /**
   * Creates a new <code>{@link DomainAssertions}</code>.
   */
  protected DomainAssertions() {
    // empty
  }
}
