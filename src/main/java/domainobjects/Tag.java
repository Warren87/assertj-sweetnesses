package domainobjects;

import lombok.Data;

@Data
public class Tag {

    final String text;

    String group = "default";

}
