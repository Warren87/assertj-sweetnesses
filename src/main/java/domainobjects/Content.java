package domainobjects;

import lombok.Data;

@Data
public class Content {

    public static Content html(String text) {
        return new Content(text, Type.HTML);
    }

    public static Content txt(String text) {
        return new Content(text, Type.TEXT_ONLY);
    }

    private final String text;

    private final Type type;

    enum Type{
        HTML, TEXT_ONLY
    }

}
