package representation;

import com.google.gson.Gson;
import org.assertj.core.presentation.StandardRepresentation;

public class JsonRepresentation extends StandardRepresentation {

    private static final Gson GSON = new Gson();

    @Override
    protected String fallbackToStringOf(Object object) {
        return GSON.toJson(object);
    }


}
