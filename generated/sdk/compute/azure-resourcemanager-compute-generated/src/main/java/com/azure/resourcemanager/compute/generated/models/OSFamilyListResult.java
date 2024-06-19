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
import com.azure.resourcemanager.compute.generated.fluent.models.OSFamilyInner;
import java.io.IOException;
import java.util.List;

/**
 * The list operation result.
 */
@Fluent
public final class OSFamilyListResult implements JsonSerializable<OSFamilyListResult> {
    /*
     * The list of resources.
     */
    private List<OSFamilyInner> value;

    /*
     * The URI to fetch the next page of resources. Use this to get the next page of resources. Do this till nextLink is
     * null to fetch all the resources.
     */
    private String nextLink;

    /**
     * Creates an instance of OSFamilyListResult class.
     */
    public OSFamilyListResult() {
    }

    /**
     * Get the value property: The list of resources.
     * 
     * @return the value value.
     */
    public List<OSFamilyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of resources.
     * 
     * @param value the value value to set.
     * @return the OSFamilyListResult object itself.
     */
    public OSFamilyListResult withValue(List<OSFamilyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OSFamilyListResult object itself.
     */
    public OSFamilyListResult withNextLink(String nextLink) {
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
                .log(new IllegalArgumentException("Missing required property value in model OSFamilyListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OSFamilyListResult.class);

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
     * Reads an instance of OSFamilyListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSFamilyListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OSFamilyListResult.
     */
    public static OSFamilyListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSFamilyListResult deserializedOSFamilyListResult = new OSFamilyListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OSFamilyInner> value = reader.readArray(reader1 -> OSFamilyInner.fromJson(reader1));
                    deserializedOSFamilyListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOSFamilyListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOSFamilyListResult;
        });
    }
}
