package fixtures.clientdefaultvalue.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SkuName. */
public enum SkuName {
    /** Enum value standard. */
    STANDARD("standard"),

    /** Enum value premium. */
    PREMIUM("premium");

    /** The actual serialized value for a SkuName instance. */
    private final String value;

    SkuName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SkuName instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SkuName object, or null if unable to parse.
     */
    @JsonCreator
    public static SkuName fromString(String value) {
        SkuName[] items = SkuName.values();
        for (SkuName item : items) {
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
