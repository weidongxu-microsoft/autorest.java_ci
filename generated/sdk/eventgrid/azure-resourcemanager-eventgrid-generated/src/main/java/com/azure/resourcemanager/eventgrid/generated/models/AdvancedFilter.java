// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This is the base type that represents an advanced filter. To configure an advanced filter, do not directly
 * instantiate an object of this class. Instead, instantiate an object of a derived class such as
 * BoolEqualsAdvancedFilter, NumberInAdvancedFilter, StringEqualsAdvancedFilter etc. depending on the type of the key
 * based on which you want to filter.
 */
@Fluent
public class AdvancedFilter implements JsonSerializable<AdvancedFilter> {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private AdvancedFilterOperatorType operatorType = AdvancedFilterOperatorType.fromString("AdvancedFilter");

    /*
     * The field/property in the event based on which you want to filter.
     */
    private String key;

    /**
     * Creates an instance of AdvancedFilter class.
     */
    public AdvancedFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    public AdvancedFilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the key property: The field/property in the event based on which you want to filter.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The field/property in the event based on which you want to filter.
     * 
     * @param key the key value to set.
     * @return the AdvancedFilter object itself.
     */
    public AdvancedFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        jsonWriter.writeStringField("key", this.key);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdvancedFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdvancedFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdvancedFilter.
     */
    public static AdvancedFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("operatorType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("NumberIn".equals(discriminatorValue)) {
                    return NumberInAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberNotIn".equals(discriminatorValue)) {
                    return NumberNotInAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberLessThan".equals(discriminatorValue)) {
                    return NumberLessThanAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberGreaterThan".equals(discriminatorValue)) {
                    return NumberGreaterThanAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberLessThanOrEquals".equals(discriminatorValue)) {
                    return NumberLessThanOrEqualsAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberGreaterThanOrEquals".equals(discriminatorValue)) {
                    return NumberGreaterThanOrEqualsAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("BoolEquals".equals(discriminatorValue)) {
                    return BoolEqualsAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringIn".equals(discriminatorValue)) {
                    return StringInAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringNotIn".equals(discriminatorValue)) {
                    return StringNotInAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringBeginsWith".equals(discriminatorValue)) {
                    return StringBeginsWithAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringEndsWith".equals(discriminatorValue)) {
                    return StringEndsWithAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringContains".equals(discriminatorValue)) {
                    return StringContainsAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberInRange".equals(discriminatorValue)) {
                    return NumberInRangeAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("NumberNotInRange".equals(discriminatorValue)) {
                    return NumberNotInRangeAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringNotBeginsWith".equals(discriminatorValue)) {
                    return StringNotBeginsWithAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringNotEndsWith".equals(discriminatorValue)) {
                    return StringNotEndsWithAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("StringNotContains".equals(discriminatorValue)) {
                    return StringNotContainsAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("IsNullOrUndefined".equals(discriminatorValue)) {
                    return IsNullOrUndefinedAdvancedFilter.fromJson(readerToUse.reset());
                } else if ("IsNotNull".equals(discriminatorValue)) {
                    return IsNotNullAdvancedFilter.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AdvancedFilter fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdvancedFilter deserializedAdvancedFilter = new AdvancedFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operatorType".equals(fieldName)) {
                    deserializedAdvancedFilter.operatorType = AdvancedFilterOperatorType.fromString(reader.getString());
                } else if ("key".equals(fieldName)) {
                    deserializedAdvancedFilter.key = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdvancedFilter;
        });
    }
}
