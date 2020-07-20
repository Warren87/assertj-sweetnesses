package domainobjects;

/**
 * Entry point for BDD assertions of different data types.
 */
public class DomainBddAssertions {

  /**
   * Creates a new instance of <code>{@link ArticleAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static ArticleAssert then(Article actual) {
    return new ArticleAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link ContentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static ContentAssert then(Content actual) {
    return new ContentAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link TagAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static TagAssert then(Tag actual) {
    return new TagAssert(actual);
  }

  /**
   * Creates a new <code>{@link DomainBddAssertions}</code>.
   */
  protected DomainBddAssertions() {
    // empty
  }
}
