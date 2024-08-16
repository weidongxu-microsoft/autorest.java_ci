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
 * This is the base type that represents a filter. To configure a filter, do not directly instantiate an object of this
 * class. Instead, instantiate
 * an object of a derived class such as BoolEqualsFilter, NumberInFilter, StringEqualsFilter etc depending on the type
 * of the key based on
 * which you want to filter.
 */
@Fluent
public class Filter implements JsonSerializable<Filter> {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    FilterOperatorType operatorType;

    /*
     * The field/property in the event based on which you want to filter.
     */
    private String key;

    /**
     * Creates an instance of Filter class.
     */
    public Filter() {
        this.operatorType = FilterOperatorType.fromString("Filter");
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    public FilterOperatorType operatorType() {
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
     * @return the Filter object itself.
     */
    public Filter withKey(String key) {
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
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    void toJsonShared(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        jsonWriter.writeStringField("key", this.key);
    }

    /**
     * Reads an instance of Filter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Filter if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Filter.
     */
    public static Filter fromJson(JsonReader jsonReader) throws IOException {
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
                    return NumberInFilter.fromJson(readerToUse.reset());
                } else if ("NumberNotIn".equals(discriminatorValue)) {
                    return NumberNotInFilter.fromJson(readerToUse.reset());
                } else if ("NumberLessThan".equals(discriminatorValue)) {
                    return NumberLessThanFilter.fromJson(readerToUse.reset());
                } else if ("NumberGreaterThan".equals(discriminatorValue)) {
                    return NumberGreaterThanFilter.fromJson(readerToUse.reset());
                } else if ("NumberLessThanOrEquals".equals(discriminatorValue)) {
                    return NumberLessThanOrEqualsFilter.fromJson(readerToUse.reset());
                } else if ("NumberGreaterThanOrEquals".equals(discriminatorValue)) {
                    return NumberGreaterThanOrEqualsFilter.fromJson(readerToUse.reset());
                } else if ("BoolEquals".equals(discriminatorValue)) {
                    return BoolEqualsFilter.fromJson(readerToUse.reset());
                } else if ("StringIn".equals(discriminatorValue)) {
                    return StringInFilter.fromJson(readerToUse.reset());
                } else if ("StringNotIn".equals(discriminatorValue)) {
                    return StringNotInFilter.fromJson(readerToUse.reset());
                } else if ("StringBeginsWith".equals(discriminatorValue)) {
                    return StringBeginsWithFilter.fromJson(readerToUse.reset());
                } else if ("StringEndsWith".equals(discriminatorValue)) {
                    return StringEndsWithFilter.fromJson(readerToUse.reset());
                } else if ("StringContains".equals(discriminatorValue)) {
                    return StringContainsFilter.fromJson(readerToUse.reset());
                } else if ("NumberInRange".equals(discriminatorValue)) {
                    return NumberInRangeFilter.fromJson(readerToUse.reset());
                } else if ("NumberNotInRange".equals(discriminatorValue)) {
                    return NumberNotInRangeFilter.fromJson(readerToUse.reset());
                } else if ("StringNotBeginsWith".equals(discriminatorValue)) {
                    return StringNotBeginsWithFilter.fromJson(readerToUse.reset());
                } else if ("StringNotEndsWith".equals(discriminatorValue)) {
                    return StringNotEndsWithFilter.fromJson(readerToUse.reset());
                } else if ("StringNotContains".equals(discriminatorValue)) {
                    return StringNotContainsFilter.fromJson(readerToUse.reset());
                } else if ("IsNullOrUndefined".equals(discriminatorValue)) {
                    return IsNullOrUndefinedFilter.fromJson(readerToUse.reset());
                } else if ("IsNotNull".equals(discriminatorValue)) {
                    return IsNotNullFilter.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static Filter fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Filter deserializedFilter = new Filter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operatorType".equals(fieldName)) {
                    deserializedFilter.operatorType = FilterOperatorType.fromString(reader.getString());
                } else if ("key".equals(fieldName)) {
                    deserializedFilter.key = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFilter;
        });
    }
}
