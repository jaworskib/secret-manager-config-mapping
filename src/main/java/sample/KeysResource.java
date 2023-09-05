package sample;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.stream.Collectors;

@Path("/keys")
public class KeysResource {

    @Inject
    AbcXyzProperties properties;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String keys() {
        return properties.keys().stream()
            .map(AbcXyzProperties.Key::key)
            .collect(Collectors.joining(","));
    }
}
