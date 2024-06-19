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
import com.azure.resourcemanager.compute.generated.fluent.models.CapacityReservationGroupInner;
import java.io.IOException;
import java.util.List;

/**
 * The List capacity reservation group with resource group response.
 */
@Fluent
public final class CapacityReservationGroupListResult implements JsonSerializable<CapacityReservationGroupListResult> {
    /*
     * The list of capacity reservation groups
     */
    private List<CapacityReservationGroupInner> value;

    /*
     * The URI to fetch the next page of capacity reservation groups. Call ListNext() with this URI to fetch the next
     * page of capacity reservation groups.
     */
    private String nextLink;

    /**
     * Creates an instance of CapacityReservationGroupListResult class.
     */
    public CapacityReservationGroupListResult() {
    }

    /**
     * Get the value property: The list of capacity reservation groups.
     * 
     * @return the value value.
     */
    public List<CapacityReservationGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of capacity reservation groups.
     * 
     * @param value the value value to set.
     * @return the CapacityReservationGroupListResult object itself.
     */
    public CapacityReservationGroupListResult withValue(List<CapacityReservationGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of capacity reservation groups. Call ListNext() with
     * this URI to fetch the next page of capacity reservation groups.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of capacity reservation groups. Call ListNext() with
     * this URI to fetch the next page of capacity reservation groups.
     * 
     * @param nextLink the nextLink value to set.
     * @return the CapacityReservationGroupListResult object itself.
     */
    public CapacityReservationGroupListResult withNextLink(String nextLink) {
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
                .log(new IllegalArgumentException(
                    "Missing required property value in model CapacityReservationGroupListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CapacityReservationGroupListResult.class);

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
     * Reads an instance of CapacityReservationGroupListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapacityReservationGroupListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CapacityReservationGroupListResult.
     */
    public static CapacityReservationGroupListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapacityReservationGroupListResult deserializedCapacityReservationGroupListResult
                = new CapacityReservationGroupListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CapacityReservationGroupInner> value
                        = reader.readArray(reader1 -> CapacityReservationGroupInner.fromJson(reader1));
                    deserializedCapacityReservationGroupListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCapacityReservationGroupListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapacityReservationGroupListResult;
        });
    }
}
