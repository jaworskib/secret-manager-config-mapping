package sample;

import io.smallrye.config.ConfigMapping;
import java.util.List;

@ConfigMapping(prefix = "abc.xyz")
public interface AbcXyzProperties {
    List<Key> keys();

    interface Key {
        String id();
        String key();
    }
}