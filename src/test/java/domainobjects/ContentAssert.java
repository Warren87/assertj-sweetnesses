package domainobjects;

/**
 * {@link Content} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractContentAssert} instead.
 */

public class ContentAssert extends AbstractContentAssert<ContentAssert, Content> {

  /**
   * Creates a new <code>{@link ContentAssert}</code> to make assertions on actual Content.
   * @param actual the Content we want to make assertions on.
   */
  public ContentAssert(Content actual) {
    super(actual, ContentAssert.class);
  }

  /**
   * An entry point for ContentAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myContent)</code> and get specific assertion with code completion.
   * @param actual the Content we want to make assertions on.
   * @return a new <code>{@link ContentAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ContentAssert assertThat(Content actual) {
    return new ContentAssert(actual);
  }
}
