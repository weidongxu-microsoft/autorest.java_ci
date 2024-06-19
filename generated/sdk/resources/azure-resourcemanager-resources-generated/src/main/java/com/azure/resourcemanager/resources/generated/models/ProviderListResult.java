// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderInner;
import java.io.IOException;
import java.util.List;

/**
 * List of resource providers.
 */
@Fluent
public final class ProviderListResult implements JsonSerializable<ProviderListResult> {
    /*
     * An array of resource providers.
     */
    private List<ProviderInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ProviderListResult class.
     */
    public ProviderListResult() {
    }

    /**
     * Get the value property: An array of resource providers.
     * 
     * @return the value value.
     */
    public List<ProviderInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of resource providers.
     * 
     * @param value the value value to set.
     * @return the ProviderListResult object itself.
     */
    public ProviderListResult withValue(List<ProviderInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProviderListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProviderListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProviderListResult.
     */
    public static ProviderListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProviderListResult deserializedProviderListResult = new ProviderListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ProviderInner> value = reader.readArray(reader1 -> ProviderInner.fromJson(reader1));
                    deserializedProviderListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedProviderListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProviderListResult;
        });
    }
}
