package domainobjects;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class Article {

    private final String title;

    private Content text;

    private LocalDateTime createdDateTime = LocalDateTime.now();

    Set<Tag> tags = new HashSet<>();

}
