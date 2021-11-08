package fixtures.bodystring.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Colors. */
public enum Colors {
    /** Enum value red color. */
    RED_COLOR("red color"),

    /** Enum value green-color. */
    GREEN_COLOR("green-color"),

    /** Enum value blue_color. */
    BLUE_COLOR("blue_color");

    /** The actual serialized value for a Colors instance. */
    private final String value;

    Colors(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Colors instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Colors object, or null if unable to parse.
     */
    @JsonCreator
    public static Colors fromString(String value) {
        Colors[] items = Colors.values();
        for (Colors item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
