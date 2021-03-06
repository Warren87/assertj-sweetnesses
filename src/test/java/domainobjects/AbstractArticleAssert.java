package domainobjects;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Article} specific assertions - Generated by CustomAssertionGenerator.
 */

public abstract class AbstractArticleAssert<S extends AbstractArticleAssert<S, A>, A extends Article> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractArticleAssert}</code> to make assertions on actual Article.
   * @param actual the Article we want to make assertions on.
   */
  protected AbstractArticleAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Article's tags contains the given Tag elements.
   * @param tags the given elements that should be contained in actual Article's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags does not contain all given Tag elements.
   */
  public S hasTags(Tag... tags) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // check that given Tag varargs is not null.
    if (tags == null) failWithMessage("Expecting tags parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getTags(), tags);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article's tags contains the given Tag elements in Collection.
   * @param tags the given elements that should be contained in actual Article's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags does not contain all given Tag elements.
   */
  public S hasTags(java.util.Collection<? extends Tag> tags) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // check that given Tag collection is not null.
    if (tags == null) {
      failWithMessage("Expecting tags parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getTags(), tags.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article's tags contains <b>only</b> the given Tag elements and nothing else in whatever order.
   * @param tags the given elements that should be contained in actual Article's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags does not contain all given Tag elements.
   */
  public S hasOnlyTags(Tag... tags) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // check that given Tag varargs is not null.
    if (tags == null) failWithMessage("Expecting tags parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getTags(), tags);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article's tags contains <b>only</b> the given Tag elements in Collection and nothing else in whatever order.
   * @param tags the given elements that should be contained in actual Article's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags does not contain all given Tag elements.
   */
  public S hasOnlyTags(java.util.Collection<? extends Tag> tags) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // check that given Tag collection is not null.
    if (tags == null) {
      failWithMessage("Expecting tags parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getTags(), tags.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article's tags does not contain the given Tag elements.
   *
   * @param tags the given elements that should not be in actual Article's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags contains any given Tag elements.
   */
  public S doesNotHaveTags(Tag... tags) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // check that given Tag varargs is not null.
    if (tags == null) failWithMessage("Expecting tags parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getTags(), tags);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article's tags does not contain the given Tag elements in Collection.
   *
   * @param tags the given elements that should not be in actual Article's tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags contains any given Tag elements.
   */
  public S doesNotHaveTags(java.util.Collection<? extends Tag> tags) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // check that given Tag collection is not null.
    if (tags == null) {
      failWithMessage("Expecting tags parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getTags(), tags.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article has no tags.
   * @return this assertion object.
   * @throws AssertionError if the actual Article's tags is not empty.
   */
  public S hasNoTags() {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have tags but had :\n  <%s>";

    // check
    if (actual.getTags().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getTags());
    }

    // return the current assertion for method chaining
    return myself;
  }


  /**
   * Verifies that the actual Article's text is equal to the given one.
   * @param text the given text to compare the actual Article's text to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Article's text is not equal to the given one.
   */
  public S hasText(Content text) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting text of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Content actualText = actual.getText();
    if (!Objects.areEqual(actualText, text)) {
      failWithMessage(assertjErrorMessage, actual, text, actualText);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Article's title is equal to the given one.
   * @param title the given title to compare the actual Article's title to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Article's title is not equal to the given one.
   */
  public S hasTitle(String title) {
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTitle = actual.getTitle();
    if (!Objects.areEqual(actualTitle, title)) {
      failWithMessage(assertjErrorMessage, actual, title, actualTitle);
    }

    // return the current assertion for method chaining
    return myself;
  }

  public S titleIsBlank(){
    // check that actual Article we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be blank \nbut was:\n  <%s>";

    // null safe check
    String actualTitle = actual.getTitle();
    if (actualTitle != null && !actualTitle.isBlank()) {
      failWithMessage(assertjErrorMessage, actual, actualTitle);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
