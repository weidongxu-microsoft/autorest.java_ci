// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner;
import java.io.IOException;
import java.util.List;

/**
 * The List Availability Set operation response.
 */
@Fluent
public final class AvailabilitySetListResult implements JsonSerializable<AvailabilitySetListResult> {
    /*
     * The list of availability sets
     */
    private List<AvailabilitySetInner> value;

    /*
     * The URI to fetch the next page of AvailabilitySets. Call ListNext() with this URI to fetch the next page of
     * AvailabilitySets.
     */
    private String nextLink;

    /**
     * Creates an instance of AvailabilitySetListResult class.
     */
    public AvailabilitySetListResult() {
    }

    /**
     * Get the value property: The list of availability sets.
     * 
     * @return the value value.
     */
    public List<AvailabilitySetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of availability sets.
     * 
     * @param value the value value to set.
     * @return the AvailabilitySetListResult object itself.
     */
    public AvailabilitySetListResult withValue(List<AvailabilitySetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of AvailabilitySets. Call ListNext() with this URI to
     * fetch the next page of AvailabilitySets.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of AvailabilitySets. Call ListNext() with this URI to
     * fetch the next page of AvailabilitySets.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AvailabilitySetListResult object itself.
     */
    public AvailabilitySetListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property value in model AvailabilitySetListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AvailabilitySetListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailabilitySetListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailabilitySetListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AvailabilitySetListResult.
     */
    public static AvailabilitySetListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailabilitySetListResult deserializedAvailabilitySetListResult = new AvailabilitySetListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AvailabilitySetInner> value
                        = reader.readArray(reader1 -> AvailabilitySetInner.fromJson(reader1));
                    deserializedAvailabilitySetListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAvailabilitySetListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailabilitySetListResult;
        });
    }
}
