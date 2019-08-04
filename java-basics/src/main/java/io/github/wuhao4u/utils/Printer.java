package io.github.wuhao4u.utils;

import java.util.Map;
import java.util.stream.Collectors;

public class Printer {
    public static String convertWithStream(Map<?, ?> map) {
        String mapAsString = map.keySet().stream()
                .map(key -> key + "=" + map.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        return mapAsString;
    }
}
